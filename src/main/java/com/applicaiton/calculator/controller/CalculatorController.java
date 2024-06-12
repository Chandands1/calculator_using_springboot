package com.applicaiton.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/calculator")
public class CalculatorController {
	
	@GetMapping("/add")
	public double add(@RequestParam double a, @RequestParam double b) {
		
		return a+b;
		
	}
	
	@GetMapping("/substract")
	public double substract(@RequestParam double a, @RequestParam double b) {
		return a -b;
	}
	
	public double multiply(@RequestParam double a, @RequestParam double b) {
		
		return a*b;
	}
	
	public double divide(@RequestParam double a, @RequestParam double b) {
		
		if(b==0) {
            return 0;	
		}
		return a/b;
	}
	
	
}
