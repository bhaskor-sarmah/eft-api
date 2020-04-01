package com.bohniman.eftapi.payload;

import java.util.Objects;

import com.bohniman.eftapi.model.TransSuspect;

public class TransFtCaseRegisterPojo{

    private Long ftCaseId;

    private TransSuspect suspect;

    private String ftCode;

    private String ftCaseNo;

    private String policeCaseNo;

    private String ftCaseStatus;

    private String remarks;


    public TransFtCaseRegisterSync getSuspectSync(){
        TransFtCaseRegisterSync transFtCaseRegisterSync = new TransFtCaseRegisterSync();
        TransSuspectSync suspectSync = new TransSuspectSync(); 
        suspectSync.setSuspectId(this.suspect.getSuspectId());
        suspectSync.setInitiatedBy(this.suspect.getInitiatedBy());
        suspectSync.setTypeOfSuspect(this.suspect.getTypeOfSuspect());
        suspectSync.setFirstName(this.suspect.getFirstName());
        suspectSync.setMiddleName(this.suspect.getMiddleName());
        suspectSync.setLastName(this.suspect.getLastName());
        suspectSync.setFatherName(this.suspect.getFatherName());
        suspectSync.setMotherName(this.suspect.getMotherName());
        suspectSync.setDateOfBirth(this.suspect.getDateOfBirth());
        suspectSync.setPlaceOfBirth(this.suspect.getPlaceOfBirth());
        suspectSync.setAgeOnDate(this.suspect.getAgeOnDate());
        suspectSync.setAge(this.suspect.getAge());
            
        transFtCaseRegisterSync.setSuspect(suspectSync);

        transFtCaseRegisterSync.setFtCaseId(this.getFtCaseId());
        transFtCaseRegisterSync.setFtCode(this.getFtCode());
        transFtCaseRegisterSync.setFtCaseNo(this.getFtCaseNo());
        transFtCaseRegisterSync.setPoliceCaseNo(this.getPoliceCaseNo());
        transFtCaseRegisterSync.setFtCaseStatus(this.getFtCaseStatus());
        transFtCaseRegisterSync.setRemarks(this.getRemarks());

        return transFtCaseRegisterSync;
    }
    

    public TransFtCaseRegisterPojo() {
    }

    public TransFtCaseRegisterPojo(Long ftCaseId, TransSuspect suspect, String ftCode, String ftCaseNo, String policeCaseNo, String ftCaseStatus, String remarks) {
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

    public TransSuspect getSuspect() {
        return this.suspect;
    }

    public void setSuspect(TransSuspect suspect) {
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

    public TransFtCaseRegisterPojo ftCaseId(Long ftCaseId) {
        this.ftCaseId = ftCaseId;
        return this;
    }

    public TransFtCaseRegisterPojo suspect(TransSuspect suspect) {
        this.suspect = suspect;
        return this;
    }

    public TransFtCaseRegisterPojo ftCode(String ftCode) {
        this.ftCode = ftCode;
        return this;
    }

    public TransFtCaseRegisterPojo ftCaseNo(String ftCaseNo) {
        this.ftCaseNo = ftCaseNo;
        return this;
    }

    public TransFtCaseRegisterPojo policeCaseNo(String policeCaseNo) {
        this.policeCaseNo = policeCaseNo;
        return this;
    }

    public TransFtCaseRegisterPojo ftCaseStatus(String ftCaseStatus) {
        this.ftCaseStatus = ftCaseStatus;
        return this;
    }

    public TransFtCaseRegisterPojo remarks(String remarks) {
        this.remarks = remarks;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof TransFtCaseRegisterPojo)) {
            return false;
        }
        TransFtCaseRegisterPojo transFtCaseRegisterPojo = (TransFtCaseRegisterPojo) o;
        return Objects.equals(ftCaseId, transFtCaseRegisterPojo.ftCaseId) && Objects.equals(suspect, transFtCaseRegisterPojo.suspect) && Objects.equals(ftCode, transFtCaseRegisterPojo.ftCode) && Objects.equals(ftCaseNo, transFtCaseRegisterPojo.ftCaseNo) && Objects.equals(policeCaseNo, transFtCaseRegisterPojo.policeCaseNo) && Objects.equals(ftCaseStatus, transFtCaseRegisterPojo.ftCaseStatus) && Objects.equals(remarks, transFtCaseRegisterPojo.remarks);
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
