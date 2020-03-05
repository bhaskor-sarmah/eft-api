package com.bohniman.eftapi.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;

@Entity
public class TransBiometricTemplate extends Auditable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private Long templateId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_suspect_id", nullable = false)
	private TransSuspect suspect;

	@Size(max = 300)
	private String offlineId;

	@Lob
	private byte[] leftThumbTmpl;

	@Lob
	private byte[] leftIndexTmpl;

	@Lob
	private byte[] leftMiddleTmpl;

	@Lob
	private byte[] leftRingTmpl;

	@Lob
	private byte[] leftLittleTmpl;

	@Lob
	private byte[] rightThumbTmpl;

	@Lob
	private byte[] rightIndexTmpl;

	@Lob
	private byte[] rightMiddleTmpl;

	@Lob
	private byte[] rightRingTmpl;

	@Lob
	private byte[] rightLittleTmpl;

	@Lob
	private byte[] leftIrisTmpl;

	@Lob
	private byte[] rightIrisTmpl;

	@Lob
	private byte[] leftPalmTmpl;

	@Lob
	private byte[] rightPalmTmpl;

	public TransBiometricTemplate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getTemplateId() {
		return templateId;
	}

	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
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

	public byte[] getLeftThumbTmpl() {
		return leftThumbTmpl;
	}

	public void setLeftThumbTmpl(byte[] leftThumbTmpl) {
		this.leftThumbTmpl = leftThumbTmpl;
	}

	public byte[] getLeftIndexTmpl() {
		return leftIndexTmpl;
	}

	public void setLeftIndexTmpl(byte[] leftIndexTmpl) {
		this.leftIndexTmpl = leftIndexTmpl;
	}

	public byte[] getLeftMiddleTmpl() {
		return leftMiddleTmpl;
	}

	public void setLeftMiddleTmpl(byte[] leftMiddleTmpl) {
		this.leftMiddleTmpl = leftMiddleTmpl;
	}

	public byte[] getLeftRingTmpl() {
		return leftRingTmpl;
	}

	public void setLeftRingTmpl(byte[] leftRingTmpl) {
		this.leftRingTmpl = leftRingTmpl;
	}

	public byte[] getLeftLittleTmpl() {
		return leftLittleTmpl;
	}

	public void setLeftLittleTmpl(byte[] leftLittleTmpl) {
		this.leftLittleTmpl = leftLittleTmpl;
	}

	public byte[] getRightThumbTmpl() {
		return rightThumbTmpl;
	}

	public void setRightThumbTmpl(byte[] rightThumbTmpl) {
		this.rightThumbTmpl = rightThumbTmpl;
	}

	public byte[] getRightIndexTmpl() {
		return rightIndexTmpl;
	}

	public void setRightIndexTmpl(byte[] rightIndexTmpl) {
		this.rightIndexTmpl = rightIndexTmpl;
	}

	public byte[] getRightMiddleTmpl() {
		return rightMiddleTmpl;
	}

	public void setRightMiddleTmpl(byte[] rightMiddleTmpl) {
		this.rightMiddleTmpl = rightMiddleTmpl;
	}

	public byte[] getRightRingTmpl() {
		return rightRingTmpl;
	}

	public void setRightRingTmpl(byte[] rightRingTmpl) {
		this.rightRingTmpl = rightRingTmpl;
	}

	public byte[] getRightLittleTmpl() {
		return rightLittleTmpl;
	}

	public void setRightLittleTmpl(byte[] rightLittleTmpl) {
		this.rightLittleTmpl = rightLittleTmpl;
	}

	public byte[] getLeftIrisTmpl() {
		return leftIrisTmpl;
	}

	public void setLeftIrisTmpl(byte[] leftIrisTmpl) {
		this.leftIrisTmpl = leftIrisTmpl;
	}

	public byte[] getRightIrisTmpl() {
		return rightIrisTmpl;
	}

	public void setRightIrisTmpl(byte[] rightIrisTmpl) {
		this.rightIrisTmpl = rightIrisTmpl;
	}

	public byte[] getLeftPalmTmpl() {
		return leftPalmTmpl;
	}

	public void setLeftPalmTmpl(byte[] leftPalmTmpl) {
		this.leftPalmTmpl = leftPalmTmpl;
	}

	public byte[] getRightPalmTmpl() {
		return rightPalmTmpl;
	}

	public void setRightPalmTmpl(byte[] rightPalmTmpl) {
		this.rightPalmTmpl = rightPalmTmpl;
	}

}
