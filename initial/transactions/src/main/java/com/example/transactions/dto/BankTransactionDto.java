package com.example.transactions.dto;

import java.util.Date;

import com.example.common.dto.BaseDto;

public class BankTransactionDto extends BaseDto{
	private static final long serialVersionUID = -4945001246913324006L;
	private Long bankTransactionId;
	private Date transactionDate;
	private String status;
	private String description;
	private String test;
	
	public Long getBankTransactionId() {
		return bankTransactionId;
	}
	public void setBankTransactionId(Long bankTransactionId) {
		this.bankTransactionId = bankTransactionId;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
