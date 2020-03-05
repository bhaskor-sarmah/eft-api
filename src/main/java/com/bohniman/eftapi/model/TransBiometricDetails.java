package com.bohniman.eftapi.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;

@Entity
public class TransBiometricDetails extends Auditable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private Long biometricId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_suspect_id", nullable = false)
	private TransSuspect suspect;

	@Size(max = 300)
	private String offlineId;

	@Size(max = 300)
	private String leftThumbPath;

	@Size(max = 300)
	private String leftIndexPath;

	@Size(max = 300)
	private String leftMiddlePath;

	@Size(max = 300)
	private String leftRingPath;

	@Size(max = 300)
	private String leftLittlePath;

	@Size(max = 300)
	private String rightThumbPath;

	@Size(max = 300)
	private String rightIndexPath;

	@Size(max = 300)
	private String rightMiddlePath;

	@Size(max = 300)
	private String rightRingPath;

	@Size(max = 300)
	private String rightLittlePath;

	@Size(max = 300)
	private String leftIrisPath;

	@Size(max = 300)
	private String rightIrisPath;

	@Size(max = 300)
	private String leftPalmPath;

	@Size(max = 300)
	private String rightPalmPath;

	public TransBiometricDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getBiometricId() {
		return biometricId;
	}

	public void setBiometricId(Long biometricId) {
		this.biometricId = biometricId;
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

	public String getLeftThumbPath() {
		return leftThumbPath;
	}

	public void setLeftThumbPath(String leftThumbPath) {
		this.leftThumbPath = leftThumbPath;
	}

	public String getLeftIndexPath() {
		return leftIndexPath;
	}

	public void setLeftIndexPath(String leftIndexPath) {
		this.leftIndexPath = leftIndexPath;
	}

	public String getLeftMiddlePath() {
		return leftMiddlePath;
	}

	public void setLeftMiddlePath(String leftMiddlePath) {
		this.leftMiddlePath = leftMiddlePath;
	}

	public String getLeftRingPath() {
		return leftRingPath;
	}

	public void setLeftRingPath(String leftRingPath) {
		this.leftRingPath = leftRingPath;
	}

	public String getLeftLittlePath() {
		return leftLittlePath;
	}

	public void setLeftLittlePath(String leftLittlePath) {
		this.leftLittlePath = leftLittlePath;
	}

	public String getRightThumbPath() {
		return rightThumbPath;
	}

	public void setRightThumbPath(String rightThumbPath) {
		this.rightThumbPath = rightThumbPath;
	}

	public String getRightIndexPath() {
		return rightIndexPath;
	}

	public void setRightIndexPath(String rightIndexPath) {
		this.rightIndexPath = rightIndexPath;
	}

	public String getRightMiddlePath() {
		return rightMiddlePath;
	}

	public void setRightMiddlePath(String rightMiddlePath) {
		this.rightMiddlePath = rightMiddlePath;
	}

	public String getRightRingPath() {
		return rightRingPath;
	}

	public void setRightRingPath(String rightRingPath) {
		this.rightRingPath = rightRingPath;
	}

	public String getRightLittlePath() {
		return rightLittlePath;
	}

	public void setRightLittlePath(String rightLittlePath) {
		this.rightLittlePath = rightLittlePath;
	}

	public String getLeftIrisPath() {
		return leftIrisPath;
	}

	public void setLeftIrisPath(String leftIrisPath) {
		this.leftIrisPath = leftIrisPath;
	}

	public String getRightIrisPath() {
		return rightIrisPath;
	}

	public void setRightIrisPath(String rightIrisPath) {
		this.rightIrisPath = rightIrisPath;
	}

	public String getLeftPalmPath() {
		return leftPalmPath;
	}

	public void setLeftPalmPath(String leftPalmPath) {
		this.leftPalmPath = leftPalmPath;
	}

	public String getRightPalmPath() {
		return rightPalmPath;
	}

	public void setRightPalmPath(String rightPalmPath) {
		this.rightPalmPath = rightPalmPath;
	}

}
