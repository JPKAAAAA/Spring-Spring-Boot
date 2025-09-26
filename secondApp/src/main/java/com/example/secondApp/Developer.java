package com.example.secondApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Developer {
	/*
	private Laptop laptop;
	public Developer()
	{
		laptop=new Laptop();
	}
	*/
	
	@Autowired
	private Laptop laptop;    //Field Injection
	
	/*
	public Developer(Laptop laptop) {
		this.laptop=laptop;		//Constructor Injection, no need to write @Autowired because constructor injection is default
	}
	*/
	
	@Autowired
	public void setLaptop(Laptop laptop) {
		this.laptop=laptop;    //Setter Injection
	}
	
	public void code() {
		System.out.println("I am coding a Spring boot project");
		laptop.compile();
		laptop.debugAndRun();
	}
}
