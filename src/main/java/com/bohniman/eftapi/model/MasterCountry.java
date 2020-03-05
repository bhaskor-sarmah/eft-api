package com.bohniman.eftapi.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;

/**
 * MasterCountry
 */
@Entity
public class MasterCountry extends Auditable {
	@Id
	@Basic(optional = false)
	@Size(max = 30)
	private String countryCode;

	@Size(max = 300)
	private String countryName;

	@Size(max = 300)
	private String countryAsm;

	@Size(max = 30)
	private String version;

	@Size(max = 30)
	private String isActive;

	public MasterCountry() {
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCountryAsm() {
		return countryAsm;
	}

	public void setCountryAsm(String countryAsm) {
		this.countryAsm = countryAsm;
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