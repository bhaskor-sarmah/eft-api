package com.bohniman.eftapi.service;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.imageio.ImageIO;

import com.bohniman.eftapi.model.TransBiometricDetails;
import com.bohniman.eftapi.model.TransBiometricTemplate;
import com.bohniman.eftapi.model.TransNotification;
import com.bohniman.eftapi.model.TransSuspect;
import com.bohniman.eftapi.model.TransSuspectAddress;
import com.bohniman.eftapi.model.TransSuspectDoc;
import com.bohniman.eftapi.model.TransSuspectFamily;
import com.bohniman.eftapi.payload.DocIdPayload;
import com.bohniman.eftapi.payload.SuspectIdPayload;
import com.bohniman.eftapi.repository.AddressTypeRepository;
import com.bohniman.eftapi.repository.BiometricRepository;
import com.bohniman.eftapi.repository.BiometricTemplateRepository;
import com.bohniman.eftapi.repository.CountryRepository;
import com.bohniman.eftapi.repository.CurrentStatusRepository;
import com.bohniman.eftapi.repository.DistrictRepository;
import com.bohniman.eftapi.repository.EmploymentTypeRepository;
import com.bohniman.eftapi.repository.GenderRepository;
import com.bohniman.eftapi.repository.MaritalStatusRepository;
import com.bohniman.eftapi.repository.NotificationRepository;
import com.bohniman.eftapi.repository.OccupationRepository;
import com.bohniman.eftapi.repository.PoliceCaseStatusRepository;
import com.bohniman.eftapi.repository.RelationRepository;
import com.bohniman.eftapi.repository.RouteRepository;
import com.bohniman.eftapi.repository.StateRepository;
import com.bohniman.eftapi.repository.SuspectAddressRepository;
import com.bohniman.eftapi.repository.SuspectDocRepository;
import com.bohniman.eftapi.repository.SuspectDocumentRepository;
import com.bohniman.eftapi.repository.SuspectFamilyRepository;
import com.bohniman.eftapi.repository.SuspectRepository;
import com.bohniman.eftapi.repository.ThanaRepository;
import com.bohniman.eftapi.repository.VillageRepository;
import com.bohniman.eftapi.request.AddressRequest;
import com.bohniman.eftapi.request.BiometricForm;
import com.bohniman.eftapi.request.FamilyRequest;
import com.bohniman.eftapi.request.NewDocForm;
import com.bohniman.eftapi.request.NewSuspectForm;
import com.bohniman.eftapi.request.SuspectRequest;
import com.bohniman.eftapi.response.Acknowledge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sun.misc.BASE64Decoder;

@Service
public class SuspectService {

	@Autowired
	SuspectRepository suspectRepository;

	@Autowired
	SuspectAddressRepository suspectAddressRepository;

	@Autowired
	SuspectFamilyRepository suspectFamilyRepository;

	@Autowired
	CurrentStatusRepository currentStatusRepository;

	@Value("${app.file-upload}")
	private String UPLOADED_FOLDER;

	@Autowired
	GenderRepository genderRepository;

	@Autowired
	MaritalStatusRepository maritalStatusRepository;

	@Autowired
	OccupationRepository occupationRepository;

	@Autowired
	EmploymentTypeRepository employmentTypeRepository;

	@Autowired
	CountryRepository countryRepository;

	@Autowired
	RouteRepository routeRepository;

	@Autowired
	StateRepository stateRepository;

	@Autowired
	DistrictRepository districtRepository;

	@Autowired
	ThanaRepository thanaRepository;

	@Autowired
	RelationRepository relationRepository;

	@Autowired
	AddressTypeRepository addressTypeRepository;

	@Autowired
	VillageRepository villageRepository;

	@Autowired
	PoliceCaseStatusRepository policeCaseStatusRepository;

	@Autowired
	SuspectDocumentRepository documentRepository;

	@Autowired
	SuspectDocRepository suspectDocRepository;

	@Autowired
	BiometricRepository biometricRepository;
	@Autowired
	BiometricTemplateRepository biometricTemplateRepository;
	@Autowired
	NotificationRepository notificationRepository;

	public String saveImageFile(byte[] imgfile, String fileName, String suspectId) throws IOException {

//		BASE64Decoder decoder = new BASE64Decoder();
//		byte[] decodedBytes = decoder.decodeBuffer(photo);

		// buffered image from the decoded bytes
		BufferedImage image = null;
		try {
			image = ImageIO.read(new ByteArrayInputStream(imgfile));
		} catch (Exception e) {

		}

		if (image == null) {
			System.out.println("Exception: " + fileName + " not found");
		}

		Path path = Paths.get(UPLOADED_FOLDER + suspectId);
		if (!Files.exists(path)) {
			try {
				Files.createDirectories(path);
			} catch (IOException e) {
				// fail to create directory
				e.printStackTrace();
			}
		}

		File file = new File(path + "/" + fileName + ".jpg");

		// write the image
		ImageIO.write(image, "jpg", file);

		return file.toString();
	}

	public byte[] getBytesFromString(String iamge) throws IOException {
		BASE64Decoder decoder = new BASE64Decoder();
		byte[] decodedBytes = decoder.decodeBuffer(iamge);
		return decodedBytes;
	}

	@Transactional(rollbackFor = { Exception.class })
	public Acknowledge saveSuspect(NewSuspectForm newSuspectForm) {

		ArrayList<AddressRequest> addressReqList = newSuspectForm.getAddress();
		ArrayList<FamilyRequest> familyReqList = newSuspectForm.getFamily();

		try {
			TransSuspect suspect = suspectRepository.findByOfflineId(newSuspectForm.getSuspect().getOfflineId());
			if (null != suspect) {
				return new Acknowledge("1", "Suspect data synced to central server",
						new SuspectIdPayload(suspect.getSuspectId(), suspect.getOfflineId()));
			} else {
				suspect = mapSuspect(newSuspectForm.getSuspect());
				ArrayList<TransSuspectAddress> addressList = new ArrayList<TransSuspectAddress>();
				ArrayList<TransSuspectFamily> familyList = new ArrayList<TransSuspectFamily>();

				suspect = suspectRepository.save(suspect);

				for (AddressRequest addressReq : addressReqList) {
					addressList.add(mapSuspectAddress(addressReq, suspect));
				}

				for (FamilyRequest familyReq : familyReqList) {
					familyList.add(mapSuspectFamily(familyReq, suspect));
				}

				suspectFamilyRepository.saveAll(familyList);
				suspectAddressRepository.saveAll(addressList);

				String path = saveImageFile(newSuspectForm.getPhoto(), suspect.getSuspectId(), suspect.getSuspectId());
				suspect.setPhotoPath(path);
				suspectRepository.save(suspect);

				return new Acknowledge("1", "New suspect synced to central server",
						new SuspectIdPayload(suspect.getSuspectId(), suspect.getOfflineId()));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return new Acknowledge("0", "Sync failed");
		}
	}

	public void addFreshNotification(TransSuspect suspect) {
		TransNotification notification = new TransNotification();
		notification.setTarget("NEW FRESH CASE");
		notification.setTargetPath("page-spd-suspects/fresh-case");
		notification.setRoleTo("spd"); // spd - From whom this communication started (spd is in small latter)
		notification.setIsViewed(false);
		notification.setSuspect(suspect);
		notification.setCurrentStatus(currentStatusRepository.findByCurrentStatusCode("01")); // Active
		notification.setRemarks(suspect.getSuspectThana().getThanaName()); // Thana name will be displayed in
																			// notification
		notificationRepository.save(notification);
	}

	public TransSuspect mapSuspect(SuspectRequest suspectReq) throws ParseException {
		TransSuspect suspect = new TransSuspect();
		suspect.setRecordType("Live");
		suspect.setInitiatedBy("IO");
		suspect.setOfflineId(suspectReq.getOfflineId());
		suspect.setFirstName(suspectReq.getFirstName());
		suspect.setMiddleName(suspectReq.getMiddleName());
		suspect.setLastName(suspectReq.getLastName());
		suspect.setAliasName(suspectReq.getAliasName());
		suspect.setFatherName(suspectReq.getFatherName());
		suspect.setMotherName(suspectReq.getMotherName());
		suspect.setGender(genderRepository.findByGenderCode(suspectReq.getFkGenderCode()));
		suspect.setMaritalStatus(maritalStatusRepository.findByMaritalStatusCode(suspectReq.getFkMaritalStatusCode()));
		suspect.setOccupation(occupationRepository.findByOccupationCode(suspectReq.getFkOccupationCode()));
		suspect.setInitiatedBy(suspectReq.getInitiatedBy());
		suspect.setWitness1(suspectReq.getWitness1());
		suspect.setWitness2(suspectReq.getWitness2());
		suspect.setAge(suspectReq.getAge());
		suspect.setDateOfBirth(DateService.getFormattedDate(suspectReq.getDateOfBirth()));
		suspect.setPlaceOfBirth(suspectReq.getPlaceOfBirth());
		suspect.setEmail(suspectReq.getEmail());
		suspect.setMobileNo(suspectReq.getMobileNo());
		suspect.setIsEmployed(suspectReq.getIsEmployed());
		suspect.setEmploymentType(
				employmentTypeRepository.findByEmploymentTypeCode(suspectReq.getFkEmploymentTypeCode()));
		suspect.setEmployerName(suspectReq.getEmployerName());
		suspect.setIsVoter(suspectReq.getIsVoter());
		suspect.setWhenIncludedInEr(suspectReq.getWhenIncludedInEr());
		suspect.setEpicNo(suspectReq.getEpicNo());
		suspect.setPartNo(suspectReq.getPartNo());
		suspect.setPartName(suspectReq.getPartName());
		suspect.setHeight(suspectReq.getHeight());
		suspect.setHair(suspectReq.getHair());
		suspect.setEye(suspectReq.getEye());
		suspect.setComplexion(suspectReq.getComplexion());
		suspect.setIdentificationMark(suspectReq.getIdentificationMark());
		suspect.setHasForeignPassport(suspectReq.getHasForeignPassport());
		suspect.setForeignCountry(countryRepository.findByCountryCode(suspectReq.getFkForeignCountryCode()));
		suspect.setForeignPassportDetails(suspectReq.getForeignPassportDetails());
		suspect.setHasLandHouse(suspectReq.getHasLandHouse());
		suspect.setLandHouseFrom(suspectReq.getLandHouseFrom());
		suspect.setLandHouseDagNo(suspectReq.getLandHouseDetails());
		suspect.setLandHousePattaNo(suspectReq.getLandHousePattaNo());
		suspect.setLandHouseDetails(suspectReq.getLandHouseDetails());
		suspect.setSinceWhenStaying(suspectReq.getSinceWhenStaying());
		suspect.setImmigrationRoute(routeRepository.findByRouteCode(suspectReq.getFkRouteCode()));
		suspect.setSuspectState(stateRepository.findByStateCode(suspectReq.getFkSuspectStateCode()));
		suspect.setSuspectDistrict(districtRepository.findByDistrictCode(suspectReq.getFkSuspectDistrictCode()));
		suspect.setSuspectThana(thanaRepository.findByThanaCode(suspectReq.getFkSuspectThanaCode()));
		suspect.setDeviceId(suspectReq.getDeviceId());
		suspect.setCapturedAt(DateService.getFormattedDate(suspectReq.getCapturedAt()));
		suspect.setCapturedBy(suspectReq.getCapturedBy());
		suspect.setCapturedLocLat(suspectReq.getCapturedLocLat());
		suspect.setCapturedLocLong(suspectReq.getCapturedLocLong());

		// Biometric and Doc available
		// Current status will be Inactive

		if (suspectReq.isHasDoc()) {
			suspect.setDocFlag("Available");
		} else {
			suspect.setDocFlag("Not Available");
		}

		if (suspectReq.isHasBio()) {
			suspect.setBioFlag("Available");
		} else {
			suspect.setBioFlag("Not Available");
		}

		if (suspectReq.isHasBio() || suspectReq.isHasDoc()) {
			suspect.setCurrentStatus(currentStatusRepository.findByCurrentStatusCode("02"));
		} else {
			suspect.setCurrentStatus(currentStatusRepository.findByCurrentStatusCode("01"));
		}
		suspect.setPoliceCaseStatus(policeCaseStatusRepository.findByCaseStatusCode("01"));
		return suspect;
	}

	public TransSuspectAddress mapSuspectAddress(AddressRequest addressReq, TransSuspect suspect)
			throws ParseException {
		TransSuspectAddress address = new TransSuspectAddress();

		/*** Reference from suspect **********/
		address.setSuspect(suspect);
		address.setCurrentStatus(currentStatusRepository.findByCurrentStatusCode("01"));
		address.setSuspectState(suspect.getSuspectState());
		address.setSuspectDistrict(suspect.getSuspectDistrict());
		address.setSuspectThana(suspect.getSuspectThana());
		/*** Reference from suspect **********/

		address.setAddressType(addressTypeRepository.findByAddressTypeCode(addressReq.getFkAddressTypeCode()));
		address.setOfflineId(addressReq.getOfflineId());
		
		//Save country code as Others if not India
		if (addressReq.getFkCountryCode().equals("91") || addressReq.getFkCountryCode().equals("00")) {
			address.setCountry(countryRepository.findByCountryCode(addressReq.getFkCountryCode()));
			address.setOtherCountry(addressReq.getOtherCountry());
		} else {
			address.setCountry(countryRepository.findByCountryCode("00"));
			address.setOtherCountry(
					countryRepository.findByCountryCode(addressReq.getFkCountryCode()).getCountryName());
		}

		//Save sate code as Others if not Assam and country is India
		if (addressReq.getFkStateCode().equals("18") || addressReq.getFkStateCode().equals("99") || addressReq.getFkStateCode().equals("00")) {
			address.setState(stateRepository.findByStateCode(addressReq.getFkStateCode()));
			address.setOtherState(addressReq.getOtherState());
		} else {
			address.setState(stateRepository.findByStateCode("99"));
			address.setOtherState(stateRepository.findByStateCode(addressReq.getFkStateCode()).getStateName());
		}
		
		
		address.setDistrict(districtRepository.findByDistrictCode(addressReq.getFkDistrictCode()));
		address.setOtherDistrict(addressReq.getOtherDistrict());
		address.setThana(thanaRepository.findByThanaCode(addressReq.getFkThanaCode()));
		address.setOtherThana(addressReq.getOtherThana());
		address.setVillage(villageRepository.findByVillageCode(addressReq.getFkVillageCode()));
		address.setOtherVillage(addressReq.getOtherVillage());
		address.setLatitude(addressReq.getLatitude());
		address.setLongitude(addressReq.getLongitude());
		address.setPostOffice(addressReq.getPostOffice());
		address.setPinCode(addressReq.getPinCode());
		address.setHouseNo(addressReq.getHouseNo());
		address.setHouseOwnerName(addressReq.getHouseOwnerName());
		address.setHouseOwnerPhoneNo(addressReq.getHouseOwnerPhoneNo());
		address.setVillageHeadName(addressReq.getVillageHeadName());
		address.setVillageHeadPhoneNo(addressReq.getVillageHeadPhoneNo());
		address.setRevenueVillageName(addressReq.getRevenueVillageName());
		address.setDeviceId(addressReq.getDeviceId());
		address.setIpAddress(addressReq.getIpAddress());
		address.setCapturedAt(DateService.getFormattedDate(addressReq.getCapturedAt()));
		address.setCapturedBy(addressReq.getCapturedBy());
		return address;
	}

	public TransSuspectFamily mapSuspectFamily(FamilyRequest familyReq, TransSuspect suspect) throws ParseException {
		TransSuspectFamily family = new TransSuspectFamily();

		/*** Reference from suspect **********/
		family.setSuspect(suspect);
		family.setCurrentStatus(currentStatusRepository.findByCurrentStatusCode("01"));
		family.setSuspectState(suspect.getSuspectState());
		family.setSuspectDistrict(suspect.getSuspectDistrict());
		family.setSuspectThana(suspect.getSuspectThana());
		/*** Reference from suspect **********/

		family.setOfflineId(familyReq.getOfflineId());
		family.setRelation(relationRepository.findByRelationCode(familyReq.getFkRelationCode()));
		family.setMemberName(familyReq.getMemberName());
		family.setGender(genderRepository.findByGenderCode(familyReq.getFkGenderCode()));
		family.setDateOfBirth(DateService.getFormattedDate(familyReq.getDateOfBirth()));
		family.setAge(familyReq.getAge());
		family.setPlaceOfBirth(familyReq.getPlaceOfBirth());
		family.setDeviceId(familyReq.getDeviceId());
		family.setIpAddress(familyReq.getIpAddress());
		family.setCapturedAt(DateService.getFormattedDate(familyReq.getCapturedAt()));
		family.setCapturedBy(familyReq.getCapturedBy());
		return family;
	}

	public String getFormattedDateTimeWithMilliseconds(Date date) {
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd_HHmmssSSS");
		return df.format(date);
	}

//	@Transactional(rollbackFor = { Exception.class })
	public Acknowledge saveDocument(NewDocForm docForm) {
		String docId = docForm.getDocId(); // offline pk

		TransSuspect suspect = suspectRepository.findBySuspectId(docForm.getFkSuspectId());
		try {

			TransSuspectDoc doc = new TransSuspectDoc();
			doc.setDocId(null);
			doc.setSuspect(suspect);
			doc.setOfflineId(docForm.getOfflineId());
			doc.setDocument(documentRepository.findByDocCode(docForm.getFkDocCode()));
			doc.setOtherDocument(docForm.getOtherDocument());
			doc.setDocDetails(docForm.getDocDetails());
			doc.setCapturedAt(DateService.getFormattedDate(docForm.getCapturedAt()));
			doc.setCapturedBy(docForm.getCapturedBy());
			doc.setCurrentStatus(currentStatusRepository.findByCurrentStatusCode("01"));
			doc.setSuspectState(stateRepository.findByStateCode(docForm.getFkSuspectStateCode()));
			doc.setSuspectDistrict(districtRepository.findByDistrictCode(docForm.getFkSuspectDistrictCode()));
			doc.setSuspectThana(thanaRepository.findByThanaCode(docForm.getFkSuspectThanaCode()));
			doc = suspectDocRepository.save(doc);

			Thread.sleep(1);
			String timeStamp = getFormattedDateTimeWithMilliseconds(new Date());
			String docPath = saveImageFile(docForm.getDoc(),
					doc.getSuspect().getSuspectId() + "_" + docForm.getFkDocCode() + "_" + timeStamp,
					doc.getSuspect().getSuspectId());

			doc.setDocPath(docPath);
			suspectDocRepository.save(doc);

			// If document upload completed, i.e., no. of doc = no. of saved doc
			// Update doc flag
			if (docForm.getNoOfDocuments() == suspectDocRepository.countBySuspect(suspect)) {
				suspect.setDocFlag("Uploaded");
				suspect = suspectRepository.save(suspect);
			}

			// If any bio and doc uploaded, then set current status Active
			Boolean isActive = true;
			if (suspect.getDocFlag().equalsIgnoreCase("Available")
					|| suspect.getBioFlag().equalsIgnoreCase("Available")) {
				isActive = false;
			}

			if (isActive) {
				suspect.setCurrentStatus(currentStatusRepository.findByCurrentStatusCode("01"));
				suspect = suspectRepository.save(suspect);
				// Add Notification
				addFreshNotification(suspect);
			}
			return new Acknowledge("1", "Document Synced successfully", new DocIdPayload(docId));
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return new Acknowledge("0", "Sync failed", new DocIdPayload(docId));
		}
	}

	@Transactional(rollbackFor = { Exception.class })
	public Acknowledge saveBiometric(BiometricForm biometricForm) {

		TransBiometricDetails biometric = biometricRepository.findBySuspect_suspectId(biometricForm.getFkSuspectId());
		TransBiometricTemplate template = biometricTemplateRepository
				.findBySuspect_suspectId(biometricForm.getFkSuspectId());

		TransSuspect suspect = suspectRepository.findBySuspectId(biometricForm.getFkSuspectId());

		if (null == biometric) {
			System.out.println("biometricForm suspect : " + biometricForm.getFkSuspectId());
			biometric = new TransBiometricDetails();

			biometric.setSuspect(suspect);
			biometric.setOfflineId(biometricForm.getOfflineId());

		}
		if (null == template) {
			template = new TransBiometricTemplate();
			template.setSuspect(suspect);
			template.setOfflineId(biometricForm.getOfflineId());
		}
		String path = null;
		try {
			if (biometricForm.isLeftThumbFlag()) {
				path = saveImageFile(biometricForm.getLeftThumb(), biometricForm.getFkSuspectId() + "_LEFT_THUMB",
						biometricForm.getFkSuspectId());
				biometric.setLeftThumbPath(path);
				template.setLeftThumbTmpl(getBytesFromString(biometricForm.getLeftThumbTmpl()));
			}
			if (biometricForm.isLeftIndexFlag()) {
				path = saveImageFile(biometricForm.getLeftIndex(), biometricForm.getFkSuspectId() + "_LEFT_INDEX",
						biometricForm.getFkSuspectId());
				biometric.setLeftIndexPath(path);
				template.setLeftIndexTmpl(getBytesFromString(biometricForm.getLeftIndexTmpl()));
			}
			if (biometricForm.isLeftMiddleFlag()) {

				path = saveImageFile(biometricForm.getLeftMiddle(), biometricForm.getFkSuspectId() + "_LEFT_MIDDLE",
						biometricForm.getFkSuspectId());
				biometric.setLeftMiddlePath(path);
				template.setLeftMiddleTmpl(getBytesFromString(biometricForm.getLeftMiddleTmpl()));
			}
			if (biometricForm.isLeftRingFlag()) {
				path = saveImageFile(biometricForm.getLeftRing(), biometricForm.getFkSuspectId() + "_LEFT_RING",
						biometricForm.getFkSuspectId());
				biometric.setLeftRingPath(path);
				template.setLeftRingTmpl(getBytesFromString(biometricForm.getLeftRingTmpl()));
			}
			if (biometricForm.isLeftLittleFlag()) {
				path = saveImageFile(biometricForm.getLeftLittle(), biometricForm.getFkSuspectId() + "_LEFT_LITTLE",
						biometricForm.getFkSuspectId());
				biometric.setLeftLittlePath(path);
				template.setLeftLittleTmpl(getBytesFromString(biometricForm.getLeftLittleTmpl()));
			}
			if (biometricForm.isRightThumbFlag()) {
				path = saveImageFile(biometricForm.getRightThumb(), biometricForm.getFkSuspectId() + "_RIGHT_THUMB",
						biometricForm.getFkSuspectId());
				biometric.setRightThumbPath(path);
				template.setRightThumbTmpl(getBytesFromString(biometricForm.getRightThumbTmpl()));
			}
			if (biometricForm.isRightIndexFlag()) {
				path = saveImageFile(biometricForm.getRightIndex(), biometricForm.getFkSuspectId() + "_RIGHT_INDEX",
						biometricForm.getFkSuspectId());
				biometric.setRightIndexPath(path);
				template.setRightIndexTmpl(getBytesFromString(biometricForm.getRightIndexTmpl()));
			}
			if (biometricForm.isRightMiddleFlag()) {
				path = saveImageFile(biometricForm.getRightMiddle(), biometricForm.getFkSuspectId() + "_RIGHT_MIDDLE",
						biometricForm.getFkSuspectId());
				biometric.setRightMiddlePath(path);
				template.setRightMiddleTmpl(getBytesFromString(biometricForm.getRightMiddleTmpl()));
			}
			if (biometricForm.isRightRingFlag()) {
				path = saveImageFile(biometricForm.getRightRing(), biometricForm.getFkSuspectId() + "_RIGHT_RING",
						biometricForm.getFkSuspectId());
				biometric.setRightRingPath(path);
				template.setRightRingTmpl(getBytesFromString(biometricForm.getRightRingTmpl()));
			}
			if (biometricForm.isRightLittleFlag()) {
				path = saveImageFile(biometricForm.getRightLittle(), biometricForm.getFkSuspectId() + "_RIGHT_LITTLE",
						biometricForm.getFkSuspectId());
				biometric.setRightLittlePath(path);
				template.setRightLittleTmpl(getBytesFromString(biometricForm.getRightLittleTmpl()));
			}
			if (biometricForm.isLeftIrisFlag()) {
				path = saveImageFile(biometricForm.getLeftIris(), biometricForm.getFkSuspectId() + "_LEFT_IRIS",
						biometricForm.getFkSuspectId());
//				System.out.println(path);
				biometric.setLeftIrisPath(path);
				template.setLeftIrisTmpl(getBytesFromString(biometricForm.getLeftIrisTmpl()));
			}
			if (biometricForm.isRightIrisFlag()) {
				path = saveImageFile(biometricForm.getRightIris(), biometricForm.getFkSuspectId() + "_RIGHT_IRIS",
						biometricForm.getFkSuspectId());
//				System.out.println(path);
				biometric.setRightIrisPath(path);
				template.setRightIrisTmpl(getBytesFromString(biometricForm.getRightIrisTmpl()));
			}
			biometricRepository.save(biometric);
			biometricTemplateRepository.save(template);

			// Update bio flag
			suspect.setBioFlag("Uploaded");
			suspectRepository.save(suspect);

			Boolean isActive = true;
			if (suspect.getDocFlag().equalsIgnoreCase("Available")
					|| suspect.getBioFlag().equalsIgnoreCase("Available")) {
				isActive = false;
			}

			if (isActive) {
				suspect.setCurrentStatus(currentStatusRepository.findByCurrentStatusCode("01"));
				suspect = suspectRepository.save(suspect);
				// Add Notification
				addFreshNotification(suspect);
			}

			return new Acknowledge("1", "Biometric Synced successfully",
					new SuspectIdPayload(biometricForm.getFkSuspectId(), biometric.getOfflineId()));
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return new Acknowledge("0", "Sync failed",
					new SuspectIdPayload(biometricForm.getFkSuspectId(), biometric.getOfflineId()));
		}

	}

}
