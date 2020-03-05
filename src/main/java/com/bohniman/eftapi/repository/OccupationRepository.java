package com.bohniman.eftapi.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bohniman.eftapi.model.MasterOccupation;

public interface OccupationRepository extends JpaRepository<MasterOccupation, String> {
	ArrayList<MasterOccupation> findByIsActive(String isActive);
	
	MasterOccupation findByOccupationCode(String occupationCode);
}
