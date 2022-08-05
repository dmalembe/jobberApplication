package com.tandem.jobber.payload.response;

public class MessagesResponse {

	private String message;
	
	public MessagesResponse(String string) {
		// TODO Auto-generated constructor stub
		this.message = string;
	}

	//AM
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
