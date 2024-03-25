package com.example.common.dto;

import java.util.ArrayList;
import java.util.List;

public class ErrorDto extends BaseDto{
	private static final long serialVersionUID = 158979416216191545L;
	
	List<String> errorMessages = new ArrayList<String>();
	
	public ErrorDto() {
		super();
	}
	
	public ErrorDto(List<String> errorMessages) {
		super();
		this.errorMessages = errorMessages;
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
