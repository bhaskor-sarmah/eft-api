package com.bohniman.eftapi.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bohniman.eftapi.model.MasterState;

public interface StateRepository extends JpaRepository<MasterState, String> {
	ArrayList<MasterState> findByIsActive(String isActive);
	
	MasterState findByStateCode(String stateCode);
}
