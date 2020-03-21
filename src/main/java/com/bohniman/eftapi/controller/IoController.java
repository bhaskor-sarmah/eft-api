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

import com.bohniman.eftapi.request.BiometricForm;
import com.bohniman.eftapi.request.NewDocForm;
import com.bohniman.eftapi.request.NewSuspectForm;
import com.bohniman.eftapi.security.JwtProvider;
import com.bohniman.eftapi.service.FileUploadService;
import com.bohniman.eftapi.service.SuspectService;

@RestController
public class IoController {

	@Autowired
	JwtProvider jwttokenProvider;

	@Autowired
	SuspectService suspectService;

	@Autowired
	FileUploadService fileUploadService;

	@RequestMapping(value = "/api/suspect-register", produces = { "application/JSON" }, consumes = {
			"application/JSON" }, method = RequestMethod.POST)
	@PreAuthorize("hasRole('ROLE_IO')")
	public ResponseEntity<?> addSuspect(@Valid @RequestHeader(value = "Authorization") String jwtToken,
			@RequestBody NewSuspectForm newSuspectForm) {
//		String username = jwttokenProvider.getUserNameFromJwtToken(jwtToken.replace("Bearer ", ""));
		
		return ResponseEntity.ok(suspectService.saveSuspect(newSuspectForm));

	}

	@RequestMapping(value = "/api/sync-doc", produces = { "application/JSON" }, consumes = {
			"application/JSON" }, method = RequestMethod.POST)
	@PreAuthorize("hasRole('ROLE_IO')")
	public ResponseEntity<?> uploadDoc(@Valid @RequestHeader(value = "Authorization") String jwtToken,
			@RequestBody NewDocForm newDocForm) {

		return ResponseEntity.ok(suspectService.saveDocument(newDocForm));

	}

	@RequestMapping(value = "/api/sync-biometric", produces = { "application/JSON" }, consumes = {
			"application/JSON" }, method = RequestMethod.POST)
	@PreAuthorize("hasRole('ROLE_IO')")
	public ResponseEntity<?> uploadBiometric(@Valid @RequestHeader(value = "Authorization") String jwtToken,
			@RequestBody BiometricForm biometricForm) {

		return ResponseEntity.ok(suspectService.saveBiometric(biometricForm));

	}

}
