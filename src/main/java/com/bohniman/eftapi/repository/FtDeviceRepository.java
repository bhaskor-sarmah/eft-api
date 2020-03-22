package com.bohniman.eftapi.repository;

import com.bohniman.eftapi.model.FtDevice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FtDeviceRepository extends JpaRepository<FtDevice, Long> {

	FtDevice findByMacId(String macId);

}
