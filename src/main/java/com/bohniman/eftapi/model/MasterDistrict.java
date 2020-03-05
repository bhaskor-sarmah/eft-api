package com.bohniman.eftapi.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;

@Entity
public class MasterDistrict extends Auditable {
	@Id
	@Basic(optional = false)
	@Size(max = 30)
	private String districtCode;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_state_code", nullable = false)
	private MasterState state;

	@Size(max = 300)
	private String districtName;

	@Size(max = 300)
	private String districtAsm;

	@Size(max = 30)
	private String version;

	@Size(max = 30)
	private String isActive;

	public MasterDistrict() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getDistrictCode() {
		return districtCode;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public MasterState getState() {
		return state;
	}

	public void setState(MasterState state) {
		this.state = state;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getDistrictAsm() {
		return districtAsm;
	}

	public void setDistrictAsm(String districtAsm) {
		this.districtAsm = districtAsm;
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
