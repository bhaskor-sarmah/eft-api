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

import com.bohniman.eftapi.repository.AppDevicePinRepository;
import com.bohniman.eftapi.request.MasterVersionForm;
import com.bohniman.eftapi.request.PasscodeForm;
import com.bohniman.eftapi.request.PinUserForm;
import com.bohniman.eftapi.security.JwtProvider;
import com.bohniman.eftapi.service.MasterService;
import com.bohniman.eftapi.service.PinService;

@RestController
public class MasterController {

	@Autowired
	AppDevicePinRepository devicePinRepository;

	@Autowired
	PinService pinService;

	@Autowired
	MasterService masterService;

	@Autowired
	JwtProvider jwttokenProvider;

	// ========================================================================
	// # API
	// # Fetch pass code for a device
	// ========================================================================
	@RequestMapping(value = "/api/passcode", produces = { "application/JSON" }, consumes = {
			"application/JSON" }, method = RequestMethod.POST)
	@PreAuthorize("hasRole('ROLE_IO')")
	public ResponseEntity<?> getPasscode(@Valid @RequestHeader(value = "Authorization") String jwtToken,
			@RequestBody PasscodeForm passcodeForm) {
		System.out.println(passcodeForm.getMacId());
		return ResponseEntity.ok(devicePinRepository.findByDevice_MacId(passcodeForm.getMacId()));

	}

	// ========================================================================
	// # API
	// # Assign PIN
	// ========================================================================
	@RequestMapping(value = "/api/assign-pin", produces = { "application/JSON" }, consumes = {
			"application/JSON" }, method = RequestMethod.POST)
	@PreAuthorize("hasRole('ROLE_IO')")
	public ResponseEntity<?> getPasscode(@Valid @RequestHeader(value = "Authorization") String jwtToken,
			@RequestBody PinUserForm pinUserForm) {

		return ResponseEntity.ok(pinService.assignPinUser(pinUserForm));

	}

	// ========================================================================
	// # API
	// # Fetch master version table
	// ========================================================================
	@RequestMapping(value = "/api/masterversion", produces = { "application/JSON" }, consumes = {
			"application/JSON" }, method = RequestMethod.POST)
	@PreAuthorize("hasRole('ROLE_IO')")
	public ResponseEntity<?> getMasterVersion(@Valid @RequestHeader(value = "Authorization") String jwtToken) {
		return ResponseEntity.ok(masterService.getMasterVersionTable());

	}

	// ========================================================================
	// # API
	// # Fetch all master data
	// ========================================================================
	@RequestMapping(value = "/api/masters", produces = { "application/JSON" }, consumes = {
			"application/JSON" }, method = RequestMethod.POST)
	@PreAuthorize("hasRole('ROLE_IO')")
	public ResponseEntity<?> getMasterTables(@Valid @RequestHeader(value = "Authorization") String jwtToken,
			@RequestBody MasterVersionForm masterVersionForm) {

		String username = jwttokenProvider.getUserNameFromJwtToken(jwtToken.replace("Bearer ", ""));
		return ResponseEntity.ok(masterService.getAllMasterData("18300211"));

	}
}
