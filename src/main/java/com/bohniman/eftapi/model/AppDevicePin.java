package com.bohniman.eftapi.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "app_device_pin")
public class AppDevicePin extends Auditable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private Long pinId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_device_id", nullable = false)
	private AppDevice device;

	@Size(max = 30)
	private String passCode;

	@Size(max = 300)
	private String userName;

	@Size(max = 300)
	private String email;

	@Size(max = 30)
	private String mobileNo;

	@Size(max = 30)
	private String version;

	private String isActive;

	public AppDevicePin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getPinId() {
		return pinId;
	}

	public void setPinId(Long pinId) {
		this.pinId = pinId;
	}

	public AppDevice getDevice() {
		return device;
	}

	public void setDevice(AppDevice device) {
		this.device = device;
	}

	public String getPassCode() {
		return passCode;
	}

	public void setPassCode(String passCode) {
		this.passCode = passCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

}
