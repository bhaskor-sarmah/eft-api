package com.bohniman.eftapi.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bohniman.eftapi.model.MasterThana;

public interface ThanaRepository extends JpaRepository<MasterThana, String> {
	ArrayList<MasterThana> findByIsActive(String isActive);

	ArrayList<MasterThana> findByThanaCodeAndIsActive(String thanaCode, String isActive);

	MasterThana findByThanaCode(String thanaCode);
}
