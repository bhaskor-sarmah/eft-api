package com.bohniman.eftapi.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;

/**
 * MasterGender
 */
@Entity
public class MasterGender extends Auditable {

	@Id
	@Basic(optional = false)
	@Size(max = 30)
	private String genderCode;

	@Size(max = 80)
	private String genderName;

	@Size(max = 300)
	private String genderAsm;

	@Size(max = 30)
	private String version;

	@Size(max = 30)
	private String isActive;

	public MasterGender() {
	}

	public String getGenderCode() {
		return genderCode;
	}

	public void setGenderCode(String genderCode) {
		this.genderCode = genderCode;
	}

	public String getGenderName() {
		return genderName;
	}

	public void setGenderName(String genderName) {
		this.genderName = genderName;
	}

	public String getGenderAsm() {
		return genderAsm;
	}

	public void setGenderAsm(String genderAsm) {
		this.genderAsm = genderAsm;
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