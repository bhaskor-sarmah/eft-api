package com.bohniman.eftapi.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;

/**
 * MasterOccupation
 */
@Entity
public class MasterOccupation extends Auditable {

	@Id
	@Basic(optional = false)
	@Size(max = 30)
	private String occupationCode;

	@Size(max = 200)
	private String occupationName;

	@Size(max = 200)
	private String occupationAsm;

	@Size(max = 30)
	private String version;

	@Size(max = 30)
	private String isActive;

	public MasterOccupation() {
	}

	public String getOccupationCode() {
		return occupationCode;
	}

	public void setOccupationCode(String occupationCode) {
		this.occupationCode = occupationCode;
	}

	public String getOccupationName() {
		return occupationName;
	}

	public void setOccupationName(String occupationName) {
		this.occupationName = occupationName;
	}

	public String getOccupationAsm() {
		return occupationAsm;
	}

	public void setOccupationAsm(String occupationAsm) {
		this.occupationAsm = occupationAsm;
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