package com.bohniman.eftapi.request;

import java.util.Date;

import javax.persistence.Basic;
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

import com.bohniman.eftapi.model.MasterAddressType;
import com.bohniman.eftapi.model.MasterCountry;
import com.bohniman.eftapi.model.MasterCurrentStatus;
import com.bohniman.eftapi.model.MasterDistrict;
import com.bohniman.eftapi.model.MasterFt;
import com.bohniman.eftapi.model.MasterState;
import com.bohniman.eftapi.model.MasterThana;
import com.bohniman.eftapi.model.MasterVillage;
import com.bohniman.eftapi.model.TransSuspect;

public class AddressRequest {

	private String fkAddressTypeCode;
	private String offlineId;
	private String fkCountryCode;
	private String otherCountry;
	private String fkStateCode;
	private String otherState;
	private String fkDistrictCode;
	private String otherDistrict;
	private String fkThanaCode;
	private String otherThana;
	private String fkVillageCode;
	private String otherVillage;
	private String latitude;
	private String longitude;
	private String postOffice;
	private String pinCode;
	private String houseNo;
	private String houseOwnerName;
	private String houseOwnerPhoneNo;
	private String villageHeadName;
	private String villageHeadPhoneNo;
	private String revenueVillageName;
	private String deviceId;
	private String ipAddress;
	private Date capturedAt;
	private String capturedBy;

//	private String fkCurrentStatusCode;
//	private String fkSuspectStateCode;
//	private String fkSuspectDistrictCode;
//	private MasterFt fkSuspectFtCode;
//	private MasterThana fkSuspectThanaCode;

	public AddressRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getFkAddressTypeCode() {
		return fkAddressTypeCode;
	}

	public void setFkAddressTypeCode(String fkAddressTypeCode) {
		this.fkAddressTypeCode = fkAddressTypeCode;
	}

	
	public String getOfflineId() {
		return offlineId;
	}

	public void setOfflineId(String offlineId) {
		this.offlineId = offlineId;
	}

	public String getFkCountryCode() {
		return fkCountryCode;
	}

	public void setFkCountryCode(String fkCountryCode) {
		this.fkCountryCode = fkCountryCode;
	}

	public String getOtherCountry() {
		return otherCountry;
	}

	public void setOtherCountry(String otherCountry) {
		this.otherCountry = otherCountry;
	}

	public String getFkStateCode() {
		return fkStateCode;
	}

	public void setFkStateCode(String fkStateCode) {
		this.fkStateCode = fkStateCode;
	}

	public String getOtherState() {
		return otherState;
	}

	public void setOtherState(String otherState) {
		this.otherState = otherState;
	}

	public String getFkDistrictCode() {
		return fkDistrictCode;
	}

	public void setFkDistrictCode(String fkDistrictCode) {
		this.fkDistrictCode = fkDistrictCode;
	}

	public String getOtherDistrict() {
		return otherDistrict;
	}

	public void setOtherDistrict(String otherDistrict) {
		this.otherDistrict = otherDistrict;
	}

	public String getFkThanaCode() {
		return fkThanaCode;
	}

	public void setFkThanaCode(String fkThanaCode) {
		this.fkThanaCode = fkThanaCode;
	}

	public String getOtherThana() {
		return otherThana;
	}

	public void setOtherThana(String otherThana) {
		this.otherThana = otherThana;
	}

	public String getFkVillageCode() {
		return fkVillageCode;
	}

	public void setFkVillageCode(String fkVillageCode) {
		this.fkVillageCode = fkVillageCode;
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

	
}
