package com.bohniman.eftapi.model;

import java.util.Objects;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class TransFtCaseRegisterOffline extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Long ftCaseId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_suspect_id", nullable = false)
    private TransSuspect suspect;

    private String ftCode;

    private String ftCaseNo;

    private String policeCaseNo;

    private String ftCaseStatus;

    private String remarks;


	public TransFtCaseRegisterOffline() {
	}

	public TransFtCaseRegisterOffline(Long ftCaseId, TransSuspect suspect, String ftCode, String ftCaseNo, String policeCaseNo, String ftCaseStatus, String remarks) {
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

	public TransFtCaseRegisterOffline ftCaseId(Long ftCaseId) {
		this.ftCaseId = ftCaseId;
		return this;
	}

	public TransFtCaseRegisterOffline suspect(TransSuspect suspect) {
		this.suspect = suspect;
		return this;
	}

	public TransFtCaseRegisterOffline ftCode(String ftCode) {
		this.ftCode = ftCode;
		return this;
	}

	public TransFtCaseRegisterOffline ftCaseNo(String ftCaseNo) {
		this.ftCaseNo = ftCaseNo;
		return this;
	}

	public TransFtCaseRegisterOffline policeCaseNo(String policeCaseNo) {
		this.policeCaseNo = policeCaseNo;
		return this;
	}

	public TransFtCaseRegisterOffline ftCaseStatus(String ftCaseStatus) {
		this.ftCaseStatus = ftCaseStatus;
		return this;
	}

	public TransFtCaseRegisterOffline remarks(String remarks) {
		this.remarks = remarks;
		return this;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof TransFtCaseRegisterOffline)) {
			return false;
		}
		TransFtCaseRegisterOffline transFtCaseRegisterOffline = (TransFtCaseRegisterOffline) o;
		return Objects.equals(ftCaseId, transFtCaseRegisterOffline.ftCaseId) && Objects.equals(suspect, transFtCaseRegisterOffline.suspect) && Objects.equals(ftCode, transFtCaseRegisterOffline.ftCode) && Objects.equals(ftCaseNo, transFtCaseRegisterOffline.ftCaseNo) && Objects.equals(policeCaseNo, transFtCaseRegisterOffline.policeCaseNo) && Objects.equals(ftCaseStatus, transFtCaseRegisterOffline.ftCaseStatus) && Objects.equals(remarks, transFtCaseRegisterOffline.remarks);
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
