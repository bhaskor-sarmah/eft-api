package com.bohniman.eftapi.model;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * TransSuspectDoc
 */
@Entity
public class TransSuspectDoc extends Auditable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private Long docId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_suspect_id", nullable = false)
	private TransSuspect suspect;

	@Size(max = 300)
	private String offlineId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_doc_code", nullable = false)
	private MasterSuspectDocument document;

	@Size(max = 300)
	private String otherDocument;

	@Size(max = 300)
	private String docDetails;

	@Size(max = 500)
	private String docPath;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_comm_id", nullable = true)
	private TransCommunication communication;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_current_status_code", nullable = false)
	private MasterCurrentStatus currentStatus;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_suspect_state_code", nullable = false)
	private MasterState suspectState;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_suspect_district_code", nullable = false)
	private MasterDistrict suspectDistrict;

//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "fk_suspect_ft_code", nullable = true)
//	private MasterFt suspectFt;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_suspect_thana_code", nullable = false)
	private MasterThana suspectThana;

	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date capturedAt;

	@Size(max = 200)
	private String capturedBy;

	public TransSuspectDoc() {
	}

	public Long getDocId() {
		return docId;
	}

	public void setDocId(Long docId) {
		this.docId = docId;
	}

	public TransSuspect getSuspect() {
		return suspect;
	}

	public void setSuspect(TransSuspect suspect) {
		this.suspect = suspect;
	}

	public String getOfflineId() {
		return offlineId;
	}

	public void setOfflineId(String offlineId) {
		this.offlineId = offlineId;
	}

	public MasterSuspectDocument getDocument() {
		return document;
	}

	public void setDocument(MasterSuspectDocument document) {
		this.document = document;
	}

	public String getOtherDocument() {
		return otherDocument;
	}

	public void setOtherDocument(String otherDocument) {
		this.otherDocument = otherDocument;
	}

	public String getDocDetails() {
		return docDetails;
	}

	public void setDocDetails(String docDetails) {
		this.docDetails = docDetails;
	}

	public String getDocPath() {
		return docPath;
	}

	public void setDocPath(String docPath) {
		this.docPath = docPath;
	}

	public TransCommunication getCommunication() {
		return communication;
	}

	public void setCommunication(TransCommunication communication) {
		this.communication = communication;
	}

	public MasterCurrentStatus getCurrentStatus() {
		return currentStatus;
	}

	public void setCurrentStatus(MasterCurrentStatus currentStatus) {
		this.currentStatus = currentStatus;
	}

	public MasterState getSuspectState() {
		return suspectState;
	}

	public void setSuspectState(MasterState suspectState) {
		this.suspectState = suspectState;
	}

	public MasterDistrict getSuspectDistrict() {
		return suspectDistrict;
	}

	public void setSuspectDistrict(MasterDistrict suspectDistrict) {
		this.suspectDistrict = suspectDistrict;
	}

//	public MasterFt getSuspectFt() {
//		return suspectFt;
//	}
//
//	public void setSuspectFt(MasterFt suspectFt) {
//		this.suspectFt = suspectFt;
//	}

	public MasterThana getSuspectThana() {
		return suspectThana;
	}

	public void setSuspectThana(MasterThana suspectThana) {
		this.suspectThana = suspectThana;
	}

	public Date getCapturedAt() {
		return capturedAt;
	}

	public void setCapturedAt(Date capturedAt) {
		this.capturedAt = capturedAt;
	}

	public String getCapturedBy() {
		return capturedBy;
	}

	public void setCapturedBy(String capturedBy) {
		this.capturedBy = capturedBy;
	}

}