package com.bohniman.eftapi.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;

@Entity
public class MasterFt extends Auditable {
	@Id
	@Basic(optional = false)
	@Size(max = 30)
	private String ftCode;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_district_code", nullable = false)
	private MasterDistrict distrct;

	@Size(max = 300)
	private String ftName;

	@Size(max = 300)
	private String ftAsm;

	@Size(max = 300)
	private String location;

	@Size(max = 300)
	private String address;

	@Size(max = 30)
	private String version;

	@Size(max = 30)
	private String isActive;

	public MasterFt() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getFtCode() {
		return ftCode;
	}

	public void setFtCode(String ftCode) {
		this.ftCode = ftCode;
	}

	public MasterDistrict getDistrct() {
		return distrct;
	}

	public void setDistrct(MasterDistrict distrct) {
		this.distrct = distrct;
	}

	public String getFtName() {
		return ftName;
	}

	public void setFtName(String ftName) {
		this.ftName = ftName;
	}

	public String getFtAsm() {
		return ftAsm;
	}

	public void setFtAsm(String ftAsm) {
		this.ftAsm = ftAsm;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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
