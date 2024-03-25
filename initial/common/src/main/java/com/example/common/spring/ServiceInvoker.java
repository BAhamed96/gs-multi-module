package com.example.common.spring;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceInvoker {
	
	//private static final Logger logger = LogManager.getLogger(ServiceInvoker.class);
	
	@Autowired
	protected JsonInvoker jsonInvoker;
}
