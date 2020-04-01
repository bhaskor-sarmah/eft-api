package com.bohniman.eftapi.repository;

import com.bohniman.eftapi.model.MasterFtDocument;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * MasterFtDocumentRepository
 */
@Repository
public interface MasterFtDocumentRepository extends JpaRepository<MasterFtDocument, String>{

    
}