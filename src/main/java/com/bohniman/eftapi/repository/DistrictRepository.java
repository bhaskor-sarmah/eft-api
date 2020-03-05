package com.bohniman.eftapi.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bohniman.eftapi.model.MasterDistrict;

public interface DistrictRepository extends JpaRepository<MasterDistrict, String> {
	ArrayList<MasterDistrict> findByIsActive(String isActive);
	
	MasterDistrict findByDistrictCode(String districtCode);
}
