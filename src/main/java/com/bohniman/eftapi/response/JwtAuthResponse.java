package com.bohniman.eftapi.response;

import com.bohniman.eftapi.payload.ThanaPayload;

public class JwtAuthResponse {
	private String accessToken;
	private String tokenType = "Bearer";
	private ThanaPayload thana;
	public JwtAuthResponse(String accessToken, ThanaPayload thana) {
		super();
		this.accessToken = accessToken;
		this.thana = thana;
	}
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getTokenType() {
		return tokenType;
	}
	public void setTokenType(String tokenType) {
		this.tokenType = tokenType;
	}
	public ThanaPayload getThana() {
		return thana;
	}
	public void setThana(ThanaPayload thana) {
		this.thana = thana;
	}

	
	
}
