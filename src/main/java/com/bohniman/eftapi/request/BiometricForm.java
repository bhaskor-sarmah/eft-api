package com.bohniman.eftapi.request;

public class BiometricForm {
	private String fkSuspectId;
	private String offlineId;
	private byte[] leftThumb;
	private byte[] leftIndex;
	private byte[] leftMiddle;
	private byte[] leftRing;
	private byte[] leftLittle;
	private byte[] rightThumb;
	private byte[] rightIndex;
	private byte[] rightMiddle;
	private byte[] rightRing;
	private byte[] rightLittle;
	private byte[] leftIris;
	private byte[] rightIris;
	private String leftThumbTmpl;
	private String leftIndexTmpl;
	private String leftMiddleTmpl;
	private String leftRingTmpl;
	private String leftLittleTmpl;
	private String rightThumbTmpl;
	private String rightIndexTmpl;
	private String rightMiddleTmpl;
	private String rightRingTmpl;
	private String rightLittleTmpl;
	private String leftIrisTmpl;
	private String rightIrisTmpl;
	private boolean leftThumbFlag;
	private boolean leftIndexFlag;
	private boolean leftMiddleFlag;
	private boolean leftRingFlag;
	private boolean leftLittleFlag;
	private boolean rightThumbFlag;
	private boolean rightIndexFlag;
	private boolean rightMiddleFlag;
	private boolean rightRingFlag;
	private boolean rightLittleFlag;
	private boolean leftIrisFlag;
	private boolean rightIrisFlag;

	public BiometricForm() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getFkSuspectId() {
		return fkSuspectId;
	}

	public void setFkSuspectId(String fkSuspectId) {
		this.fkSuspectId = fkSuspectId;
	}

	public String getOfflineId() {
		return offlineId;
	}

	public void setOfflineId(String offlineId) {
		this.offlineId = offlineId;
	}

	public byte[] getLeftThumb() {
		return leftThumb;
	}

	public void setLeftThumb(byte[] leftThumb) {
		this.leftThumb = leftThumb;
	}

	public byte[] getLeftIndex() {
		return leftIndex;
	}

	public void setLeftIndex(byte[] leftIndex) {
		this.leftIndex = leftIndex;
	}

	public byte[] getLeftMiddle() {
		return leftMiddle;
	}

	public void setLeftMiddle(byte[] leftMiddle) {
		this.leftMiddle = leftMiddle;
	}

	public byte[] getLeftRing() {
		return leftRing;
	}

	public void setLeftRing(byte[] leftRing) {
		this.leftRing = leftRing;
	}

	public byte[] getLeftLittle() {
		return leftLittle;
	}

	public void setLeftLittle(byte[] leftLittle) {
		this.leftLittle = leftLittle;
	}

	public byte[] getRightThumb() {
		return rightThumb;
	}

	public void setRightThumb(byte[] rightThumb) {
		this.rightThumb = rightThumb;
	}

	public byte[] getRightIndex() {
		return rightIndex;
	}

	public void setRightIndex(byte[] rightIndex) {
		this.rightIndex = rightIndex;
	}

	public byte[] getRightMiddle() {
		return rightMiddle;
	}

	public void setRightMiddle(byte[] rightMiddle) {
		this.rightMiddle = rightMiddle;
	}

	public byte[] getRightRing() {
		return rightRing;
	}

	public void setRightRing(byte[] rightRing) {
		this.rightRing = rightRing;
	}

	public byte[] getRightLittle() {
		return rightLittle;
	}

	public void setRightLittle(byte[] rightLittle) {
		this.rightLittle = rightLittle;
	}

	public byte[] getLeftIris() {
		return leftIris;
	}

	public void setLeftIris(byte[] leftIris) {
		this.leftIris = leftIris;
	}

	public byte[] getRightIris() {
		return rightIris;
	}

	public void setRightIris(byte[] rightIris) {
		this.rightIris = rightIris;
	}

	public String getLeftThumbTmpl() {
		return leftThumbTmpl;
	}

	public void setLeftThumbTmpl(String leftThumbTmpl) {
		this.leftThumbTmpl = leftThumbTmpl;
	}

	public String getLeftIndexTmpl() {
		return leftIndexTmpl;
	}

	public void setLeftIndexTmpl(String leftIndexTmpl) {
		this.leftIndexTmpl = leftIndexTmpl;
	}

	public String getLeftMiddleTmpl() {
		return leftMiddleTmpl;
	}

	public void setLeftMiddleTmpl(String leftMiddleTmpl) {
		this.leftMiddleTmpl = leftMiddleTmpl;
	}

	public String getLeftRingTmpl() {
		return leftRingTmpl;
	}

	public void setLeftRingTmpl(String leftRingTmpl) {
		this.leftRingTmpl = leftRingTmpl;
	}

	public String getLeftLittleTmpl() {
		return leftLittleTmpl;
	}

	public void setLeftLittleTmpl(String leftLittleTmpl) {
		this.leftLittleTmpl = leftLittleTmpl;
	}

	public String getRightThumbTmpl() {
		return rightThumbTmpl;
	}

	public void setRightThumbTmpl(String rightThumbTmpl) {
		this.rightThumbTmpl = rightThumbTmpl;
	}

	public String getRightIndexTmpl() {
		return rightIndexTmpl;
	}

	public void setRightIndexTmpl(String rightIndexTmpl) {
		this.rightIndexTmpl = rightIndexTmpl;
	}

	public String getRightMiddleTmpl() {
		return rightMiddleTmpl;
	}

	public void setRightMiddleTmpl(String rightMiddleTmpl) {
		this.rightMiddleTmpl = rightMiddleTmpl;
	}

	public String getRightRingTmpl() {
		return rightRingTmpl;
	}

	public void setRightRingTmpl(String rightRingTmpl) {
		this.rightRingTmpl = rightRingTmpl;
	}

	public String getRightLittleTmpl() {
		return rightLittleTmpl;
	}

	public void setRightLittleTmpl(String rightLittleTmpl) {
		this.rightLittleTmpl = rightLittleTmpl;
	}

	public String getLeftIrisTmpl() {
		return leftIrisTmpl;
	}

	public void setLeftIrisTmpl(String leftIrisTmpl) {
		this.leftIrisTmpl = leftIrisTmpl;
	}

	public String getRightIrisTmpl() {
		return rightIrisTmpl;
	}

	public void setRightIrisTmpl(String rightIrisTmpl) {
		this.rightIrisTmpl = rightIrisTmpl;
	}

	public boolean isLeftThumbFlag() {
		return leftThumbFlag;
	}

	public void setLeftThumbFlag(boolean leftThumbFlag) {
		this.leftThumbFlag = leftThumbFlag;
	}

	public boolean isLeftIndexFlag() {
		return leftIndexFlag;
	}

	public void setLeftIndexFlag(boolean leftIndexFlag) {
		this.leftIndexFlag = leftIndexFlag;
	}

	public boolean isLeftMiddleFlag() {
		return leftMiddleFlag;
	}

	public void setLeftMiddleFlag(boolean leftMiddleFlag) {
		this.leftMiddleFlag = leftMiddleFlag;
	}

	public boolean isLeftRingFlag() {
		return leftRingFlag;
	}

	public void setLeftRingFlag(boolean leftRingFlag) {
		this.leftRingFlag = leftRingFlag;
	}

	public boolean isLeftLittleFlag() {
		return leftLittleFlag;
	}

	public void setLeftLittleFlag(boolean leftLittleFlag) {
		this.leftLittleFlag = leftLittleFlag;
	}

	public boolean isRightThumbFlag() {
		return rightThumbFlag;
	}

	public void setRightThumbFlag(boolean rightThumbFlag) {
		this.rightThumbFlag = rightThumbFlag;
	}

	public boolean isRightIndexFlag() {
		return rightIndexFlag;
	}

	public void setRightIndexFlag(boolean rightIndexFlag) {
		this.rightIndexFlag = rightIndexFlag;
	}

	public boolean isRightMiddleFlag() {
		return rightMiddleFlag;
	}

	public void setRightMiddleFlag(boolean rightMiddleFlag) {
		this.rightMiddleFlag = rightMiddleFlag;
	}

	public boolean isRightRingFlag() {
		return rightRingFlag;
	}

	public void setRightRingFlag(boolean rightRingFlag) {
		this.rightRingFlag = rightRingFlag;
	}

	public boolean isRightLittleFlag() {
		return rightLittleFlag;
	}

	public void setRightLittleFlag(boolean rightLittleFlag) {
		this.rightLittleFlag = rightLittleFlag;
	}

	public boolean isLeftIrisFlag() {
		return leftIrisFlag;
	}

	public void setLeftIrisFlag(boolean leftIrisFlag) {
		this.leftIrisFlag = leftIrisFlag;
	}

	public boolean isRightIrisFlag() {
		return rightIrisFlag;
	}

	public void setRightIrisFlag(boolean rightIrisFlag) {
		this.rightIrisFlag = rightIrisFlag;
	}

}
