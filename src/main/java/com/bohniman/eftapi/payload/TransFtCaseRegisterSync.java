package com.bohniman.eftapi.payload;

import java.util.Objects;

/**
 * TransFtCaseRegisterSync
 */
public class TransFtCaseRegisterSync {
    
        private Long ftCaseId;
    
        private TransSuspectSync suspect;
    
        private String ftCode;
    
        private String ftCaseNo;
    
        private String policeCaseNo;
    
        private String ftCaseStatus;
    
        private String remarks;
    

    public TransFtCaseRegisterSync() {
    }

    public TransFtCaseRegisterSync(Long ftCaseId, TransSuspectSync suspect, String ftCode, String ftCaseNo, String policeCaseNo, String ftCaseStatus, String remarks) {
        this.ftCaseId = ftCaseId;
        this.suspect = suspect;
        this.ftCode = ftCode;
        this.ftCaseNo = ftCaseNo;
        this.policeCaseNo = policeCaseNo;
        this.ftCaseStatus = ftCaseStatus;
        this.remarks = remarks;
    }

    public Long getFtCaseId() {
        return this.ftCaseId;
    }

    public void setFtCaseId(Long ftCaseId) {
        this.ftCaseId = ftCaseId;
    }

    public TransSuspectSync getSuspect() {
        return this.suspect;
    }

    public void setSuspect(TransSuspectSync suspect) {
        this.suspect = suspect;
    }

    public String getFtCode() {
        return this.ftCode;
    }

    public void setFtCode(String ftCode) {
        this.ftCode = ftCode;
    }

    public String getFtCaseNo() {
        return this.ftCaseNo;
    }

    public void setFtCaseNo(String ftCaseNo) {
        this.ftCaseNo = ftCaseNo;
    }

    public String getPoliceCaseNo() {
        return this.policeCaseNo;
    }

    public void setPoliceCaseNo(String policeCaseNo) {
        this.policeCaseNo = policeCaseNo;
    }

    public String getFtCaseStatus() {
        return this.ftCaseStatus;
    }

    public void setFtCaseStatus(String ftCaseStatus) {
        this.ftCaseStatus = ftCaseStatus;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public TransFtCaseRegisterSync ftCaseId(Long ftCaseId) {
        this.ftCaseId = ftCaseId;
        return this;
    }

    public TransFtCaseRegisterSync suspect(TransSuspectSync suspect) {
        this.suspect = suspect;
        return this;
    }

    public TransFtCaseRegisterSync ftCode(String ftCode) {
        this.ftCode = ftCode;
        return this;
    }

    public TransFtCaseRegisterSync ftCaseNo(String ftCaseNo) {
        this.ftCaseNo = ftCaseNo;
        return this;
    }

    public TransFtCaseRegisterSync policeCaseNo(String policeCaseNo) {
        this.policeCaseNo = policeCaseNo;
        return this;
    }

    public TransFtCaseRegisterSync ftCaseStatus(String ftCaseStatus) {
        this.ftCaseStatus = ftCaseStatus;
        return this;
    }

    public TransFtCaseRegisterSync remarks(String remarks) {
        this.remarks = remarks;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof TransFtCaseRegisterSync)) {
            return false;
        }
        TransFtCaseRegisterSync transFtCaseRegisterSync = (TransFtCaseRegisterSync) o;
        return Objects.equals(ftCaseId, transFtCaseRegisterSync.ftCaseId) && Objects.equals(suspect, transFtCaseRegisterSync.suspect) && Objects.equals(ftCode, transFtCaseRegisterSync.ftCode) && Objects.equals(ftCaseNo, transFtCaseRegisterSync.ftCaseNo) && Objects.equals(policeCaseNo, transFtCaseRegisterSync.policeCaseNo) && Objects.equals(ftCaseStatus, transFtCaseRegisterSync.ftCaseStatus) && Objects.equals(remarks, transFtCaseRegisterSync.remarks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ftCaseId, suspect, ftCode, ftCaseNo, policeCaseNo, ftCaseStatus, remarks);
    }

    @Override
    public String toString() {
        return "{" +
            " ftCaseId='" + getFtCaseId() + "'" +
            ", suspect='" + getSuspect() + "'" +
            ", ftCode='" + getFtCode() + "'" +
            ", ftCaseNo='" + getFtCaseNo() + "'" +
            ", policeCaseNo='" + getPoliceCaseNo() + "'" +
            ", ftCaseStatus='" + getFtCaseStatus() + "'" +
            ", remarks='" + getRemarks() + "'" +
            "}";
    }
    
      
}