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
 * TransSuspectFamily
 */
@Entity
public class TransSuspectFamily extends Auditable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private Long memberId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_suspect_id", nullable = false)
	private TransSuspect suspect;

	@Size(max = 300)
	private String offlineId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_relation_code", nullable = false)
	private MasterRelation relation;

	@Size(max = 500)
	private String memberName;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_gender_code", nullable = true)
	private MasterGender gender;
	private Date dateOfBirth;

	@Size(max = 100)
	private String age;
	@Size(max = 100)
	private String ageOnDate;
	@Size(max = 500)
	private String placeOfBirth;
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

	public TransSuspectFamily() {
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
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

	public MasterRelation getRelation() {
		return relation;
	}

	public void setRelation(MasterRelation relation) {
		this.relation = relation;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public MasterGender getGender() {
		return gender;
	}

	public void setGender(MasterGender gender) {
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAgeOnDate() {
		return ageOnDate;
	}

	public void setAgeOnDate(String ageOnDate) {
		this.ageOnDate = ageOnDate;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
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