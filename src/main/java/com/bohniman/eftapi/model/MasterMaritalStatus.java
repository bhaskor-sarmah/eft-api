package com.bohniman.eftapi.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;

/**
 * MasterMaritalStatus
 */
@Entity
public class MasterMaritalStatus extends Auditable {

	@Id
	@Basic(optional = false)
	@Size(max = 30)
	private String maritalStatusCode;

	@Size(max = 200)
	private String maritalStatusName;

	@Size(max = 300)
	private String maritalStatusAsm;

	@Size(max = 30)
	private String version;

	@Size(max = 30)
	private String isActive;

	public MasterMaritalStatus() {
	}

	public String getMaritalStatusCode() {
		return maritalStatusCode;
	}

	public void setMaritalStatusCode(String maritalStatusCode) {
		this.maritalStatusCode = maritalStatusCode;
	}

	public String getMaritalStatusName() {
		return maritalStatusName;
	}

	public void setMaritalStatusName(String maritalStatusName) {
		this.maritalStatusName = maritalStatusName;
	}

	public String getMaritalStatusAsm() {
		return maritalStatusAsm;
	}

	public void setMaritalStatusAsm(String maritalStatusAsm) {
		this.maritalStatusAsm = maritalStatusAsm;
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