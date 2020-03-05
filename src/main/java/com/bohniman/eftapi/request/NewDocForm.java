package com.bohniman.eftapi.request;

import java.util.Date;

import javax.validation.constraints.Size;

public class NewDocForm {

	private String docId;
	private String fkSuspectId;
	private String offlineId;
	private String fkDocCode;
	@Size(max = 300)
	private String otherDocument;

	@Size(max = 300)
	private String docDetails;

	private byte[] doc;

	private Date capturedAt;
	private String capturedBy;
//	private String fkCurrentStatusCode;
	private String fkSuspectStateCode;
	private String fkSuspectDistrictCode;
	private String fkSuspectThanaCode;

	public NewDocForm() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getDocId() {
		return docId;
	}

	public void setDocId(String docId) {
		this.docId = docId;
	}

	public String getFkSuspectId() {
		return fkSuspectId;
	}

	public void setFkSuspectId(String fkSuspectId) {
		this.fkSuspectId = fkSuspectId;
	}

	public String getOfflineId() {
		return offlineId;
	}

	public void setOfflineId(String offlineId) {
		this.offlineId = offlineId;
	}

	public String getFkDocCode() {
		return fkDocCode;
	}

	public void setFkDocCode(String fkDocCode) {
		this.fkDocCode = fkDocCode;
	}

	public String getOtherDocument() {
		return otherDocument;
	}

	public void setOtherDocument(String otherDocument) {
		this.otherDocument = otherDocument;
	}

	public String getDocDetails() {
		return docDetails;
	}

	public void setDocDetails(String docDetails) {
		this.docDetails = docDetails;
	}

	public byte[] getDoc() {
		return doc;
	}

	public void setDoc(byte[] doc) {
		this.doc = doc;
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

}
