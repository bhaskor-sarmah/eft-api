package com.bohniman.eftapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bohniman.eftapi.model.TransSuspect;

public interface SuspectRepository extends JpaRepository<TransSuspect, String> {
	TransSuspect findBySuspectId(String suspectId);

	TransSuspect findByOfflineId(String offlineId);
}
