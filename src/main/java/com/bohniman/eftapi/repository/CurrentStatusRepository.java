package com.bohniman.eftapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bohniman.eftapi.model.MasterCurrentStatus;

public interface CurrentStatusRepository  extends JpaRepository<MasterCurrentStatus, String> {
	MasterCurrentStatus findByCurrentStatusCode(String code);
}
