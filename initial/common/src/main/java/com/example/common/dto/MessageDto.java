package com.example.common.dto;

import java.util.ArrayList;
import java.util.List;

public class MessageDto extends BaseDto{
	
	private static final long serialVersionUID = -1651489716149489L;
	
	List<String> messages = new ArrayList<String>();
	
	public MessageDto() {
		super();
	}
	
	public MessageDto(List<String> messages) {
		super();
		this.messages = messages;
	}
	
	public MessageDto(String message) {
		super();
		addMessage(message);
	}
	
	public List<String> getMessages(){
		return messages;
	}
	
	public void setMessages(List<String> messages) {
		this.messages = messages;
	}
	
	public void addMessage(String message) {
		this.messages.add(message);
	}
}
