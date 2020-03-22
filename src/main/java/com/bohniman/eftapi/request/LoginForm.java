package com.bohniman.eftapi.request;

import java.util.Objects;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class LoginForm {
	@NotBlank
	@Size(min = 3, max = 60)
	private String username;

	@NotBlank
	private String password;

	@NotBlank
	private String deviceId;

	@NotBlank
	private String macId;


	public LoginForm() {
	}

	public LoginForm(String username, String password, String deviceId, String macId) {
		this.username = username;
		this.password = password;
		this.deviceId = deviceId;
		this.macId = macId;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public LoginForm username(String username) {
		this.username = username;
		return this;
	}

	public LoginForm password(String password) {
		this.password = password;
		return this;
	}

	public LoginForm deviceId(String deviceId) {
		this.deviceId = deviceId;
		return this;
	}

	public LoginForm macId(String macId) {
		this.macId = macId;
		return this;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof LoginForm)) {
			return false;
		}
		LoginForm loginForm = (LoginForm) o;
		return Objects.equals(username, loginForm.username) && Objects.equals(password, loginForm.password) && Objects.equals(deviceId, loginForm.deviceId) && Objects.equals(macId, loginForm.macId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(username, password, deviceId, macId);
	}

	@Override
	public String toString() {
		return "{" +
			" username='" + getUsername() + "'" +
			", password='" + getPassword() + "'" +
			", deviceId='" + getDeviceId() + "'" +
			", macId='" + getMacId() + "'" +
			"}";
	}
	

}
