package com.bohniman.eftapi.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bohniman.eftapi.model.MasterMaritalStatus;

public interface MaritalStatusRepository extends JpaRepository<MasterMaritalStatus, String> {
	ArrayList<MasterMaritalStatus> findByIsActive(String isActive);
	
	MasterMaritalStatus findByMaritalStatusCode(String maritalStatusCode);
}
