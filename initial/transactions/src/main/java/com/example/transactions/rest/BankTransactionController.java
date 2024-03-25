package com.example.transactions.rest;

import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

import com.example.common.domain.ObjectMapperUtils;
import com.example.common.dto.ResponseDto;
import com.example.common.exception.InvalidDataException;
import com.example.common.spring.BaseController;
import com.example.transactions.domain.BankTransaction;
import com.example.transactions.dto.BankTransactionDto;
import com.example.transactions.service.BankTransactionService;

@RestController
@RequestMapping("/bankTransactions")
public class BankTransactionController extends BaseController{
	
//	private static final Logger logger = LogManager.getLogger(BankTransactionController.class);
	
	
	@Autowired
	protected BankTransactionService bankTransactionService;
	
	@GetMapping(value = "/{banktransactionId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseDto<BankTransactionDto> get(@PathVariable Long bankTransactionId) throws InvalidDataException{
		long timeInMils = System.currentTimeMillis();
//		if (logger.isDebugEnabled()) {
//			logger.debug("Retrieve-" + bankTransactionId);
//		}
		if(bankTransactionId==null) {
			throw new InvalidDataException("null Id");
		}
		//BankTransaction domainObj = bankTransactionService.getByID(getHeaderDto(), bankTransactionId);
				
		//BankTransactionDto transferObjs = ObjectMapperUtils.map(domainObj, BankTransactionDto.class);
		BankTransactionDto transferObjs = new BankTransactionDto();
		transferObjs.setBankTransactionId(5165L);
		
//		if (logger.isDebugEnabled()) {
//			logger.debug("End bankTransactionGet took - " + (System.currentTimeMillis() - timeInMils));
//		}
		return new ResponseDto<BankTransactionDto>(transferObjs, HttpServletResponse.SC_OK);		
	}
}
