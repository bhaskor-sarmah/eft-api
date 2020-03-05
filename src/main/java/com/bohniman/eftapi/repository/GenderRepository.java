package com.bohniman.eftapi.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bohniman.eftapi.model.MasterGender;

public interface GenderRepository extends JpaRepository<MasterGender, String> {
	ArrayList<MasterGender> findByIsActive(String isActive);
	
	MasterGender findByGenderCode(String genderCode);
}
