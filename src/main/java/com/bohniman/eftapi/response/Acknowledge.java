package com.bohniman.eftapi.response;

public class Acknowledge {
	private String status;
	private String message;
	private Object object;

	public Acknowledge() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Acknowledge(String status, String message) {
		super();
		this.status = status;
		this.message = message;
	}

	public Acknowledge(String status, String message, Object object) {
		super();
		this.status = status;
		this.message = message;
		this.object = object;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

}
