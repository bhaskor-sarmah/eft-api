package com.bohniman.eftapi.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bohniman.eftapi.model.MasterImmigrationRoute;

public interface RouteRepository extends JpaRepository<MasterImmigrationRoute, String> {
	ArrayList<MasterImmigrationRoute> findByIsActive(String isActive);
	
	MasterImmigrationRoute findByRouteCode(String routeCode);
}
