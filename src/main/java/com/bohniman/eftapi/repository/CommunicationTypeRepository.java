package com.bohniman.eftapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bohniman.eftapi.model.MasterCommunicationType;

public interface CommunicationTypeRepository  extends JpaRepository<MasterCommunicationType, Long> {
	MasterCommunicationType findByCommTypeCode(String typeCode);
}
