package com.example.common.exception;

import java.util.ArrayList;
import java.util.List;

public class InvalidDataException extends Exception{
	
	private static final long serialVersionUID = 7132901054950998564L;
	

	List<String> errorMessages = new ArrayList<String>();
	
	public InvalidDataException() {
		super();
	}
	
	public InvalidDataException(List<String> errorMessages) {
		super();
		this.errorMessages = errorMessages;
	}
	
	public InvalidDataException(String errorMessage) {
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
