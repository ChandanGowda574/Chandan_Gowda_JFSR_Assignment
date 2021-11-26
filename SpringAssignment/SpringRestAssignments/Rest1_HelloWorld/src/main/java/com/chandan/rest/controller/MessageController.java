package com.chandan.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
	
	@RequestMapping("/hello")
	public String getMessage() {
		return "Hello world!";
	}
}
