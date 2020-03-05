package com.bohniman.eftapi.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bohniman.eftapi.model.MasterSuspectDocument;

public interface SuspectDocumentRepository extends JpaRepository<MasterSuspectDocument, String> {
	ArrayList<MasterSuspectDocument> findByIsActive(String isActive);
	
	MasterSuspectDocument findByDocCode(String docCode);
}
