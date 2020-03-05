package com.bohniman.eftapi.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bohniman.eftapi.model.MasterLac;

public interface LacRepository extends JpaRepository<MasterLac, String> {
	ArrayList<MasterLac> findByIsActive(String isActive);
}
