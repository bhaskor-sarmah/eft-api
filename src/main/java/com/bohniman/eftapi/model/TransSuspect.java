package com.bohniman.eftapi.model;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * TransSuspect
 */
@Entity
public class TransSuspect extends Auditable {

//	@Id
//	@Basic(optional = false)
//	@Size(max = 200)
//	// ThanaCode + 100001
//	private String suspectId;

	@Id
	@GeneratedValue(generator = "suspectIdGenerator")
	@GenericGenerator(name = "suspectIdGenerator", parameters = {
			@org.hibernate.annotations.Parameter(name = "id_name", value = ""),
			@org.hibernate.annotations.Parameter(name = "prefix", value = ""),
			@org.hibernate.annotations.Parameter(name = "type", value = "string") }, strategy = "com.bohniman.eftapi.service.UniqueIdGenerator")
	@Basic(optional = false)
	private String suspectId;

	// Id from mobile app offline PK.
	@Column(unique = true)
	private String offlineId;

	// 'Legacy' data or 'Live' data
	private String recordType;

	private String aliasName;

	// IO/ERO
	private String initiatedBy;

	// Yes/No
	private String markedAsDvoter;

	// Convicted or Illigal Migrant
	private String typeOfSuspect;

	@Size(max = 500)
	private String firstName;
	@Size(max = 500)
	private String middleName;
	@Size(max = 500)
	private String lastName;
	@Size(max = 500)
	private String fatherName;
	@Size(max = 500)
	private String motherName;

	@Size(max = 500)
	private String witness1;

	@Size(max = 500)
	private String witness2;

	@Size(max = 80)
	private String capturedLocLat;

	@Size(max = 80)
	private String capturedLocLong;

	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateOfBirth;

	@Size(max = 500)
	private String placeOfBirth;

	@Size(max = 100)
	private String age;
	@Size(max = 100)
	private String ageOnDate;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_gender_code")
	private MasterGender gender;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_marital_status_code")
	private MasterMaritalStatus maritalStatus;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_occupation_code")
	private MasterOccupation occupation;

	@Size(max = 200)
	private String otherOccupation;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_religion_code")
	private MasterReligion religion;

	@Email
	@Size(max = 500)
	private String email;
	@Size(max = 100)
	private String mobileNo;

	@Size(max = 200)
	private String height;
	@Size(max = 200)
	private String hair;
	@Size(max = 200)
	private String eye;
	@Size(max = 200)
	private String complexion;
	@Size(max = 200)
	private String identificationMark;

	@Size(max = 30)
	private String hasForeignPassport;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_foreign_country_code")
	private MasterCountry foreignCountry;

	@Size(max = 200)
	private String foreignPassportDetails;

	@Size(max = 30)
	private String hasLandHouse;

	@Size(max = 80)
	private String landHouseFrom;

	@Size(max = 200)
	private String landHouseDagNo;
	@Size(max = 200)
	private String landHousePattaNo;
	@Size(max = 200)
	private String landHouseDetails;

	@Size(max = 80)
	private String sinceWhenStaying;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_immigration_route_code")
	private MasterImmigrationRoute immigrationRoute;

	@Size(max = 30)
	private String isVoter;

	@Size(max = 80)
	private String whenIncludedInEr;

	@Size(max = 200)
	private String epicNo;
	@Size(max = 200)
	private String partNo;
	@Size(max = 400)
	private String partName;

	@Size(max = 30)
	private String isEmployed;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_employment_type_code")
	private MasterEmploymentType employmentType;

	@Size(max = 500)
	private String employerName;

	@Size(max = 200)
	private String policeCaseNo;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_suspect_state_code", nullable = false)
	private MasterState suspectState;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_suspect_district_code", nullable = false)
	private MasterDistrict suspectDistrict;

//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "fk_suspect_ft_code", nullable = true)
//	private MasterFt suspectFt;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_suspect_lac_code", nullable = true)
	private MasterLac masterLac;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_suspect_thana_code", nullable = false)
	private MasterThana suspectThana;

	@Size(max = 500)
	private String eroComments;
	@Size(max = 200)
	private String ftCaseNo;

	@Size(max = 500)
	private String photoPath;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_police_case_status_code", nullable = false)
	private MasterPoliceCaseStatus policeCaseStatus;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_current_status_code", nullable = false)
	private MasterCurrentStatus currentStatus;

	@Size(max = 200)
	private String deviceId;

	@Size(max = 80)
	private String ipAddress;

	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date capturedAt;

	@Size(max = 200)
	private String capturedBy;

	public TransSuspect() {
	}

	public String getSuspectId() {
		return suspectId;
	}

	public void setSuspectId(String suspectId) {
		this.suspectId = suspectId;
	}

	public String getOfflineId() {
		return offlineId;
	}

	public void setOfflineId(String offlineId) {
		this.offlineId = offlineId;
	}

	public String getRecordType() {
		return recordType;
	}

	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}

	public String getAliasName() {
		return aliasName;
	}

	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}

	public String getInitiatedBy() {
		return initiatedBy;
	}

	public void setInitiatedBy(String initiatedBy) {
		this.initiatedBy = initiatedBy;
	}

	public String getMarkedAsDvoter() {
		return markedAsDvoter;
	}

	public void setMarkedAsDvoter(String markedAsDvoter) {
		this.markedAsDvoter = markedAsDvoter;
	}

	public String getTypeOfSuspect() {
		return typeOfSuspect;
	}

	public void setTypeOfSuspect(String typeOfSuspect) {
		this.typeOfSuspect = typeOfSuspect;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getWitness1() {
		return witness1;
	}

	public void setWitness1(String witness1) {
		this.witness1 = witness1;
	}

	public String getWitness2() {
		return witness2;
	}

	public void setWitness2(String witness2) {
		this.witness2 = witness2;
	}

	public String getCapturedLocLat() {
		return capturedLocLat;
	}

	public void setCapturedLocLat(String capturedLocLat) {
		this.capturedLocLat = capturedLocLat;
	}

	public String getCapturedLocLong() {
		return capturedLocLong;
	}

	public void setCapturedLocLong(String capturedLocLong) {
		this.capturedLocLong = capturedLocLong;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAgeOnDate() {
		return ageOnDate;
	}

	public void setAgeOnDate(String ageOnDate) {
		this.ageOnDate = ageOnDate;
	}

	public MasterGender getGender() {
		return gender;
	}

	public void setGender(MasterGender gender) {
		this.gender = gender;
	}

	public MasterMaritalStatus getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(MasterMaritalStatus maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public MasterOccupation getOccupation() {
		return occupation;
	}

	public void setOccupation(MasterOccupation occupation) {
		this.occupation = occupation;
	}

	public String getOtherOccupation() {
		return otherOccupation;
	}

	public void setOtherOccupation(String otherOccupation) {
		this.otherOccupation = otherOccupation;
	}

	public MasterReligion getReligion() {
		return religion;
	}

	public void setReligion(MasterReligion religion) {
		this.religion = religion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getHair() {
		return hair;
	}

	public void setHair(String hair) {
		this.hair = hair;
	}

	public String getEye() {
		return eye;
	}

	public void setEye(String eye) {
		this.eye = eye;
	}

	public String getComplexion() {
		return complexion;
	}

	public void setComplexion(String complexion) {
		this.complexion = complexion;
	}

	public String getIdentificationMark() {
		return identificationMark;
	}

	public void setIdentificationMark(String identificationMark) {
		this.identificationMark = identificationMark;
	}

	public String getHasForeignPassport() {
		return hasForeignPassport;
	}

	public void setHasForeignPassport(String hasForeignPassport) {
		this.hasForeignPassport = hasForeignPassport;
	}

	public MasterCountry getForeignCountry() {
		return foreignCountry;
	}

	public void setForeignCountry(MasterCountry foreignCountry) {
		this.foreignCountry = foreignCountry;
	}

	public String getForeignPassportDetails() {
		return foreignPassportDetails;
	}

	public void setForeignPassportDetails(String foreignPassportDetails) {
		this.foreignPassportDetails = foreignPassportDetails;
	}

	public String getHasLandHouse() {
		return hasLandHouse;
	}

	public void setHasLandHouse(String hasLandHouse) {
		this.hasLandHouse = hasLandHouse;
	}

	public String getLandHouseFrom() {
		return landHouseFrom;
	}

	public void setLandHouseFrom(String landHouseFrom) {
		this.landHouseFrom = landHouseFrom;
	}

	public String getLandHouseDagNo() {
		return landHouseDagNo;
	}

	public void setLandHouseDagNo(String landHouseDagNo) {
		this.landHouseDagNo = landHouseDagNo;
	}

	public String getLandHousePattaNo() {
		return landHousePattaNo;
	}

	public void setLandHousePattaNo(String landHousePattaNo) {
		this.landHousePattaNo = landHousePattaNo;
	}

	public String getLandHouseDetails() {
		return landHouseDetails;
	}

	public void setLandHouseDetails(String landHouseDetails) {
		this.landHouseDetails = landHouseDetails;
	}

	public String getSinceWhenStaying() {
		return sinceWhenStaying;
	}

	public void setSinceWhenStaying(String sinceWhenStaying) {
		this.sinceWhenStaying = sinceWhenStaying;
	}

	public MasterImmigrationRoute getImmigrationRoute() {
		return immigrationRoute;
	}

	public void setImmigrationRoute(MasterImmigrationRoute immigrationRoute) {
		this.immigrationRoute = immigrationRoute;
	}

	public String getIsVoter() {
		return isVoter;
	}

	public void setIsVoter(String isVoter) {
		this.isVoter = isVoter;
	}

	public String getWhenIncludedInEr() {
		return whenIncludedInEr;
	}

	public void setWhenIncludedInEr(String whenIncludedInEr) {
		this.whenIncludedInEr = whenIncludedInEr;
	}

	public String getEpicNo() {
		return epicNo;
	}

	public void setEpicNo(String epicNo) {
		this.epicNo = epicNo;
	}

	public String getPartNo() {
		return partNo;
	}

	public void setPartNo(String partNo) {
		this.partNo = partNo;
	}

	public String getPartName() {
		return partName;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}

	public String getIsEmployed() {
		return isEmployed;
	}

	public void setIsEmployed(String isEmployed) {
		this.isEmployed = isEmployed;
	}

	public MasterEmploymentType getEmploymentType() {
		return employmentType;
	}

	public void setEmploymentType(MasterEmploymentType employmentType) {
		this.employmentType = employmentType;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public String getPoliceCaseNo() {
		return policeCaseNo;
	}

	public void setPoliceCaseNo(String policeCaseNo) {
		this.policeCaseNo = policeCaseNo;
	}

	public MasterState getSuspectState() {
		return suspectState;
	}

	public void setSuspectState(MasterState suspectState) {
		this.suspectState = suspectState;
	}

	public MasterDistrict getSuspectDistrict() {
		return suspectDistrict;
	}

	public void setSuspectDistrict(MasterDistrict suspectDistrict) {
		this.suspectDistrict = suspectDistrict;
	}

	public MasterLac getMasterLac() {
		return masterLac;
	}

	public void setMasterLac(MasterLac masterLac) {
		this.masterLac = masterLac;
	}

	public MasterThana getSuspectThana() {
		return suspectThana;
	}

	public void setSuspectThana(MasterThana suspectThana) {
		this.suspectThana = suspectThana;
	}

	public String getEroComments() {
		return eroComments;
	}

	public void setEroComments(String eroComments) {
		this.eroComments = eroComments;
	}

	public String getFtCaseNo() {
		return ftCaseNo;
	}

	public void setFtCaseNo(String ftCaseNo) {
		this.ftCaseNo = ftCaseNo;
	}

	public String getPhotoPath() {
		return photoPath;
	}

	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}

	public MasterPoliceCaseStatus getPoliceCaseStatus() {
		return policeCaseStatus;
	}

	public void setPoliceCaseStatus(MasterPoliceCaseStatus policeCaseStatus) {
		this.policeCaseStatus = policeCaseStatus;
	}

	public MasterCurrentStatus getCurrentStatus() {
		return currentStatus;
	}

	public void setCurrentStatus(MasterCurrentStatus currentStatus) {
		this.currentStatus = currentStatus;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public Date getCapturedAt() {
		return capturedAt;
	}

	public void setCapturedAt(Date capturedAt) {
		this.capturedAt = capturedAt;
	}

	public String getCapturedBy() {
		return capturedBy;
	}

	public void setCapturedBy(String capturedBy) {
		this.capturedBy = capturedBy;
	}

}