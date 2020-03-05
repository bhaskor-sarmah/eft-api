package com.bohniman.eftapi.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class MasterSuspectDocument extends Auditable {
	@Id
	@Basic(optional = false)
	@Size(max = 30)
	private String docCode;

	@Size(max = 300)
	private String docName;

	@Size(max = 300)
	private String docAsm;

	@Size(max = 30)
	private String version;

	@Size(max = 30)
	private String isActive;

	public MasterSuspectDocument() {
	}

	public String getDocCode() {
		return docCode;
	}

	public void setDocCode(String docCode) {
		this.docCode = docCode;
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public String getDocAsm() {
		return docAsm;
	}

	public void setDocAsm(String docAsm) {
		this.docAsm = docAsm;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

}
