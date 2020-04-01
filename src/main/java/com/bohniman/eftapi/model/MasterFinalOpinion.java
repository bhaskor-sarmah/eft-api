package com.bohniman.eftapi.model;

import java.util.Objects;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;

/**
 * MasterSuspectType
 */

@Entity
public class MasterFinalOpinion {

    @Id
    @Basic(optional = false)
    @Size(max = 30)
    private String finalOpinionCode;

    @Size(max = 300)
    private String finalOpinionDetails;

    @Size(max = 30)
    private String isActive;

    public MasterFinalOpinion() {
    }

    public MasterFinalOpinion(String finalOpinionCode, String finalOpinionDetails, String isActive) {
        this.finalOpinionCode = finalOpinionCode;
        this.finalOpinionDetails = finalOpinionDetails;
        this.isActive = isActive;
    }

    public String getFinalOpinionCode() {
        return this.finalOpinionCode;
    }

    public void setFinalOpinionCode(String finalOpinionCode) {
        this.finalOpinionCode = finalOpinionCode;
    }

    public String getFinalOpinionDetails() {
        return this.finalOpinionDetails;
    }

    public void setFinalOpinionDetails(String finalOpinionDetails) {
        this.finalOpinionDetails = finalOpinionDetails;
    }

    public String getIsActive() {
        return this.isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public MasterFinalOpinion finalOpinionCode(String finalOpinionCode) {
        this.finalOpinionCode = finalOpinionCode;
        return this;
    }

    public MasterFinalOpinion finalOpinionDetails(String finalOpinionDetails) {
        this.finalOpinionDetails = finalOpinionDetails;
        return this;
    }

    public MasterFinalOpinion isActive(String isActive) {
        this.isActive = isActive;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof MasterFinalOpinion)) {
            return false;
        }
        MasterFinalOpinion masterFinalOpinion = (MasterFinalOpinion) o;
        return Objects.equals(finalOpinionCode, masterFinalOpinion.finalOpinionCode)
                && Objects.equals(finalOpinionDetails, masterFinalOpinion.finalOpinionDetails)
                && Objects.equals(isActive, masterFinalOpinion.isActive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(finalOpinionCode, finalOpinionDetails, isActive);
    }

    @Override
    public String toString() {
        return "{" + " finalOpinionCode='" + getFinalOpinionCode() + "'" + ", finalOpinionDetails='"
                + getFinalOpinionDetails() + "'" + ", isActive='" + getIsActive() + "'" + "}";
    }

}