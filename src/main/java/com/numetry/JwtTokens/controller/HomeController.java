package com.numetry.JwtTokens.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/user")
	public String user() {
		System.out.println("getting users");
		return "users is display";
	}

}
