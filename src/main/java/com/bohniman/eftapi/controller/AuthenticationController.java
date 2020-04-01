package com.bohniman.eftapi.controller;

import javax.validation.Valid;

import com.bohniman.eftapi.model.User;
import com.bohniman.eftapi.payload.FtPayload;
import com.bohniman.eftapi.payload.ThanaPayload;
import com.bohniman.eftapi.repository.UserRepository;
import com.bohniman.eftapi.request.LoginForm;
import com.bohniman.eftapi.response.Acknowledge;
import com.bohniman.eftapi.response.FtJwtAuthResponse;
import com.bohniman.eftapi.response.JwtAuthResponse;
import com.bohniman.eftapi.security.JwtProvider;
import com.bohniman.eftapi.service.FtService;
import com.bohniman.eftapi.service.ThanaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

	@Autowired
	FtService ftService;

	// ========================================================================
	// # API
	// # Signin using jwt
	// ========================================================================
	@PostMapping("/signin")
	public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginForm loginRequest) {

		User user = userRepository.findByUsername(loginRequest.getUsername());

		if (null == user) {
			return ResponseEntity.ok(new Acknowledge("0", "Invalid username!"));
		}
		// if user is active
		if (user.isStatus()) {
			try {
				Authentication authentication = authenticationManager
						.authenticate(new UsernamePasswordAuthenticationToken(loginRequest.getUsername(),
								loginRequest.getPassword()));

				SecurityContextHolder.getContext().setAuthentication(authentication);

				String jwt = jwttokenProvider.generateJwtToken(authentication);
				System.out.println(jwt);
				ThanaPayload thanaPayload = thanaService.getThana(loginRequest.getMacId());
				if (null != thanaPayload) {
					// User's thana and the device thana is same
					if (user.getUserScope().getScopeCode().equals(thanaPayload.getThanaCode())) {
						return ResponseEntity.ok(new JwtAuthResponse(jwt, thanaPayload));
					} else {
						return ResponseEntity.ok(
								new Acknowledge("0", "Device is mapped with " + thanaPayload.getThanaName() + " PS"));
					}
				} else {
					return ResponseEntity.ok(new Acknowledge("0", "Device is not registred"));
				}
			} catch (Exception e) {
				System.out.println("EXCEPTION : " + e.getMessage());
				return ResponseEntity.ok(new Acknowledge("0", "Invalid password!"));
			}
		} else {
			return ResponseEntity.ok(new Acknowledge("0", "Permission denied!"));
		}
	}

	@PostMapping("/signinft")
	public ResponseEntity<?> authenticateUserFt(@Valid @RequestBody LoginForm loginRequest) {
		// System.out.println(loginRequest.toString());
		User user = userRepository.findByUsername(loginRequest.getUsername());
		HttpHeaders header = new HttpHeaders();
        header.setContentType(MediaType.APPLICATION_JSON);
		if (null == user) {
			return ResponseEntity.badRequest().body(new Acknowledge("0", "Invalid username!"));
		}
		// if user is active
		if (user.isStatus()) {
			try {
				Authentication authentication = authenticationManager
						.authenticate(new UsernamePasswordAuthenticationToken(loginRequest.getUsername(),
								loginRequest.getPassword()));

				SecurityContextHolder.getContext().setAuthentication(authentication);

				String jwt = jwttokenProvider.generateJwtToken(authentication);
				System.out.println(jwt);
				FtPayload ftPayload = ftService.getFt(loginRequest.getMacId());
				if (null != ftPayload) {
					// User's Ft and the device Ft is same
					if (user.getUserScope().getScopeCode().equals(ftPayload.getFtCode())) {
						// System.out.println("SUCCESSFULLY LOGGED IN");
						return ResponseEntity.ok().headers(header).body(new FtJwtAuthResponse(jwt, ftPayload));
					} else {
						return ResponseEntity
								.badRequest().body(new Acknowledge("0", "Device is mapped with " + ftPayload.getFtName() + " FT"));
					}
				} else {
					return ResponseEntity.badRequest().body(new Acknowledge("0", "Device is not registred"));
				}
			} catch (Exception e) {
				System.out.println("EXCEPTION : " + e.getMessage());
				return ResponseEntity.badRequest().body(new Acknowledge("0", "Invalid password!"));
			}
		} else {
			return ResponseEntity.badRequest().body(new Acknowledge("0", "Permission denied!"));
		}
	}
}
