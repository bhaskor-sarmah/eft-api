package com.bohniman.eftapi.payload;

import java.util.Objects;

/**
 * FtPayload
 */
public class FtPayload {

    private String ftCode;
	private String ftName;
   

    public FtPayload() {
    }

    public FtPayload(String ftCode, String ftName) {
        this.ftCode = ftCode;
        this.ftName = ftName;
    }

    public String getFtCode() {
        return this.ftCode;
    }

    public void setFtCode(String ftCode) {
        this.ftCode = ftCode;
    }

    public String getFtName() {
        return this.ftName;
    }

    public void setFtName(String ftName) {
        this.ftName = ftName;
    }

    public FtPayload ftCode(String ftCode) {
        this.ftCode = ftCode;
        return this;
    }

    public FtPayload ftName(String ftName) {
        this.ftName = ftName;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof FtPayload)) {
            return false;
        }
        FtPayload ftPayload = (FtPayload) o;
        return Objects.equals(ftCode, ftPayload.ftCode) && Objects.equals(ftName, ftPayload.ftName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ftCode, ftName);
    }

    @Override
    public String toString() {
        return "{" +
            " ftCode='" + getFtCode() + "'" +
            ", ftName='" + getFtName() + "'" +
            "}";
    }

}