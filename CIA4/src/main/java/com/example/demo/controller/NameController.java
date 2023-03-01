package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController 
{
	private String name = "Akshaya";
	@GetMapping("/name")
	public String getName()
	{ 
		return "Hi " + name;
	}
}
