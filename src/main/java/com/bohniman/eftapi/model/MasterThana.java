package com.bohniman.eftapi.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;

@Entity
public class MasterThana extends Auditable {
	@Id
	@Basic(optional = false)
	@Size(max = 30)
	private String thanaCode;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_district_code", nullable = false)
	private MasterDistrict district;

	// @ManyToOne(fetch = FetchType.LAZY)
	// @JoinColumn(name = "fk_ft_code", nullable = false)
	// private MasterFt ft;

	@Size(max = 300)
	private String thanaName;

	@Size(max = 300)
	private String thanaAsm;

	@Size(max = 30)
	private String version;

	@Size(max = 30)
	private String isActive;

	public MasterThana() {
	}

	public String getThanaCode() {
		return thanaCode;
	}

	public void setThanaCode(String thanaCode) {
		this.thanaCode = thanaCode;
	}

	public MasterDistrict getDistrict() {
		return district;
	}

	public void setDistrict(MasterDistrict district) {
		this.district = district;
	}

	public String getThanaName() {
		return thanaName;
	}

	public void setThanaName(String thanaName) {
		this.thanaName = thanaName;
	}

	public String getThanaAsm() {
		return thanaAsm;
	}

	public void setThanaAsm(String thanaAsm) {
		this.thanaAsm = thanaAsm;
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
