package com.bohniman.eftapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bohniman.eftapi.model.TransSuspectAddress;

public interface SuspectAddressRepository extends  JpaRepository<TransSuspectAddress, Long> {

}
