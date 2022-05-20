package com.kuhada.cart.exception;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ErrorResponse {
	
	@JsonProperty
	private String messsage;
	
	@JsonProperty
	private int statusCode;
	
	public String getMesssage() {
		return messsage;
	}
	public void setMesssage(String messsage) {
		this.messsage = messsage;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void statusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	

	
}
