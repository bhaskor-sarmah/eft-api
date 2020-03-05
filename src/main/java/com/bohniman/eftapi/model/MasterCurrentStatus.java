package com.bohniman.eftapi.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class MasterCurrentStatus extends Auditable {
	@Id
	@Basic(optional = false)
	@Size(max = 30)
	private String currentStatusCode;

	@Size(max = 300)
	private String currentStatusDetails;

	@Size(max = 30)
	private String isActive;

	public MasterCurrentStatus() {
		super();
	}

	public String getCurrentStatusCode() {
		return currentStatusCode;
	}

	public void setCurrentStatusCode(String currentStatusCode) {
		this.currentStatusCode = currentStatusCode;
	}

	public String getCurrentStatusDetails() {
		return currentStatusDetails;
	}

	public void setCurrentStatusDetails(String currentStatusDetails) {
		this.currentStatusDetails = currentStatusDetails;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

}
