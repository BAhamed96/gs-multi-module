package com.example.transactions.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.common.dto.HeaderDto;
import com.example.transactions.dao.BankTransactionDAO;
import com.example.transactions.domain.BankTransaction;
import com.example.transactions.service.BankTransactionService;

public class BankTransactionServiceImpl implements BankTransactionService {
	
	@Autowired
	BankTransactionDAO bankTransactionDAO;

	@Override
	public BankTransaction getByID(HeaderDto headerDto, Long Id) {
		if(Id == null) {
			return null;
		}
		return bankTransactionDAO.findById(headerDto, Id);
	}

}
