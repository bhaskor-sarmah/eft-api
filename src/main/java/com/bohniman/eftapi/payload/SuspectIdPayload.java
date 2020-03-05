package com.bohniman.eftapi.payload;

public class SuspectIdPayload {
	private String suspectId;
	private String offlineId;

	public SuspectIdPayload() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SuspectIdPayload(String suspectId, String offlineId) {
		super();
		this.suspectId = suspectId;
		this.offlineId = offlineId;
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

}
