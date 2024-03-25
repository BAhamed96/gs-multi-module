package com.example.transactions.domain;

import java.util.Date;

import com.example.common.domain.BaseDomain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "BANK_TRANSACTION")
public class BankTransaction extends BaseDomain{

	private static final long serialVersionUID = -7119130677352291075L;
	private Long bankTransactionId;
	private Date transactionDate;
	private String status;
	private String description;
	
	
	@SequenceGenerator(name ="BANK_TRANSACTION_ID_SEQ", sequenceName = "BANK_TRANSACTION_ID_SEQ", allocationSize = 1)
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BANK_TRANSACTION_ID_SEQ")
	@Column(name = "bank_transaction_id", unique = true, nullable = false)
	public Long getBankTransactionId() {
		return bankTransactionId;
	}
	public void setBankTransactionId(Long bankTransactionId) {
		this.bankTransactionId = bankTransactionId;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "transaction_date, nullable = false, length=23")
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	
	@Column(name = "status", nullable = false, length = 50)
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Column(name = "description", length = 254)
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}
