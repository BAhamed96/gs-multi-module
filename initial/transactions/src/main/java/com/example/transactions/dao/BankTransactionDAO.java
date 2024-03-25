package com.example.transactions.dao;

import com.example.common.dao.AbstractDAO;
import com.example.transactions.domain.BankTransaction;

public class BankTransactionDAO extends AbstractDAO<BankTransaction>{
	
	public BankTransactionDAO() {
		super();
		setClazz(BankTransaction.class);
	}	
}
