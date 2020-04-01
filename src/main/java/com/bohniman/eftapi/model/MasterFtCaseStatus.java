package com.bohniman.eftapi.model;

import java.util.Objects;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;

/**
 * MasterFtCaseStatus
 */
@Entity
public class MasterFtCaseStatus extends Auditable {

    @Id
    @Basic(optional = false)
    @Size(max = 30)
    private String caseStatusCode;

    @Size(max = 300)
    private String caseStatusDetails;

    private String caseStatusSlug;

    private String caseStatusImage;
    private String caseStatusColor;

    @Size(max = 30)
    private String isActive;

    private Long displayOrder;

    public MasterFtCaseStatus() {
    }

    public MasterFtCaseStatus(String caseStatusCode, String caseStatusDetails, String caseStatusSlug,
            String caseStatusImage, String caseStatusColor, String isActive, Long displayOrder) {
        this.caseStatusCode = caseStatusCode;
        this.caseStatusDetails = caseStatusDetails;
        this.caseStatusSlug = caseStatusSlug;
        this.caseStatusImage = caseStatusImage;
        this.caseStatusColor = caseStatusColor;
        this.isActive = isActive;
        this.displayOrder = displayOrder;
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

    public String getCaseStatusSlug() {
        return this.caseStatusSlug;
    }

    public void setCaseStatusSlug(String caseStatusSlug) {
        this.caseStatusSlug = caseStatusSlug;
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

    public Long getDisplayOrder() {
        return this.displayOrder;
    }

    public void setDisplayOrder(Long displayOrder) {
        this.displayOrder = displayOrder;
    }

    public MasterFtCaseStatus caseStatusCode(String caseStatusCode) {
        this.caseStatusCode = caseStatusCode;
        return this;
    }

    public MasterFtCaseStatus caseStatusDetails(String caseStatusDetails) {
        this.caseStatusDetails = caseStatusDetails;
        return this;
    }

    public MasterFtCaseStatus caseStatusSlug(String caseStatusSlug) {
        this.caseStatusSlug = caseStatusSlug;
        return this;
    }

    public MasterFtCaseStatus caseStatusImage(String caseStatusImage) {
        this.caseStatusImage = caseStatusImage;
        return this;
    }

    public MasterFtCaseStatus caseStatusColor(String caseStatusColor) {
        this.caseStatusColor = caseStatusColor;
        return this;
    }

    public MasterFtCaseStatus isActive(String isActive) {
        this.isActive = isActive;
        return this;
    }

    public MasterFtCaseStatus displayOrder(Long displayOrder) {
        this.displayOrder = displayOrder;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof MasterFtCaseStatus)) {
            return false;
        }
        MasterFtCaseStatus masterFtCaseStatus = (MasterFtCaseStatus) o;
        return Objects.equals(caseStatusCode, masterFtCaseStatus.caseStatusCode)
                && Objects.equals(caseStatusDetails, masterFtCaseStatus.caseStatusDetails)
                && Objects.equals(caseStatusSlug, masterFtCaseStatus.caseStatusSlug)
                && Objects.equals(caseStatusImage, masterFtCaseStatus.caseStatusImage)
                && Objects.equals(caseStatusColor, masterFtCaseStatus.caseStatusColor)
                && Objects.equals(isActive, masterFtCaseStatus.isActive)
                && Objects.equals(displayOrder, masterFtCaseStatus.displayOrder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(caseStatusCode, caseStatusDetails, caseStatusSlug, caseStatusImage, caseStatusColor,
                isActive, displayOrder);
    }

    @Override
    public String toString() {
        return "{" + " caseStatusCode='" + getCaseStatusCode() + "'" + ", caseStatusDetails='" + getCaseStatusDetails()
                + "'" + ", caseStatusSlug='" + getCaseStatusSlug() + "'" + ", caseStatusImage='" + getCaseStatusImage()
                + "'" + ", caseStatusColor='" + getCaseStatusColor() + "'" + ", isActive='" + getIsActive() + "'"
                + ", displayOrder='" + getDisplayOrder() + "'" + "}";
    }

}