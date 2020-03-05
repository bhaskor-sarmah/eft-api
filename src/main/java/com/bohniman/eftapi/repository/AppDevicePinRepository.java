package com.bohniman.eftapi.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bohniman.eftapi.model.AppDevicePin;

public interface AppDevicePinRepository extends JpaRepository<AppDevicePin, Long> {
	ArrayList<AppDevicePin> findByDevice_DeviceId(String deviceId);

	ArrayList<AppDevicePin> findByDevice_MacId(String macId);
	
	AppDevicePin findByPinId(Long pinId);
	
}
