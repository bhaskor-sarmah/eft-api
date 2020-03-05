package com.bohniman.eftapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bohniman.eftapi.model.TransBiometricTemplate;

public interface BiometricTemplateRepository extends JpaRepository<TransBiometricTemplate, Long> {
	TransBiometricTemplate findBySuspect_suspectId(String suspectId);
}
