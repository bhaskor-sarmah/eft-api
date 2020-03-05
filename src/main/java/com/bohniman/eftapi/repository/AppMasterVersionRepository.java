package com.bohniman.eftapi.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bohniman.eftapi.model.AppMasterVersion;

public interface AppMasterVersionRepository extends JpaRepository<AppMasterVersion, Long> {
	ArrayList<AppMasterVersion> findAll();
}
