package com.example.common.spring;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;

import com.example.common.dto.HeaderDto;

@RestController
@CrossOrigin(origins = { "${cors.allowedhost1}", "${cors.allowedhost2}" }, maxAge = 4800, allowCredentials = "false")
public class BaseController {
	
	@Autowired
	protected HeaderDto headerDto;
	
	//@Autowired 
//	protected ServiceInvoker serviceInvoker;
	
	protected String getRandomUniqueID() {
		return UUID.randomUUID().toString();
	}
	
	protected HeaderDto getHeaderDto() {
		if(RequestContextHolder.getRequestAttributes() == null) {
			return HeaderDto.getDefaultHeader();
		}
		return headerDto;
	}
}
