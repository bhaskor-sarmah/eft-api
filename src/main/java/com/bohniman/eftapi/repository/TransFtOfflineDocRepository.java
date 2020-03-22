package com.bohniman.eftapi.repository;

import com.bohniman.eftapi.model.TransFtOfflineDoc;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * TransFtOfflineDocRepository
 */
@Repository
public interface TransFtOfflineDocRepository extends JpaRepository<TransFtOfflineDoc, Long> {

}