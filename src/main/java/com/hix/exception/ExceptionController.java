package com.hix.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionController {
	@ExceptionHandler(SSNNotFoundException.class)
	public ResponseEntity<String> exceptionHandler() {
		ResponseEntity<String> entity=new ResponseEntity<String>("Invalide ssn no",HttpStatus.BAD_REQUEST);
		return entity;
		
	}

}
