package com.bohniman.eftapi.model;

import java.util.Objects;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class MasterPoliceCaseStatus extends Auditable {
	@Id
	@Basic(optional = false)
	@Size(max = 30)
	private String caseStatusCode;

	@Size(max = 300)
	private String caseStatusDetails;

	private String caseStatusImage;

	private String caseStatusColor;

	@Size(max = 30)
	private String isActive;

	public MasterPoliceCaseStatus() {
	}

	public MasterPoliceCaseStatus(String caseStatusCode, String caseStatusDetails, String caseStatusImage,
			String caseStatusColor, String isActive) {
		this.caseStatusCode = caseStatusCode;
		this.caseStatusDetails = caseStatusDetails;
		this.caseStatusImage = caseStatusImage;
		this.caseStatusColor = caseStatusColor;
		this.isActive = isActive;
	}

	public String getCaseStatusCode() {
		return this.caseStatusCode;
	}

	public void setCaseStatusCode(String caseStatusCode) {
		this.caseStatusCode = caseStatusCode;
	}

	public String getCaseStatusDetails() {
		return this.caseStatusDetails;
	}

	public void setCaseStatusDetails(String caseStatusDetails) {
		this.caseStatusDetails = caseStatusDetails;
	}

	public String getCaseStatusImage() {
		return this.caseStatusImage;
	}

	public void setCaseStatusImage(String caseStatusImage) {
		this.caseStatusImage = caseStatusImage;
	}

	public String getCaseStatusColor() {
		return this.caseStatusColor;
	}

	public void setCaseStatusColor(String caseStatusColor) {
		this.caseStatusColor = caseStatusColor;
	}

	public String getIsActive() {
		return this.isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public MasterPoliceCaseStatus caseStatusCode(String caseStatusCode) {
		this.caseStatusCode = caseStatusCode;
		return this;
	}

	public MasterPoliceCaseStatus caseStatusDetails(String caseStatusDetails) {
		this.caseStatusDetails = caseStatusDetails;
		return this;
	}

	public MasterPoliceCaseStatus caseStatusImage(String caseStatusImage) {
		this.caseStatusImage = caseStatusImage;
		return this;
	}

	public MasterPoliceCaseStatus caseStatusColor(String caseStatusColor) {
		this.caseStatusColor = caseStatusColor;
		return this;
	}

	public MasterPoliceCaseStatus isActive(String isActive) {
		this.isActive = isActive;
		return this;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof MasterPoliceCaseStatus)) {
			return false;
		}
		MasterPoliceCaseStatus masterPoliceCaseStatus = (MasterPoliceCaseStatus) o;
		return Objects.equals(caseStatusCode, masterPoliceCaseStatus.caseStatusCode)
				&& Objects.equals(caseStatusDetails, masterPoliceCaseStatus.caseStatusDetails)
				&& Objects.equals(caseStatusImage, masterPoliceCaseStatus.caseStatusImage)
				&& Objects.equals(caseStatusColor, masterPoliceCaseStatus.caseStatusColor)
				&& Objects.equals(isActive, masterPoliceCaseStatus.isActive);
	}

	@Override
	public int hashCode() {
		return Objects.hash(caseStatusCode, caseStatusDetails, caseStatusImage, caseStatusColor, isActive);
	}

	@Override
	public String toString() {
		return "{" + " caseStatusCode='" + getCaseStatusCode() + "'" + ", caseStatusDetails='" + getCaseStatusDetails()
				+ "'" + ", caseStatusImage='" + getCaseStatusImage() + "'" + ", caseStatusColor='"
				+ getCaseStatusColor() + "'" + ", isActive='" + getIsActive() + "'" + "}";
	}

}
