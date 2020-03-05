package com.bohniman.eftapi.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;

/**
 * MasterRelation
 */
@Entity
public class MasterRelation extends Auditable {

	@Id
	@Basic(optional = false)
	@Size(max = 30)
	private String relationCode;

	@Size(max = 200)
	private String relationName;

	@Size(max = 200)
	private String relationAsm;

	@Size(max = 30)
	private String version;

	@Size(max = 30)
	private String isActive;

	public MasterRelation() {
	}

	public String getRelationCode() {
		return relationCode;
	}

	public void setRelationCode(String relationCode) {
		this.relationCode = relationCode;
	}

	public String getRelationName() {
		return relationName;
	}

	public void setRelationName(String relationName) {
		this.relationName = relationName;
	}

	public String getRelationAsm() {
		return relationAsm;
	}

	public void setRelationAsm(String relationAsm) {
		this.relationAsm = relationAsm;
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