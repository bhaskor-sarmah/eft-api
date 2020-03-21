package com.bohniman.eftapi.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class ChangePasswordForm {
	@NotBlank
	@Size(min = 8, max = 20)
	private String currentPassword;
	@NotBlank
	@Size(min = 8, max = 20)
	private String newPassword;
	@NotBlank
	@Size(min = 8, max = 20)
	private String confirmPassword;

	public ChangePasswordForm() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCurrentPassword() {
		return currentPassword;
	}

	public void setCurrentPassword(String currentPassword) {
		this.currentPassword = currentPassword;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

}
