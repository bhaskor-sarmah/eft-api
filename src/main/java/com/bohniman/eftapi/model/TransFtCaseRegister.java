package com.bohniman.eftapi.model;

import java.util.Objects;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

// import com.bohniman.eftapi.payload.FtCase;
// import com.bohniman.eftapi.payload.SpCaseDisposed;

@Entity
public class TransFtCaseRegister extends Auditable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private Long ftCaseId;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "fk_suspect_id", nullable = false)
	private TransSuspect suspect;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_suspect_type_code", nullable = true)
	private MasterSuspectType suspectType;

	private String suspectTypeOthers;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_final_opinion_code", nullable = true)
	private MasterFinalOpinion finalOpinion;

	// @Size(max = 30)
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_initial_Ft_code", nullable = false)
	private MasterFt initialFt;

	// @Size(max = 30)
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_final_Ft_code", nullable = false)
	private MasterFt finalFt;

	private String ftCaseNo;

	private String policeCaseNo;

	// @Size(max = 80)
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_ft_case_status_code", nullable = false)
	private MasterFtCaseStatus ftCaseStatus;

	private String remarks;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_current_status_code", nullable = false)
	private MasterCurrentStatus currentStatus;


	public TransFtCaseRegister() {
	}

	public TransFtCaseRegister(Long ftCaseId, TransSuspect suspect, MasterSuspectType suspectType, String suspectTypeOthers, MasterFinalOpinion finalOpinion, MasterFt initialFt, MasterFt finalFt, String ftCaseNo, String policeCaseNo, MasterFtCaseStatus ftCaseStatus, String remarks, MasterCurrentStatus currentStatus) {
		this.ftCaseId = ftCaseId;
		this.suspect = suspect;
		this.suspectType = suspectType;
		this.suspectTypeOthers = suspectTypeOthers;
		this.finalOpinion = finalOpinion;
		this.initialFt = initialFt;
		this.finalFt = finalFt;
		this.ftCaseNo = ftCaseNo;
		this.policeCaseNo = policeCaseNo;
		this.ftCaseStatus = ftCaseStatus;
		this.remarks = remarks;
		this.currentStatus = currentStatus;
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

	public MasterSuspectType getSuspectType() {
		return this.suspectType;
	}

	public void setSuspectType(MasterSuspectType suspectType) {
		this.suspectType = suspectType;
	}

	public String getSuspectTypeOthers() {
		return this.suspectTypeOthers;
	}

	public void setSuspectTypeOthers(String suspectTypeOthers) {
		this.suspectTypeOthers = suspectTypeOthers;
	}

	public MasterFinalOpinion getFinalOpinion() {
		return this.finalOpinion;
	}

	public void setFinalOpinion(MasterFinalOpinion finalOpinion) {
		this.finalOpinion = finalOpinion;
	}

	public MasterFt getInitialFt() {
		return this.initialFt;
	}

	public void setInitialFt(MasterFt initialFt) {
		this.initialFt = initialFt;
	}

	public MasterFt getFinalFt() {
		return this.finalFt;
	}

	public void setFinalFt(MasterFt finalFt) {
		this.finalFt = finalFt;
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

	public MasterFtCaseStatus getFtCaseStatus() {
		return this.ftCaseStatus;
	}

	public void setFtCaseStatus(MasterFtCaseStatus ftCaseStatus) {
		this.ftCaseStatus = ftCaseStatus;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public MasterCurrentStatus getCurrentStatus() {
		return this.currentStatus;
	}

	public void setCurrentStatus(MasterCurrentStatus currentStatus) {
		this.currentStatus = currentStatus;
	}

	public TransFtCaseRegister ftCaseId(Long ftCaseId) {
		this.ftCaseId = ftCaseId;
		return this;
	}

	public TransFtCaseRegister suspect(TransSuspect suspect) {
		this.suspect = suspect;
		return this;
	}

	public TransFtCaseRegister suspectType(MasterSuspectType suspectType) {
		this.suspectType = suspectType;
		return this;
	}

	public TransFtCaseRegister suspectTypeOthers(String suspectTypeOthers) {
		this.suspectTypeOthers = suspectTypeOthers;
		return this;
	}

	public TransFtCaseRegister finalOpinion(MasterFinalOpinion finalOpinion) {
		this.finalOpinion = finalOpinion;
		return this;
	}

	public TransFtCaseRegister initialFt(MasterFt initialFt) {
		this.initialFt = initialFt;
		return this;
	}

	public TransFtCaseRegister finalFt(MasterFt finalFt) {
		this.finalFt = finalFt;
		return this;
	}

	public TransFtCaseRegister ftCaseNo(String ftCaseNo) {
		this.ftCaseNo = ftCaseNo;
		return this;
	}

	public TransFtCaseRegister policeCaseNo(String policeCaseNo) {
		this.policeCaseNo = policeCaseNo;
		return this;
	}

	public TransFtCaseRegister ftCaseStatus(MasterFtCaseStatus ftCaseStatus) {
		this.ftCaseStatus = ftCaseStatus;
		return this;
	}

	public TransFtCaseRegister remarks(String remarks) {
		this.remarks = remarks;
		return this;
	}

	public TransFtCaseRegister currentStatus(MasterCurrentStatus currentStatus) {
		this.currentStatus = currentStatus;
		return this;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof TransFtCaseRegister)) {
			return false;
		}
		TransFtCaseRegister transFtCaseRegister = (TransFtCaseRegister) o;
		return Objects.equals(ftCaseId, transFtCaseRegister.ftCaseId) && Objects.equals(suspect, transFtCaseRegister.suspect) && Objects.equals(suspectType, transFtCaseRegister.suspectType) && Objects.equals(suspectTypeOthers, transFtCaseRegister.suspectTypeOthers) && Objects.equals(finalOpinion, transFtCaseRegister.finalOpinion) && Objects.equals(initialFt, transFtCaseRegister.initialFt) && Objects.equals(finalFt, transFtCaseRegister.finalFt) && Objects.equals(ftCaseNo, transFtCaseRegister.ftCaseNo) && Objects.equals(policeCaseNo, transFtCaseRegister.policeCaseNo) && Objects.equals(ftCaseStatus, transFtCaseRegister.ftCaseStatus) && Objects.equals(remarks, transFtCaseRegister.remarks) && Objects.equals(currentStatus, transFtCaseRegister.currentStatus);
	}

	@Override
	public int hashCode() {
		return Objects.hash(ftCaseId, suspect, suspectType, suspectTypeOthers, finalOpinion, initialFt, finalFt, ftCaseNo, policeCaseNo, ftCaseStatus, remarks, currentStatus);
	}

	@Override
	public String toString() {
		return "{" +
			" ftCaseId='" + getFtCaseId() + "'" +
			", suspect='" + getSuspect() + "'" +
			", suspectType='" + getSuspectType() + "'" +
			", suspectTypeOthers='" + getSuspectTypeOthers() + "'" +
			", finalOpinion='" + getFinalOpinion() + "'" +
			", initialFt='" + getInitialFt() + "'" +
			", finalFt='" + getFinalFt() + "'" +
			", ftCaseNo='" + getFtCaseNo() + "'" +
			", policeCaseNo='" + getPoliceCaseNo() + "'" +
			", ftCaseStatus='" + getFtCaseStatus() + "'" +
			", remarks='" + getRemarks() + "'" +
			", currentStatus='" + getCurrentStatus() + "'" +
			"}";
	}
	

}