package com.example.springit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * @Controller and @ResponseBody
 */
@RestController 
public class HomeController {

	@RequestMapping("/")
	public String home() {
		
		
		return "hello Spring Boot 2";
	}
}
