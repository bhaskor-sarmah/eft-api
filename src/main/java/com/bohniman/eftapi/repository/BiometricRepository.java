package com.bohniman.eftapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bohniman.eftapi.model.TransBiometricDetails;

public interface BiometricRepository extends JpaRepository<TransBiometricDetails, Long> {
	TransBiometricDetails findBySuspect_suspectId(String suspectId);
}
