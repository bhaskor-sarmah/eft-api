package com.bohniman.eftapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bohniman.eftapi.model.AppDevicePin;
import com.bohniman.eftapi.repository.AppDevicePinRepository;
import com.bohniman.eftapi.request.PinUserForm;

@Service
public class PinService {

	@Autowired
	AppDevicePinRepository appPinRepository;

	public AppDevicePin assignPinUser(PinUserForm pinUserForm) {
		AppDevicePin pin = appPinRepository.findByPinId(pinUserForm.getPinId());
		try {
			pin.setUserName(pinUserForm.getUserName());
			pin.setEmail(pinUserForm.getEmail());
			pin.setMobileNo(pinUserForm.getMobileNo());
			appPinRepository.save(pin);
			return pin;
		} catch (Exception e) {
			return pin;
		}
	}
}
