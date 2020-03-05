package com.bohniman.eftapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bohniman.eftapi.model.TransSuspectFamily;

public interface SuspectFamilyRepository extends JpaRepository<TransSuspectFamily, Long> {

}
