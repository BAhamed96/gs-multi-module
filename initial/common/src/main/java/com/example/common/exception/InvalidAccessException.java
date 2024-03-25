package com.example.common.exception;

import java.util.ArrayList;
import java.util.List;

public class InvalidAccessException extends Exception{
	
	private static final long serialVersionUID = 7920556959519123645L;

	List<String> errorMessages = new ArrayList<String>();
	
	public InvalidAccessException() {
		super();
	}
	
	public InvalidAccessException(List<String> errorMessages) {
		super();
		this.errorMessages = errorMessages;
	}
	
	public InvalidAccessException(String errorMessage) {
		super();
		this.errorMessages.add(errorMessage);
	}
	
	public List<String> getErrorMessages(){
		return errorMessages;
	}
	
	public void setErrorMessages(List<String> errorMessages) {
		this.errorMessages = errorMessages;
	}
	
	public void addErrorMessages(String errorMessage) {
		this.errorMessages.add(errorMessage);
	}
}
