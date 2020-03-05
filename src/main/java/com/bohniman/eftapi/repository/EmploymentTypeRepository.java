package com.bohniman.eftapi.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bohniman.eftapi.model.MasterEmploymentType;

public interface EmploymentTypeRepository extends JpaRepository<MasterEmploymentType, String> {
	ArrayList<MasterEmploymentType> findByIsActive(String isActive);
	
	MasterEmploymentType findByEmploymentTypeCode(String employmentTypeCode);
}
