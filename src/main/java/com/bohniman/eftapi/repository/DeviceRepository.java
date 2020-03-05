package com.bohniman.eftapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bohniman.eftapi.model.AppDevice;

public interface DeviceRepository extends JpaRepository<AppDevice, String> {
		AppDevice findByMacId(String macId);
}
