package com.example.firstWebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomePageController {
	@RequestMapping("/")
	@ResponseBody
	public String greet() {
		System.out.println("Website is LIVE");  //it will be printed in the console only when homepage is visited
		return "Welcome to the Home Page";    //it will pe printed on browser
	}
}
