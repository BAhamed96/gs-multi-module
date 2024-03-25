package com.example.common.spring;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Component
public class JsonInvoker {
	protected Logger logger = LogManager.getLogger(JsonInvoker.class.getTypeName());
	
	@Value("{mutualAuth.keystore}")
	protected String keyStorePath;
	
	private Gson getGSONBuilder() {
		GsonBuilder builder = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.IDENTITY);
		return builder.setDateFormat("MMM dd, yyyy, hh:mm:ss a").create();
	}
	
	
}
