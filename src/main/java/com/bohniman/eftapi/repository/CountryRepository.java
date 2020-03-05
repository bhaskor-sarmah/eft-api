package com.bohniman.eftapi.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bohniman.eftapi.model.MasterCountry;

public interface CountryRepository extends JpaRepository<MasterCountry, String> {
	ArrayList<MasterCountry> findByIsActive(String isActive);
	
	MasterCountry findByCountryCode(String countryCode);
}
