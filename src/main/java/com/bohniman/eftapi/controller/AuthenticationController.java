package com.bohniman.eftapi.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bohniman.eftapi.model.User;
import com.bohniman.eftapi.repository.DeviceRepository;
import com.bohniman.eftapi.repository.UserRepository;
import com.bohniman.eftapi.request.LoginForm;
import com.bohniman.eftapi.response.Acknowledge;
import com.bohniman.eftapi.response.JwtAuthResponse;
import com.bohniman.eftapi.security.JwtProvider;
import com.bohniman.eftapi.service.ThanaService;

@RestController
@RequestMapping("/api/auth")
public class AuthenticationController {
	@Autowired
	UserRepository userRepository;

	@Autowired
	AuthenticationManager authenticationManager;

	@Autowired
	JwtProvider jwttokenProvider;

	@Autowired
	ThanaService thanaService;

	// ========================================================================
	// # API
	// # Signin using jwt
	// ========================================================================
	@PostMapping("/signin")
	public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginForm loginRequest) {

		User user = userRepository.findByUsername(loginRequest.getUsername());

		// if user is active
		if (user.isStatus()) {
			try {
				Authentication authentication = authenticationManager
						.authenticate(new UsernamePasswordAuthenticationToken(loginRequest.getUsername(),
								loginRequest.getPassword()));

				SecurityContextHolder.getContext().setAuthentication(authentication);

				String jwt = jwttokenProvider.generateJwtToken(authentication);
				System.out.println(jwt);
				return ResponseEntity.ok(new JwtAuthResponse(jwt, thanaService.getThana(loginRequest.getMacId())));
			} catch (Exception e) {
				System.out.println("EXCEPTION : " + e.getMessage());
				return ResponseEntity.ok(new Acknowledge("0", "Invalid username & password!"));
			}
		} else {
			return ResponseEntity.ok(new Acknowledge("0", "Permission denied!"));
		}
	}
}
