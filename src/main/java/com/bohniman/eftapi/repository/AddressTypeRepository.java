package com.bohniman.eftapi.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bohniman.eftapi.model.MasterAddressType;

public interface AddressTypeRepository extends JpaRepository<MasterAddressType, String> {
	ArrayList<MasterAddressType> findByIsActive(String isActive);
	
	MasterAddressType findByAddressTypeCode(String addressTypeCode);
}
