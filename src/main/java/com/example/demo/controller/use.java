package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/pro")
public class use {
	
	@GetMapping("/hel")
	public String hello() {
		
		return "This is my spring";
	}

}
