package com.bohniman.eftapi.payload;

import java.util.List;
import java.util.Objects;

import com.bohniman.eftapi.model.MasterFtDocument;

import org.springframework.stereotype.Component;

/**
 * FtMasterTableSync
 */
@Component
public class FtMasterTableSync {

    private int found;
    private List<TransFtCaseRegisterSync> transFtCaseRegisterList;
    private List<MasterFtDocument> masterFtDocumentList;
    


    public FtMasterTableSync() {
    }

    public FtMasterTableSync(int found, List<TransFtCaseRegisterSync> transFtCaseRegisterList, List<MasterFtDocument> masterFtDocumentList) {
        this.found = found;
        this.transFtCaseRegisterList = transFtCaseRegisterList;
        this.masterFtDocumentList = masterFtDocumentList;
    }

    public int getFound() {
        return this.found;
    }

    public void setFound(int found) {
        this.found = found;
    }

    public List<TransFtCaseRegisterSync> getTransFtCaseRegisterList() {
        return this.transFtCaseRegisterList;
    }

    public void setTransFtCaseRegisterList(List<TransFtCaseRegisterSync> transFtCaseRegisterList) {
        this.transFtCaseRegisterList = transFtCaseRegisterList;
    }

    public List<MasterFtDocument> getMasterFtDocumentList() {
        return this.masterFtDocumentList;
    }

    public void setMasterFtDocumentList(List<MasterFtDocument> masterFtDocumentList) {
        this.masterFtDocumentList = masterFtDocumentList;
    }

    public FtMasterTableSync found(int found) {
        this.found = found;
        return this;
    }

    public FtMasterTableSync transFtCaseRegisterList(List<TransFtCaseRegisterSync> transFtCaseRegisterList) {
        this.transFtCaseRegisterList = transFtCaseRegisterList;
        return this;
    }

    public FtMasterTableSync masterFtDocumentList(List<MasterFtDocument> masterFtDocumentList) {
        this.masterFtDocumentList = masterFtDocumentList;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof FtMasterTableSync)) {
            return false;
        }
        FtMasterTableSync ftMasterTableSync = (FtMasterTableSync) o;
        return found == ftMasterTableSync.found && Objects.equals(transFtCaseRegisterList, ftMasterTableSync.transFtCaseRegisterList) && Objects.equals(masterFtDocumentList, ftMasterTableSync.masterFtDocumentList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(found, transFtCaseRegisterList, masterFtDocumentList);
    }

    @Override
    public String toString() {
        return "{" +
            " found='" + getFound() + "'" +
            ", transFtCaseRegisterList='" + getTransFtCaseRegisterList() + "'" +
            ", masterFtDocumentList='" + getMasterFtDocumentList() + "'" +
            "}";
    }
    

}