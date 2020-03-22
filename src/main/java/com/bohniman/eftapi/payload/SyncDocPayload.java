package com.bohniman.eftapi.payload;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.util.Objects;

import com.bohniman.eftapi.model.TransFtOfflineDoc;

/**
 * SyncDocPayload
 */
@Component
public class SyncDocPayload {

    private TransFtOfflineDoc transFtOfflineDoc;
    private byte[] doc;
    private Long ftCaseId;


    public SyncDocPayload() {
    }

    public SyncDocPayload(TransFtOfflineDoc transFtOfflineDoc, byte[] doc, Long ftCaseId) {
        this.transFtOfflineDoc = transFtOfflineDoc;
        this.doc = doc;
        this.ftCaseId = ftCaseId;
    }

    public TransFtOfflineDoc getTransFtOfflineDoc() {
        return this.transFtOfflineDoc;
    }

    public void setTransFtOfflineDoc(TransFtOfflineDoc transFtOfflineDoc) {
        this.transFtOfflineDoc = transFtOfflineDoc;
    }

    public byte[] getDoc() {
        return this.doc;
    }

    public void setDoc(byte[] doc) {
        this.doc = doc;
    }

    public Long getFtCaseId() {
        return this.ftCaseId;
    }

    public void setFtCaseId(Long ftCaseId) {
        this.ftCaseId = ftCaseId;
    }

    public SyncDocPayload transFtOfflineDoc(TransFtOfflineDoc transFtOfflineDoc) {
        this.transFtOfflineDoc = transFtOfflineDoc;
        return this;
    }

    public SyncDocPayload doc(byte[] doc) {
        this.doc = doc;
        return this;
    }

    public SyncDocPayload ftCaseId(Long ftCaseId) {
        this.ftCaseId = ftCaseId;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof SyncDocPayload)) {
            return false;
        }
        SyncDocPayload syncDocPayload = (SyncDocPayload) o;
        return Objects.equals(transFtOfflineDoc, syncDocPayload.transFtOfflineDoc) && Objects.equals(doc, syncDocPayload.doc) && Objects.equals(ftCaseId, syncDocPayload.ftCaseId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transFtOfflineDoc, doc, ftCaseId);
    }

    @Override
    public String toString() {
        return "{" +
            " transFtOfflineDoc='" + getTransFtOfflineDoc() + "'" +
            ", doc='" + getDoc() + "'" +
            ", ftCaseId='" + getFtCaseId() + "'" +
            "}";
    }

    
}