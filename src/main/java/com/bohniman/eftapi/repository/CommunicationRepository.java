package com.bohniman.eftapi.repository;

import java.util.ArrayList;

import com.bohniman.eftapi.model.TransCommunication;
import com.bohniman.eftapi.model.TransSuspect;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CommunicationRepository extends JpaRepository<TransCommunication, Long> {

	ArrayList<TransCommunication> findByCommunicationStatusAndUserTo_id(String status, Long userId);
	
	ArrayList<TransCommunication> findByParentCommunication(TransCommunication comm);

	TransCommunication findByCommId(Long commId);

	long countByCommunicationStatusAndSuspect(String status,TransSuspect suspect);
}
