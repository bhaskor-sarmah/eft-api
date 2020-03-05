package com.bohniman.eftapi.model;


import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class MasterCommunicationType extends Auditable {
	@Id
	@Basic(optional = false)
	private String commTypeCode;

	@Size(max = 300)
	private String commTypeName;

	@Size(max = 30)
	private String isActive;

	public MasterCommunicationType() {
	}

	public MasterCommunicationType(String commTypeCode, String commTypeName, String isActive) {
		this.commTypeCode = commTypeCode;
		this.commTypeName = commTypeName;
		this.isActive = isActive;
	}

	public String getCommTypeCode() {
		return this.commTypeCode;
	}

	public void setCommTypeCode(String commTypeCode) {
		this.commTypeCode = commTypeCode;
	}

	public String getCommTypeName() {
		return this.commTypeName;
	}

	public void setCommTypeName(String commTypeName) {
		this.commTypeName = commTypeName;
	}

	public String getIsActive() {
		return this.isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public MasterCommunicationType commTypeCode(String commTypeCode) {
		this.commTypeCode = commTypeCode;
		return this;
	}

	public MasterCommunicationType commTypeName(String commTypeName) {
		this.commTypeName = commTypeName;
		return this;
	}

	public MasterCommunicationType isActive(String isActive) {
		this.isActive = isActive;
		return this;
	}
}