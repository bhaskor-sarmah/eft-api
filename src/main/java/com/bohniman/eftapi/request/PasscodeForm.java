package com.bohniman.eftapi.request;

public class PasscodeForm {
	private String deviceId;
	private String macId;
	private String thanaCode;

	public PasscodeForm() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getMacId() {
		return macId;
	}

	public void setMacId(String macId) {
		this.macId = macId;
	}

	public String getThanaCode() {
		return thanaCode;
	}

	public void setThanaCode(String thanaCode) {
		this.thanaCode = thanaCode;
	}

}
