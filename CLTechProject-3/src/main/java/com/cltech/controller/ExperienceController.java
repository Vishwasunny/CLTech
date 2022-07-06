package com.cltech.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cltech")
public class ExperienceController {
	
	@GetMapping("/experience")
	public String getExperience() {
		return "Freshers";
	}
	
	
}
