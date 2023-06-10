package com.pharmacy.project.payment;

public class Message {
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	String message;
	boolean status;
	
	public Message(String message, boolean status) {
		super();
		this.message = message;
		this.status = status;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public boolean isStatus() {
		return status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	
}