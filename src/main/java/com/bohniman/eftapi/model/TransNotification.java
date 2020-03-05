package com.bohniman.eftapi.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class TransNotification extends Auditable {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Long notificationId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_suspect_id", nullable = false)
    private TransSuspect suspect;

    private String remarks;

    private String target;

    private String targetPath;

    private String roleTo;
    
	@Column(columnDefinition = "tinyint (1) default 0")
	private Boolean isViewed;

    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_current_status_code", nullable = false)
    private MasterCurrentStatus currentStatus;

	public TransNotification() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getNotificationId() {
		return notificationId;
	}

	public void setNotificationId(Long notificationId) {
		this.notificationId = notificationId;
	}

	public TransSuspect getSuspect() {
		return suspect;
	}

	public void setSuspect(TransSuspect suspect) {
		this.suspect = suspect;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getTargetPath() {
		return targetPath;
	}

	public void setTargetPath(String targetPath) {
		this.targetPath = targetPath;
	}

	public String getRoleTo() {
		return roleTo;
	}

	public void setRoleTo(String roleTo) {
		this.roleTo = roleTo;
	}

	public Boolean getIsViewed() {
		return isViewed;
	}

	public void setIsViewed(Boolean isViewed) {
		this.isViewed = isViewed;
	}

	public MasterCurrentStatus getCurrentStatus() {
		return currentStatus;
	}

	public void setCurrentStatus(MasterCurrentStatus currentStatus) {
		this.currentStatus = currentStatus;
	}
    
    
}
