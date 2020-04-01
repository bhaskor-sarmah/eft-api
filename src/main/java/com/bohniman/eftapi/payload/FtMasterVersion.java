package com.bohniman.eftapi.payload;

import java.util.Objects;

public class FtMasterVersion {
    
    private String tableName;
    private String finalFtCode;
    private int maxId;


    public FtMasterVersion() {
    }

    public FtMasterVersion(String tableName, String finalFtCode, int maxId) {
        this.tableName = tableName;
        this.finalFtCode = finalFtCode;
        this.maxId = maxId;
    }

    public String getTableName() {
        return this.tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getFinalFtCode() {
        return this.finalFtCode;
    }

    public void setFinalFtCode(String finalFtCode) {
        this.finalFtCode = finalFtCode;
    }

    public int getMaxId() {
        return this.maxId;
    }

    public void setMaxId(int maxId) {
        this.maxId = maxId;
    }

    public FtMasterVersion tableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    public FtMasterVersion finalFtCode(String finalFtCode) {
        this.finalFtCode = finalFtCode;
        return this;
    }

    public FtMasterVersion maxId(int maxId) {
        this.maxId = maxId;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof FtMasterVersion)) {
            return false;
        }
        FtMasterVersion ftMasterVersion = (FtMasterVersion) o;
        return Objects.equals(tableName, ftMasterVersion.tableName) && Objects.equals(finalFtCode, ftMasterVersion.finalFtCode) && maxId == ftMasterVersion.maxId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableName, finalFtCode, maxId);
    }

    @Override
    public String toString() {
        return "{" +
            " tableName='" + getTableName() + "'" +
            ", finalFtCode='" + getFinalFtCode() + "'" +
            ", maxId='" + getMaxId() + "'" +
            "}";
    }
    
}