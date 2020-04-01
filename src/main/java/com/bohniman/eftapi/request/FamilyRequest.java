package com.bohniman.eftapi.request;

public class FamilyRequest {

//	private Long memberId;
	private String offlineId;
	private String fkRelationCode;
	private String memberName;
	private String fkGenderCode;
	private String dateOfBirth;
	private String age;
	private String placeOfBirth;
	private String deviceId;
	private String ipAddress;
	private String capturedAt;
	private String capturedBy;
//	private String fkCurrentStatusCode;
//	private String fkSuspectStateCode;
//	private String fkSuspectDistrictCode;
//	private String fkSuspectFtCode;
//	private String fkSuspectThanaCode;

	public FamilyRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getOfflineId() {
		return offlineId;
	}

	public void setOfflineId(String offlineId) {
		this.offlineId = offlineId;
	}

	public String getFkRelationCode() {
		return fkRelationCode;
	}

	public void setFkRelationCode(String fkRelationCode) {
		this.fkRelationCode = fkRelationCode;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getFkGenderCode() {
		return fkGenderCode;
	}

	public void setFkGenderCode(String fkGenderCode) {
		this.fkGenderCode = fkGenderCode;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
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

}
