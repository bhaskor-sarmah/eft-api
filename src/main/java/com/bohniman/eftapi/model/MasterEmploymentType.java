package com.bohniman.eftapi.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;

/**
 * MasterEmploymentType
 */
@Entity
public class MasterEmploymentType extends Auditable {

	@Id
	@Basic(optional = false)
	@Size(max = 30)
	private String employmentTypeCode;

	@Size(max = 300)
	private String employmentTypeName;

	@Size(max = 300)
	private String employmentTypeAsm;

	@Size(max = 30)
	private String version;

	@Size(max = 30)
	private String isActive;

	public MasterEmploymentType() {
	}

	public String getEmploymentTypeCode() {
		return employmentTypeCode;
	}

	public void setEmploymentTypeCode(String employmentTypeCode) {
		this.employmentTypeCode = employmentTypeCode;
	}

	public String getEmploymentTypeName() {
		return employmentTypeName;
	}

	public void setEmploymentTypeName(String employmentTypeName) {
		this.employmentTypeName = employmentTypeName;
	}

	public String getEmploymentTypeAsm() {
		return employmentTypeAsm;
	}

	public void setEmploymentTypeAsm(String employmentTypeAsm) {
		this.employmentTypeAsm = employmentTypeAsm;
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