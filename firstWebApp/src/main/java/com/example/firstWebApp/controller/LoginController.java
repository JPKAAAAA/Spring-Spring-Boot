package com.example.firstWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	@RequestMapping("/login")
	public String Login() {
		return "Welcome to Login Page";
	}
}
