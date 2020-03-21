package com.bohniman.eftapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bohniman.eftapi.model.TransSuspect;
import com.bohniman.eftapi.model.TransSuspectDoc;

public interface SuspectDocRepository extends  JpaRepository<TransSuspectDoc, Long> {
	long countBySuspect(TransSuspect suspect);
}
