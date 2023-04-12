package com.logger.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.logger.example.service.LoggerService;

@RestController
public class ControllerClass {
	@Autowired
	LoggerService service;
	
	@GetMapping("/ex")
	public String method1() {
		return service.method1();
		
	}

}
