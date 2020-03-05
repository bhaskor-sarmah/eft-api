package com.bohniman.eftapi.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bohniman.eftapi.model.MasterRelation;

public interface RelationRepository extends JpaRepository<MasterRelation, String> {
	ArrayList<MasterRelation> findByIsActive(String isActive);
	
	MasterRelation findByRelationCode(String relationCode);
}
