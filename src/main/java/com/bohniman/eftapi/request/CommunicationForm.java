package com.bohniman.eftapi.request;

import java.util.ArrayList;

public class CommunicationForm {

	private String suspectId;
	private Long parentCommId;
	private String recommendation;
	ArrayList<NewDocForm> docList;

	private String fkSuspectStateCode;
	private String fkSuspectDistrictCode;
	private String fkSuspectThanaCode;

	public CommunicationForm() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSuspectId() {
		return suspectId;
	}

	public void setSuspectId(String suspectId) {
		this.suspectId = suspectId;
	}

	public Long getParentCommId() {
		return parentCommId;
	}

	public void setParentCommId(Long parentCommId) {
		this.parentCommId = parentCommId;
	}

	public String getRecommendation() {
		return recommendation;
	}

	public void setRecommendation(String recommendation) {
		this.recommendation = recommendation;
	}

	public ArrayList<NewDocForm> getDocList() {
		return docList;
	}

	public void setDocList(ArrayList<NewDocForm> docList) {
		this.docList = docList;
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
