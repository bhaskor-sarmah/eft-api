package com.bohniman.eftapi.service;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;

import javax.imageio.ImageIO;

import com.bohniman.eftapi.model.MasterCurrentStatus;
import com.bohniman.eftapi.model.TransCommunication;
import com.bohniman.eftapi.model.TransNotification;
import com.bohniman.eftapi.model.TransSuspect;
import com.bohniman.eftapi.model.TransSuspectDoc;
import com.bohniman.eftapi.model.User;
import com.bohniman.eftapi.payload.CommunicationPayload;
import com.bohniman.eftapi.repository.CommunicationRepository;
import com.bohniman.eftapi.repository.CommunicationTypeRepository;
import com.bohniman.eftapi.repository.CurrentStatusRepository;
import com.bohniman.eftapi.repository.DistrictRepository;
import com.bohniman.eftapi.repository.NotificationRepository;
import com.bohniman.eftapi.repository.PoliceCaseStatusRepository;
import com.bohniman.eftapi.repository.StateRepository;
import com.bohniman.eftapi.repository.SuspectDocRepository;
import com.bohniman.eftapi.repository.SuspectDocumentRepository;
import com.bohniman.eftapi.repository.SuspectRepository;
import com.bohniman.eftapi.repository.ThanaRepository;
import com.bohniman.eftapi.repository.UserRepository;
import com.bohniman.eftapi.request.CommunicationForm;
import com.bohniman.eftapi.request.NewDocForm;
import com.bohniman.eftapi.response.Acknowledge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CommunicationService {

	@Autowired
	UserRepository userRepository;

	@Autowired
	CommunicationRepository communicationRepository;

	@Autowired
	CommunicationTypeRepository communicationTypeRepository;

	@Autowired
	CurrentStatusRepository currentStatusRepository;

	@Autowired
	SuspectRepository suspectRepository;

	@Autowired
	ThanaRepository thanaRepository;

	@Autowired
	DistrictRepository districtRepository;

	@Autowired
	SuspectDocumentRepository suspectDocumentRepository;

	@Autowired
	SuspectDocRepository suspectDocRepository;

	@Autowired
	StateRepository stateRepository;

	@Autowired
	SuspectService suspectService;

	@Autowired
	PoliceCaseStatusRepository policeCaseStatusRepository;
	@Autowired
	NotificationRepository notificationRepository;

	// Get all Open communication requested to the IO
	// And append a list of comments against that Open request for each Open
	// communication
	public Object getAllCommunication(String username) {

		ArrayList<CommunicationPayload> commPayloadList = new ArrayList<CommunicationPayload>();
		try {

			User user = userRepository.findByUsername(username);
			if (null != user) {
				ArrayList<TransCommunication> commList = communicationRepository
						.findByCommunicationStatusAndUserTo_id("Open", user.getId());

				for (TransCommunication comm : commList) {
					CommunicationPayload commPayload = new CommunicationPayload();
					commPayload.setSuspectId(comm.getSuspect().getSuspectId());
					commPayload.setOfflineId(comm.getSuspect().getOfflineId());
					commPayload.setFirstName(comm.getSuspect().getFirstName());
					commPayload.setMiddleName(comm.getSuspect().getMiddleName());
					commPayload.setLastName(comm.getSuspect().getLastName());
					commPayload.setAliasName(comm.getSuspect().getAliasName());
					commPayload.setFatherName(comm.getSuspect().getFatherName());
					commPayload.setMotherName(comm.getSuspect().getMotherName());
					commPayload.setMobileNo(comm.getSuspect().getMobileNo());
					try {
						File imageFile = new File(comm.getSuspect().getPhotoPath());
						BufferedImage originalImage = ImageIO.read(imageFile);
						ByteArrayOutputStream baos = new ByteArrayOutputStream();
						ImageIO.write(originalImage, "jpg", baos);
						commPayload.setPhoto(baos.toByteArray());
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
					commPayload.setCommId(comm.getCommId());
					commPayload.setRecommendation(comm.getRecommendation());

					ArrayList<String> commentList = new ArrayList<String>();
					// Add all comments against parent communication by SP
					for (TransCommunication comm2 : communicationRepository.findByParentCommunication(comm)) {
						commentList.add(comm2.getRecommendation());
					}
					commPayload.setCommentList(commentList);
					commPayloadList.add(commPayload);
				}

			}
			return commPayloadList;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {

		}
		return commPayloadList;
	}

	// Add communication reply
	@Transactional(rollbackFor = { Exception.class })
	public Object addReply(CommunicationForm communicationForm) {

		try {
			TransCommunication communication = communicationRepository
					.findByCommId(communicationForm.getParentCommId());

			MasterCurrentStatus currentStatus = currentStatusRepository.findByCurrentStatusCode("01"); // Active

			if (null != communication) {
				TransCommunication comm = new TransCommunication();
				comm.setRecommendation(communicationForm.getRecommendation());
				comm.setRoleFrom(communication.getRoleTo()); //
				comm.setRoleTo(communication.getRoleFrom());
				comm.setCommType(communicationTypeRepository.findByCommTypeCode("01"));
				comm.setCurrentStatus(currentStatus); // Active
				comm.setSuspect(suspectRepository.findBySuspectId(communicationForm.getSuspectId()));
				User userTo = userRepository.findByUsername(communication.getCreatedBy()); // GEt user SP who started
																							// communication
				comm.setUserTo(userTo);// reply to SP
				comm.setParentCommunication(communicationRepository.findByCommId(communicationForm.getParentCommId()));
				comm.setSuspectThana(thanaRepository.findByThanaCode(communicationForm.getFkSuspectThanaCode()));
				comm.setSuspectDistrict(
						districtRepository.findByDistrictCode(communicationForm.getFkSuspectDistrictCode()));

				comm = communicationRepository.save(comm);

				System.out.println(comm.getRecommendation());
				for (NewDocForm doc : communicationForm.getDocList()) {
					saveDocument(doc, comm);
				}
			}

			// Set actual communication closed
			communication.setCommunicationStatus("Closed");
			communicationRepository.save(communication);

			// If no Open communication found
			// Update Police case status in suspect table
			if (communicationRepository.countByCommunicationStatusAndSuspect("Open", communication.getSuspect()) > 1) {
				// Do nothing
			} else {

				TransSuspect suspect = communication.getSuspect();
				if (null != suspect) {
					if (suspect.getPoliceCaseStatus().getCaseStatusCode().equalsIgnoreCase("02")) {
						// INVESTIGATION COMPLETED BY IO
						suspect.setPoliceCaseStatus(policeCaseStatusRepository.findByCaseStatusCode("03"));
						suspectRepository.save(suspect);
					} else if (suspect.getPoliceCaseStatus().getCaseStatusCode().equalsIgnoreCase("06")) {
						// FURTHER INVESTIGATION COMPLETED BY IO
						suspect.setPoliceCaseStatus(policeCaseStatusRepository.findByCaseStatusCode("07"));
						suspectRepository.save(suspect);
					}
				}
			}

			// Add Notification

			TransNotification notification = new TransNotification();
			notification.setTarget("INVESTIGATION REPLY");
			notification.setTargetPath("page-spd-suspect-details/"+communication.getSuspect().getSuspectId()+"?tab=investigation");
			notification.setRoleTo(communication.getRoleFrom().toLowerCase()); // spd - From whom this communication started
			notification.setIsViewed(false);
			notification.setSuspect(communication.getSuspect());
			notification.setCurrentStatus(currentStatus); // Active
			notification.setRemarks(communicationForm.getRecommendation());
			notificationRepository.save(notification);
			return new Acknowledge("1", "Replied successfully.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return new Acknowledge("0", "Unable to add replay.");
		} finally {

		}
	}

	public Boolean saveDocument(NewDocForm docForm, TransCommunication communication) {
		try {

			TransSuspectDoc doc = new TransSuspectDoc();
			doc.setDocId(null);
			doc.setCommunication(communication);
			doc.setSuspect(suspectRepository.findBySuspectId(docForm.getFkSuspectId()));
			doc.setOfflineId(docForm.getOfflineId());
			doc.setDocument(suspectDocumentRepository.findByDocCode(docForm.getFkDocCode()));
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
			String timeStamp = suspectService.getFormattedDateTimeWithMilliseconds(new Date());
			String docPath = suspectService.saveImageFile(docForm.getDoc(),
					doc.getSuspect().getSuspectId() + "_" + docForm.getFkDocCode() + "_" + timeStamp,
					doc.getSuspect().getSuspectId());

			doc.setDocPath(docPath);
			suspectDocRepository.save(doc);

			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
}
