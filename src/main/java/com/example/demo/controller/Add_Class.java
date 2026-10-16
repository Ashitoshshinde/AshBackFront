package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class Add_Class {

	@GetMapping("/add")
	public int add(@RequestParam int a, @RequestParam int b)
	{
		return a+b;	
	}
	
	@GetMapping("/sub")
	public int sub(@RequestParam int a, @RequestParam int b)
	{
		return a-b;
	}
	
	@GetMapping("/mul")
	public int mul(@RequestParam int a, @RequestParam int b)
	{
		return a*b;
	}
	
}
