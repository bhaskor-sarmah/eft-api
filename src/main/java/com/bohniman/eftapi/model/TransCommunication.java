package com.bohniman.eftapi.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class TransCommunication extends Auditable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private Long commId;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_suspect_id", nullable = false)
	private TransSuspect suspect;

	// @Size(min = 3, max = 400, message = "*Minimum 3 / Maximum 400 characters
	// allowed")
	private String comment;

	@Size(min = 3, max = 400, message = "*Minimum 3 / Maximum 400 characters allowed")
	private String recommendation;

	@Column(columnDefinition = "tinyint (1) default 0")
	private Boolean hasReadBySp = false;

	@Column(columnDefinition = "tinyint (1) default 0")
	private Boolean hasReadByFt = false;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_user_to_id", nullable = false)
	private User userTo;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_comm_type_id", nullable = false)
	private MasterCommunicationType commType;

	@Size(max = 30)
	private String communicationStatus; // Open/Closed

	@Size(max = 30)
	private String roleTo;

	@Size(max = 30)
	private String roleFrom;

	@Column(columnDefinition = "tinyint (1) default 0")
	private Boolean isForwardableBySp;

	@Column(columnDefinition = "tinyint (1) default 0")
	private Boolean isForwardableByFt;

	@Column(columnDefinition = "tinyint (1) default 0")
	private Boolean isTabSynced;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_current_status_code", nullable = false)
	private MasterCurrentStatus currentStatus;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_suspect_district_code", nullable = false)
	private MasterDistrict suspectDistrict;

//	@JsonIgnore
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "fk_suspect_ft_code", nullable = true)
//	private MasterFt suspectFt;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_suspect_thana_code", nullable = false)
	private MasterThana suspectThana;

	@ManyToOne
	@JoinColumn(name = "parent_comm_id")
	private TransCommunication parentCommunication;

	@OneToMany(mappedBy = "parentCommunication")
	private List<TransCommunication> subCommunications = new ArrayList<>();

	@OneToMany(mappedBy = "communication")
	private List<TransSuspectDoc> communicationDocs = new ArrayList<>();

	public TransCommunication() {
	}

	public Long getCommId() {
		return commId;
	}

	public void setCommId(Long commId) {
		this.commId = commId;
	}

	public TransSuspect getSuspect() {
		return suspect;
	}

	public void setSuspect(TransSuspect suspect) {
		this.suspect = suspect;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getRecommendation() {
		return recommendation;
	}

	public void setRecommendation(String recommendation) {
		this.recommendation = recommendation;
	}

	public Boolean getHasReadBySp() {
		return hasReadBySp;
	}

	public void setHasReadBySp(Boolean hasReadBySp) {
		this.hasReadBySp = hasReadBySp;
	}

	public Boolean getHasReadByFt() {
		return hasReadByFt;
	}

	public void setHasReadByFt(Boolean hasReadByFt) {
		this.hasReadByFt = hasReadByFt;
	}

	public User getUserTo() {
		return userTo;
	}

	public void setUserTo(User userTo) {
		this.userTo = userTo;
	}

	public MasterCommunicationType getCommType() {
		return commType;
	}

	public void setCommType(MasterCommunicationType commType) {
		this.commType = commType;
	}

	public String getCommunicationStatus() {
		return communicationStatus;
	}

	public void setCommunicationStatus(String communicationStatus) {
		this.communicationStatus = communicationStatus;
	}

	public String getRoleTo() {
		return roleTo;
	}

	public void setRoleTo(String roleTo) {
		this.roleTo = roleTo;
	}

	public String getRoleFrom() {
		return roleFrom;
	}

	public void setRoleFrom(String roleFrom) {
		this.roleFrom = roleFrom;
	}

	public Boolean getIsForwardableBySp() {
		return isForwardableBySp;
	}

	public void setIsForwardableBySp(Boolean isForwardableBySp) {
		this.isForwardableBySp = isForwardableBySp;
	}

	public Boolean getIsForwardableByFt() {
		return isForwardableByFt;
	}

	public void setIsForwardableByFt(Boolean isForwardableByFt) {
		this.isForwardableByFt = isForwardableByFt;
	}

	public Boolean getIsTabSynced() {
		return isTabSynced;
	}

	public void setIsTabSynced(Boolean isTabSynced) {
		this.isTabSynced = isTabSynced;
	}

	public MasterCurrentStatus getCurrentStatus() {
		return currentStatus;
	}

	public void setCurrentStatus(MasterCurrentStatus currentStatus) {
		this.currentStatus = currentStatus;
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

	public TransCommunication getParentCommunication() {
		return parentCommunication;
	}

	public void setParentCommunication(TransCommunication parentCommunication) {
		this.parentCommunication = parentCommunication;
	}

	public List<TransCommunication> getSubCommunications() {
		return subCommunications;
	}

	public void setSubCommunications(List<TransCommunication> subCommunications) {
		this.subCommunications = subCommunications;
	}

	public List<TransSuspectDoc> getCommunicationDocs() {
		return communicationDocs;
	}

	public void setCommunicationDocs(List<TransSuspectDoc> communicationDocs) {
		this.communicationDocs = communicationDocs;
	}

}
