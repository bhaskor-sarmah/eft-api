package com.bohniman.eftapi.response;

import com.bohniman.eftapi.payload.FtPayload;

/**
 * FtJwtAuthResponse
 */
public class FtJwtAuthResponse {

    private String accessToken;
	private String tokenType = "Bearer";
	private FtPayload ft;
	public FtJwtAuthResponse(String accessToken, FtPayload ft) {
		super();
		this.accessToken = accessToken;
		this.ft = ft;
    }
    

    public String getAccessToken() {
        return this.accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getTokenType() {
        return this.tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public FtPayload getFt() {
        return this.ft;
    }

    public void setFt(FtPayload ft) {
        this.ft = ft;
    }

}