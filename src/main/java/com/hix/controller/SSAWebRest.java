package com.hix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hix.exception.SSNNotFoundException;
import com.hix.service.SsaService;

@RestController
public class SSAWebRest {
	@Autowired
	private SsaService service;
	
	@GetMapping(value = "/restcall/{ssno}" , produces = "application/json")
	public String getStateCode(@PathVariable("ssno")Integer ssaNo)throws Exception{
		System.out.println("SSAWebRest.getStateCode()");
		String stateCode = service.getStateCode(ssaNo);
		if(stateCode!=null && !stateCode.isEmpty())
		     return stateCode;
		else
			throw new SSNNotFoundException();
	}

}
