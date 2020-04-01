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
public class MasterSuspectType {

    @Id
    @Basic(optional = false)
    @Size(max = 30)
    private String suspectTypeCode;

    @Size(max = 300)
    private String suspectTypeDetails;

    @Size(max = 30)
    private String isActive;

    public MasterSuspectType() {
    }

    public MasterSuspectType(String suspectTypeCode, String suspectTypeDetails, String isActive) {
        this.suspectTypeCode = suspectTypeCode;
        this.suspectTypeDetails = suspectTypeDetails;
        this.isActive = isActive;
    }

    public String getSuspectTypeCode() {
        return this.suspectTypeCode;
    }

    public void setSuspectTypeCode(String suspectTypeCode) {
        this.suspectTypeCode = suspectTypeCode;
    }

    public String getSuspectTypeDetails() {
        return this.suspectTypeDetails;
    }

    public void setSuspectTypeDetails(String suspectTypeDetails) {
        this.suspectTypeDetails = suspectTypeDetails;
    }

    public String getIsActive() {
        return this.isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public MasterSuspectType suspectTypeCode(String suspectTypeCode) {
        this.suspectTypeCode = suspectTypeCode;
        return this;
    }

    public MasterSuspectType suspectTypeDetails(String suspectTypeDetails) {
        this.suspectTypeDetails = suspectTypeDetails;
        return this;
    }

    public MasterSuspectType isActive(String isActive) {
        this.isActive = isActive;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof MasterSuspectType)) {
            return false;
        }
        MasterSuspectType masterSuspectType = (MasterSuspectType) o;
        return Objects.equals(suspectTypeCode, masterSuspectType.suspectTypeCode)
                && Objects.equals(suspectTypeDetails, masterSuspectType.suspectTypeDetails)
                && Objects.equals(isActive, masterSuspectType.isActive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(suspectTypeCode, suspectTypeDetails, isActive);
    }

    @Override
    public String toString() {
        return "{" + " suspectTypeCode='" + getSuspectTypeCode() + "'" + ", suspectTypeDetails='"
                + getSuspectTypeDetails() + "'" + ", isActive='" + getIsActive() + "'" + "}";
    }

}
