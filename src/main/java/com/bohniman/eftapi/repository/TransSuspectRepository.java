package com.bohniman.eftapi.repository;

import com.bohniman.eftapi.model.TransSuspect;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * TransSuspectRepository
 */
@Repository
public interface TransSuspectRepository extends JpaRepository<TransSuspect, String>{

    
}