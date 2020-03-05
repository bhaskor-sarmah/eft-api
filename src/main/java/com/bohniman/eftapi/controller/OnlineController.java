package com.bohniman.eftapi.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bohniman.eftapi.request.CommunicationForm;
import com.bohniman.eftapi.security.JwtProvider;
import com.bohniman.eftapi.service.CommunicationService;

@RestController
public class OnlineController {

	@Autowired
	JwtProvider jwttokenProvider;

	@Autowired
	CommunicationService communicationService;

	@RequestMapping(value = "/api/communication-request", produces = { "application/JSON" }, consumes = {
			"application/JSON" }, method = RequestMethod.POST)
	@PreAuthorize("hasRole('ROLE_IO')")
	public ResponseEntity<?> getCommunication(@Valid @RequestHeader(value = "Authorization") String jwtToken) {

		String username = jwttokenProvider.getUserNameFromJwtToken(jwtToken.replace("Bearer ", ""));
		return ResponseEntity.ok(communicationService.getAllCommunication(username));

	}

	@RequestMapping(value = "/api/communication-reply", produces = { "application/JSON" }, consumes = {
			"application/JSON" }, method = RequestMethod.POST)
	@PreAuthorize("hasRole('ROLE_IO')")
	public ResponseEntity<?> getCommunication(@Valid @RequestHeader(value = "Authorization") String jwtToken,
			@RequestBody CommunicationForm communicationForm) {

		return ResponseEntity.ok(communicationService.addReply(communicationForm));

	}
}
