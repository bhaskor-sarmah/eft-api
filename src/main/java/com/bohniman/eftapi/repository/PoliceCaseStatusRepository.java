package com.bohniman.eftapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bohniman.eftapi.model.MasterPoliceCaseStatus;

public interface PoliceCaseStatusRepository extends JpaRepository<MasterPoliceCaseStatus, String> {
	
	MasterPoliceCaseStatus findByCaseStatusCode(String caseStatusCode);

}
