package com.bohniman.eftapi.model;

import java.util.Objects;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;

/**
 * MasterFtDocument
 */
@Entity
public class MasterFtDocument extends Auditable {
    @Id
    @Basic(optional = false)
    @Size(max = 30)
    private String docCode;

    @Size(max = 300)
    private String docName;

    @Size(max = 30)
    private String isActive;

    public MasterFtDocument() {
    }

    public MasterFtDocument(String docCode, String docName, String isActive) {
        this.docCode = docCode;
        this.docName = docName;
        this.isActive = isActive;
    }

    public String getDocCode() {
        return this.docCode;
    }

    public void setDocCode(String docCode) {
        this.docCode = docCode;
    }

    public String getDocName() {
        return this.docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getIsActive() {
        return this.isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public MasterFtDocument docCode(String docCode) {
        this.docCode = docCode;
        return this;
    }

    public MasterFtDocument docName(String docName) {
        this.docName = docName;
        return this;
    }

    public MasterFtDocument isActive(String isActive) {
        this.isActive = isActive;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof MasterFtDocument)) {
            return false;
        }
        MasterFtDocument masterFtDocument = (MasterFtDocument) o;
        return Objects.equals(docCode, masterFtDocument.docCode) && Objects.equals(docName, masterFtDocument.docName)
                && Objects.equals(isActive, masterFtDocument.isActive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(docCode, docName, isActive);
    }

    @Override
    public String toString() {
        return "{" + " docCode='" + getDocCode() + "'" + ", docName='" + getDocName() + "'" + ", isActive='"
                + getIsActive() + "'" + "}";
    }

}