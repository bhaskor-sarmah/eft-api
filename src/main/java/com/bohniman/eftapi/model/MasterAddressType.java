package com.bohniman.eftapi.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;

/**
 * MasterAddressType
 */
@Entity
public class MasterAddressType extends Auditable {
	@Id
	@Basic(optional = false)
	private String addressTypeCode;

	@Size(max = 300)
	private String addressTypeName;

	@Size(max = 300)
	private String addressTypeAsm;

	@Size(max = 30)
	private String version;

	@Size(max = 30)
	private String isActive;

	public MasterAddressType() {
	}

	public String getAddressTypeCode() {
		return addressTypeCode;
	}

	public void setAddressTypeCode(String addressTypeCode) {
		this.addressTypeCode = addressTypeCode;
	}

	public String getAddressTypeName() {
		return addressTypeName;
	}

	public void setAddressTypeName(String addressTypeName) {
		this.addressTypeName = addressTypeName;
	}

	public String getAddressTypeAsm() {
		return addressTypeAsm;
	}

	public void setAddressTypeAsm(String addressTypeAsm) {
		this.addressTypeAsm = addressTypeAsm;
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