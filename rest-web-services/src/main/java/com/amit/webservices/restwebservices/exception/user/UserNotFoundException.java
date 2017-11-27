package com.amit.webservices.restwebservices.exception.user;

public class UserNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -5998495542637253690L;

	private String customMessage; 
	
	public UserNotFoundException(String message) {
		this.setCustomMessage(message);
	}

	public String getCustomMessage() {
		return customMessage;
	}

	public void setCustomMessage(String customMessage) {
		this.customMessage = customMessage;
	}
}
