package com.example.springit.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * @Controller and @ResponseBody
 */
@Controller 
public class HomeController {

	@GetMapping("/home")
	public String home(Model model) {
		model.addAttribute("title", "Hello, Thymeleaf!"); 
		return "home";
	}
}
