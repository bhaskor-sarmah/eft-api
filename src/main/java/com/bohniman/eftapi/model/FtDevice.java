package com.bohniman.eftapi.model;

import java.util.Objects;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ft_device")
public class FtDevice extends Auditable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
    private Long id;
    
	private String deviceName;
    private String deviceId;
    private String macId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_user_id")
	private User user;

    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_ft_code")
    private MasterFt ft;
    

    public FtDevice() {
    }

    public FtDevice(Long id, String deviceName, String deviceId, String macId, User user, MasterFt ft) {
        this.id = id;
        this.deviceName = deviceName;
        this.deviceId = deviceId;
        this.macId = macId;
        this.user = user;
        this.ft = ft;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getMacId() {
        return this.macId;
    }

    public void setMacId(String macId) {
        this.macId = macId;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public MasterFt getFt() {
        return this.ft;
    }

    public void setFt(MasterFt ft) {
        this.ft = ft;
    }

    public FtDevice id(Long id) {
        this.id = id;
        return this;
    }

    public FtDevice deviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    public FtDevice deviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    public FtDevice macId(String macId) {
        this.macId = macId;
        return this;
    }

    public FtDevice user(User user) {
        this.user = user;
        return this;
    }

    public FtDevice ft(MasterFt ft) {
        this.ft = ft;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof FtDevice)) {
            return false;
        }
        FtDevice ftDevice = (FtDevice) o;
        return Objects.equals(id, ftDevice.id) && Objects.equals(deviceName, ftDevice.deviceName) && Objects.equals(deviceId, ftDevice.deviceId) && Objects.equals(macId, ftDevice.macId) && Objects.equals(user, ftDevice.user) && Objects.equals(ft, ftDevice.ft);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, deviceName, deviceId, macId, user, ft);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", deviceName='" + getDeviceName() + "'" +
            ", deviceId='" + getDeviceId() + "'" +
            ", macId='" + getMacId() + "'" +
            ", user='" + getUser() + "'" +
            ", ft='" + getFt() + "'" +
            "}";
    }

}