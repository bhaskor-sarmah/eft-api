package com.bohniman.eftapi.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bohniman.eftapi.model.MasterVillage;

public interface VillageRepository extends JpaRepository<MasterVillage, String> {
	ArrayList<MasterVillage> findByIsActive(String isActive);

	ArrayList<MasterVillage> findByThana_ThanaCodeAndIsActive(String thanaCode, String isActive);
	
	MasterVillage findByVillageCode(String villageCode);
}
