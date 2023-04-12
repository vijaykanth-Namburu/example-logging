package com.logger.example.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.logger.example.exception.Exceptionhandling;

@Service
public class LoggerService {
	
	
	Logger logger = LoggerFactory.getLogger(Exceptionhandling.class);
	
	public String method1() {
		logger.info("Method worked successfully");
		logger.error("got  an error");
		return "success";
	}
}
