package com.bohniman.eftapi.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;

@Entity
public class MasterState extends Auditable {
	@Id
	@Basic(optional = false)
	@Size(max = 30)
	private String stateCode;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_country_code", nullable = false)
	private MasterCountry country;

	@Size(max = 300)
	private String stateName;

	@Size(max = 300)
	private String stateAsm;

	@Size(max = 30)
	private String version;

	@Size(max = 30)
	private String isActive;

	public MasterState() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public MasterCountry getCountry() {
		return country;
	}

	public void setCountry(MasterCountry country) {
		this.country = country;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getStateAsm() {
		return stateAsm;
	}

	public void setStateAsm(String stateAsm) {
		this.stateAsm = stateAsm;
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
