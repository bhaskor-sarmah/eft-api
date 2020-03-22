package com.bohniman.eftapi.model;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * TransFtOfflineDoc
 */
@Entity
public class TransFtOfflineDoc extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Long docId;

    @Size(max = 300)
    private String docDetails;

    @Size(max = 500)
    private String docPath;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_doc_type_code", nullable = true)
    private MasterFtDocument docType;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_suspect_id", nullable = true)
    private TransSuspect suspect;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date trialDate;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_ft_case_id", nullable = true)
    private TransFtCaseRegisterOffline ftCaseRegister;

    @Column(columnDefinition = "varchar(20) default 'NOT_SYNC'")
    private String syncStatus;

    private Long ftCaseId;


    public TransFtOfflineDoc() {
    }

    public TransFtOfflineDoc(Long docId, String docDetails, String docPath, MasterFtDocument docType, TransSuspect suspect, Date trialDate, TransFtCaseRegisterOffline ftCaseRegister, String syncStatus, Long ftCaseId) {
        this.docId = docId;
        this.docDetails = docDetails;
        this.docPath = docPath;
        this.docType = docType;
        this.suspect = suspect;
        this.trialDate = trialDate;
        this.ftCaseRegister = ftCaseRegister;
        this.syncStatus = syncStatus;
        this.ftCaseId = ftCaseId;
    }

    public Long getDocId() {
        return this.docId;
    }

    public void setDocId(Long docId) {
        this.docId = docId;
    }

    public String getDocDetails() {
        return this.docDetails;
    }

    public void setDocDetails(String docDetails) {
        this.docDetails = docDetails;
    }

    public String getDocPath() {
        return this.docPath;
    }

    public void setDocPath(String docPath) {
        this.docPath = docPath;
    }

    public MasterFtDocument getDocType() {
        return this.docType;
    }

    public void setDocType(MasterFtDocument docType) {
        this.docType = docType;
    }

    public TransSuspect getSuspect() {
        return this.suspect;
    }

    public void setSuspect(TransSuspect suspect) {
        this.suspect = suspect;
    }

    public Date getTrialDate() {
        return this.trialDate;
    }

    public void setTrialDate(Date trialDate) {
        this.trialDate = trialDate;
    }

    public TransFtCaseRegisterOffline getFtCaseRegister() {
        return this.ftCaseRegister;
    }

    public void setFtCaseRegister(TransFtCaseRegisterOffline ftCaseRegister) {
        this.ftCaseRegister = ftCaseRegister;
    }

    public String getSyncStatus() {
        return this.syncStatus;
    }

    public void setSyncStatus(String syncStatus) {
        this.syncStatus = syncStatus;
    }

    public Long getFtCaseId() {
        return this.ftCaseId;
    }

    public void setFtCaseId(Long ftCaseId) {
        this.ftCaseId = ftCaseId;
    }

    public TransFtOfflineDoc docId(Long docId) {
        this.docId = docId;
        return this;
    }

    public TransFtOfflineDoc docDetails(String docDetails) {
        this.docDetails = docDetails;
        return this;
    }

    public TransFtOfflineDoc docPath(String docPath) {
        this.docPath = docPath;
        return this;
    }

    public TransFtOfflineDoc docType(MasterFtDocument docType) {
        this.docType = docType;
        return this;
    }

    public TransFtOfflineDoc suspect(TransSuspect suspect) {
        this.suspect = suspect;
        return this;
    }

    public TransFtOfflineDoc trialDate(Date trialDate) {
        this.trialDate = trialDate;
        return this;
    }

    public TransFtOfflineDoc ftCaseRegister(TransFtCaseRegisterOffline ftCaseRegister) {
        this.ftCaseRegister = ftCaseRegister;
        return this;
    }

    public TransFtOfflineDoc syncStatus(String syncStatus) {
        this.syncStatus = syncStatus;
        return this;
    }

    public TransFtOfflineDoc ftCaseId(Long ftCaseId) {
        this.ftCaseId = ftCaseId;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof TransFtOfflineDoc)) {
            return false;
        }
        TransFtOfflineDoc transFtOfflineDoc = (TransFtOfflineDoc) o;
        return Objects.equals(docId, transFtOfflineDoc.docId) && Objects.equals(docDetails, transFtOfflineDoc.docDetails) && Objects.equals(docPath, transFtOfflineDoc.docPath) && Objects.equals(docType, transFtOfflineDoc.docType) && Objects.equals(suspect, transFtOfflineDoc.suspect) && Objects.equals(trialDate, transFtOfflineDoc.trialDate) && Objects.equals(ftCaseRegister, transFtOfflineDoc.ftCaseRegister) && Objects.equals(syncStatus, transFtOfflineDoc.syncStatus) && Objects.equals(ftCaseId, transFtOfflineDoc.ftCaseId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(docId, docDetails, docPath, docType, suspect, trialDate, ftCaseRegister, syncStatus, ftCaseId);
    }

    @Override
    public String toString() {
        return "{" +
            " docId='" + getDocId() + "'" +
            ", docDetails='" + getDocDetails() + "'" +
            ", docPath='" + getDocPath() + "'" +
            ", docType='" + getDocType() + "'" +
            ", suspect='" + getSuspect() + "'" +
            ", trialDate='" + getTrialDate() + "'" +
            ", ftCaseRegister='" + getFtCaseRegister() + "'" +
            ", syncStatus='" + getSyncStatus() + "'" +
            ", ftCaseId='" + getFtCaseId() + "'" +
            "}";
    }

}