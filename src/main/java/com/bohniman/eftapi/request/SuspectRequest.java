package com.bohniman.eftapi.request;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

public class SuspectRequest {
//	private String suspectId;
	private String offlineId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String aliasName;
	private String fatherName;
	private String motherName;

	private String fkGenderCode;
	private String fkMaritalStatusCode;
	private String fkOccupationCode;
//	private String fkReligionCode;
	private String initiatedBy;

	private String witness1;
	private String witness2;

	private String age;
	private String dateOfBirth;

	private String placeOfBirth;
	private String email;
	private String mobileNo;

	private String isEmployed;
	private String fkEmploymentTypeCode;
	private String employerName;

	private String isVoter;
	private String whenIncludedInEr;
	private String epicNo;
	private String partNo;
	private String partName;

	private String height;
	private String hair;
	private String eye;
	private String complexion;
	private String identificationMark;

	private String hasForeignPassport;
	private String fkForeignCountryCode;
	private String foreignPassportDetails;

	private String hasLandHouse;
	private String landHouseFrom;
	private String landHouseDagNo;
	private String landHousePattaNo;
	private String landHouseDetails;

	private String sinceWhenStaying;
	private String fkRouteCode;

	private boolean hasDoc; // if true, doc is available
	private boolean hasBio; // if false, doc is not available

	private String fkSuspectStateCode;
	private String fkSuspectDistrictCode;
//	private String fkSuspectFtCode;
//	private String fkSuspectLacCode;
	private String fkSuspectThanaCode;

	private String deviceId;

	private String capturedAt;
	private String capturedBy;

	private String capturedLocLat;
	private String capturedLocLong;

//	private String recordType;
//	private String markedAsDvoter;
//	private String typeOfSuspect;
//	private String ageOnDate;
//	private String policeCaseNo;
//	private String eroComments;
//	private String ftCaseNo;
//	private String photoPath;
//
//	private String fkPoliceCaseStatusCode;
//	private String fkCurrentStatusCode;
//	private String ipAddress;

	public SuspectRequest() {
		super();
	}

	public String getOfflineId() {
		return offlineId;
	}

	public void setOfflineId(String offlineId) {
		this.offlineId = offlineId;
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

	public String getAliasName() {
		return aliasName;
	}

	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
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

	public String getFkGenderCode() {
		return fkGenderCode;
	}

	public void setFkGenderCode(String fkGenderCode) {
		this.fkGenderCode = fkGenderCode;
	}

	public String getFkMaritalStatusCode() {
		return fkMaritalStatusCode;
	}

	public void setFkMaritalStatusCode(String fkMaritalStatusCode) {
		this.fkMaritalStatusCode = fkMaritalStatusCode;
	}

	public String getFkOccupationCode() {
		return fkOccupationCode;
	}

	public void setFkOccupationCode(String fkOccupationCode) {
		this.fkOccupationCode = fkOccupationCode;
	}

	public String getInitiatedBy() {
		return initiatedBy;
	}

	public void setInitiatedBy(String initiatedBy) {
		this.initiatedBy = initiatedBy;
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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
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

	public String getIsEmployed() {
		return isEmployed;
	}

	public void setIsEmployed(String isEmployed) {
		this.isEmployed = isEmployed;
	}

	public String getFkEmploymentTypeCode() {
		return fkEmploymentTypeCode;
	}

	public void setFkEmploymentTypeCode(String fkEmploymentTypeCode) {
		this.fkEmploymentTypeCode = fkEmploymentTypeCode;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
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

	public String getFkForeignCountryCode() {
		return fkForeignCountryCode;
	}

	public void setFkForeignCountryCode(String fkForeignCountryCode) {
		this.fkForeignCountryCode = fkForeignCountryCode;
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

	public String getFkRouteCode() {
		return fkRouteCode;
	}

	public void setFkRouteCode(String fkRouteCode) {
		this.fkRouteCode = fkRouteCode;
	}

	public boolean isHasDoc() {
		return hasDoc;
	}

	public void setHasDoc(boolean hasDoc) {
		this.hasDoc = hasDoc;
	}

	public boolean isHasBio() {
		return hasBio;
	}

	public void setHasBio(boolean hasBio) {
		this.hasBio = hasBio;
	}

	public String getFkSuspectStateCode() {
		return fkSuspectStateCode;
	}

	public void setFkSuspectStateCode(String fkSuspectStateCode) {
		this.fkSuspectStateCode = fkSuspectStateCode;
	}

	public String getFkSuspectDistrictCode() {
		return fkSuspectDistrictCode;
	}

	public void setFkSuspectDistrictCode(String fkSuspectDistrictCode) {
		this.fkSuspectDistrictCode = fkSuspectDistrictCode;
	}

	public String getFkSuspectThanaCode() {
		return fkSuspectThanaCode;
	}

	public void setFkSuspectThanaCode(String fkSuspectThanaCode) {
		this.fkSuspectThanaCode = fkSuspectThanaCode;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getCapturedAt() {
		return capturedAt;
	}

	public void setCapturedAt(String capturedAt) {
		this.capturedAt = capturedAt;
	}

	public String getCapturedBy() {
		return capturedBy;
	}

	public void setCapturedBy(String capturedBy) {
		this.capturedBy = capturedBy;
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

}
