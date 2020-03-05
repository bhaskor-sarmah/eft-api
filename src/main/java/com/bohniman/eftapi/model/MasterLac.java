package com.bohniman.eftapi.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;

@Entity
public class MasterLac extends Auditable {

	@Id
	@Basic(optional = false)
	@Size(max = 30)
	private String lacCode;

	@Size(max = 200)
	private String lacName;

	@Size(max = 300)
	private String lacAsm;

	@Size(max = 300)
	private String loksabha;

	@Size(max = 30)
	private String version;

	@Size(max = 30)
	private String isActive;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_district_code", nullable = false)
	private MasterDistrict district;

	public MasterLac() {
	}

	public String getLacCode() {
		return lacCode;
	}

	public void setLacCode(String lacCode) {
		this.lacCode = lacCode;
	}

	public String getLacName() {
		return lacName;
	}

	public void setLacName(String lacName) {
		this.lacName = lacName;
	}

	public String getLacAsm() {
		return lacAsm;
	}

	public void setLacAsm(String lacAsm) {
		this.lacAsm = lacAsm;
	}

	public String getLoksabha() {
		return loksabha;
	}

	public void setLoksabha(String loksabha) {
		this.loksabha = loksabha;
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

	public MasterDistrict getDistrict() {
		return district;
	}

	public void setDistrict(MasterDistrict district) {
		this.district = district;
	}

}
