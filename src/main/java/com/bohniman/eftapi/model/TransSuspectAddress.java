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
 * TransSuspectAddress
 */
@Entity
public class TransSuspectAddress extends Auditable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private Long addressId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_address_type_code", nullable = false)
	private MasterAddressType addressType;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_suspect_id", nullable = false)
	private TransSuspect suspect;

	@Size(max = 300)
	private String offlineId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_country_code", nullable = true)
	private MasterCountry country;
	@Size(max = 300)
	private String otherCountry;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_state_code", nullable = true)
	private MasterState state;
	@Size(max = 300)
	private String otherState;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_district_code", nullable = true)
	private MasterDistrict district;
	@Size(max = 300)
	private String otherDistrict;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_thana_code", nullable = true)
	private MasterThana thana;
	@Size(max = 300)
	private String otherThana;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_village_code", nullable = true)
	private MasterVillage village;
	@Size(max = 300)
	private String otherVillage;

	@Size(max = 200)
	private String latitude;
	@Size(max = 200)
	private String longitude;
	@Size(max = 300)
	private String postOffice;
	@Size(max = 30)
	private String pinCode;
	@Size(max = 200)
	private String houseNo;
	@Size(max = 300)
	private String villageHeadName;
	@Size(max = 30)
	private String villageHeadPhoneNo;
	@Size(max = 300)
	private String revenueVillageName;
	@Size(max = 300)
	private String houseOwnerName;
	@Size(max = 30)
	private String houseOwnerPhoneNo;

	@Size(max = 200)
	private String deviceId;
	@Size(max = 80)
	private String ipAddress;

	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date capturedAt;
	
	@Size(max = 200)
	private String capturedBy;

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

	public TransSuspectAddress() {
	}

	public Long getAddressId() {
		return addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	public MasterAddressType getAddressType() {
		return addressType;
	}

	public void setAddressType(MasterAddressType addressType) {
		this.addressType = addressType;
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

	public MasterCountry getCountry() {
		return country;
	}

	public void setCountry(MasterCountry country) {
		this.country = country;
	}

	public String getOtherCountry() {
		return otherCountry;
	}

	public void setOtherCountry(String otherCountry) {
		this.otherCountry = otherCountry;
	}

	public MasterState getState() {
		return state;
	}

	public void setState(MasterState state) {
		this.state = state;
	}

	public String getOtherState() {
		return otherState;
	}

	public void setOtherState(String otherState) {
		this.otherState = otherState;
	}

	public MasterDistrict getDistrict() {
		return district;
	}

	public void setDistrict(MasterDistrict district) {
		this.district = district;
	}

	public String getOtherDistrict() {
		return otherDistrict;
	}

	public void setOtherDistrict(String otherDistrict) {
		this.otherDistrict = otherDistrict;
	}

	public MasterThana getThana() {
		return thana;
	}

	public void setThana(MasterThana thana) {
		this.thana = thana;
	}

	public String getOtherThana() {
		return otherThana;
	}

	public void setOtherThana(String otherThana) {
		this.otherThana = otherThana;
	}

	public MasterVillage getVillage() {
		return village;
	}

	public void setVillage(MasterVillage village) {
		this.village = village;
	}

	public String getOtherVillage() {
		return otherVillage;
	}

	public void setOtherVillage(String otherVillage) {
		this.otherVillage = otherVillage;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getPostOffice() {
		return postOffice;
	}

	public void setPostOffice(String postOffice) {
		this.postOffice = postOffice;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getVillageHeadName() {
		return villageHeadName;
	}

	public void setVillageHeadName(String villageHeadName) {
		this.villageHeadName = villageHeadName;
	}

	public String getVillageHeadPhoneNo() {
		return villageHeadPhoneNo;
	}

	public void setVillageHeadPhoneNo(String villageHeadPhoneNo) {
		this.villageHeadPhoneNo = villageHeadPhoneNo;
	}

	public String getRevenueVillageName() {
		return revenueVillageName;
	}

	public void setRevenueVillageName(String revenueVillageName) {
		this.revenueVillageName = revenueVillageName;
	}

	public String getHouseOwnerName() {
		return houseOwnerName;
	}

	public void setHouseOwnerName(String houseOwnerName) {
		this.houseOwnerName = houseOwnerName;
	}

	public String getHouseOwnerPhoneNo() {
		return houseOwnerPhoneNo;
	}

	public void setHouseOwnerPhoneNo(String houseOwnerPhoneNo) {
		this.houseOwnerPhoneNo = houseOwnerPhoneNo;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
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

}