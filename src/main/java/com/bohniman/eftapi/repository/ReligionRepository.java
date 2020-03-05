package com.bohniman.eftapi.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bohniman.eftapi.model.MasterReligion;

public interface ReligionRepository extends JpaRepository<MasterReligion, String> {
	ArrayList<MasterReligion> findByIsActive(String isActive);
}
