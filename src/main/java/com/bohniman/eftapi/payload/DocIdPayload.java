package com.bohniman.eftapi.payload;

public class DocIdPayload {
	private String docId;

	public DocIdPayload(String docId) {
		super();
		this.docId = docId;
	}

	public String getDocId() {
		return docId;
	}

	public void setDocId(String docId) {
		this.docId = docId;
	}

}
