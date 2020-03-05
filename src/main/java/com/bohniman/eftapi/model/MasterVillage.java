package com.bohniman.eftapi.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;

@Entity
public class MasterVillage extends Auditable {
	@Id
	@Basic(optional = false)
	@Size(max = 30)
	private String villageCode;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_thana_code", nullable = false)
	private MasterThana thana;

	@Size(max = 300)
	private String villageName;

	@Size(max = 300)
	private String villageAsm;

	@Size(max = 30)
	private String typeOfVillage;

	@Size(max = 30)
	private String version;

	@Size(max = 30)
	private String isActive;

	public MasterVillage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getVillageCode() {
		return villageCode;
	}

	public void setVillageCode(String villageCode) {
		this.villageCode = villageCode;
	}

	public MasterThana getThana() {
		return thana;
	}

	public void setThana(MasterThana thana) {
		this.thana = thana;
	}

	public String getVillageName() {
		return villageName;
	}

	public void setVillageName(String villageName) {
		this.villageName = villageName;
	}

	public String getVillageAsm() {
		return villageAsm;
	}

	public void setVillageAsm(String villageAsm) {
		this.villageAsm = villageAsm;
	}

	public String getTypeOfVillage() {
		return typeOfVillage;
	}

	public void setTypeOfVillage(String typeOfVillage) {
		this.typeOfVillage = typeOfVillage;
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
