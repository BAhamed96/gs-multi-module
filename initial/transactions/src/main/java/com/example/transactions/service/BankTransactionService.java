package com.example.transactions.service;

import com.example.common.dto.HeaderDto;
import com.example.transactions.domain.BankTransaction;

public interface BankTransactionService {
	
	public BankTransaction getByID(HeaderDto headerDto, Long Id);
}
