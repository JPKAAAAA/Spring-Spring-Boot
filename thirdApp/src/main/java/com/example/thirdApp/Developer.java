package com.example.thirdApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Developer {
	
	/*
	@Autowired
	private Computer laptop;    //Field Injection
	
	
	public Developer(Computer laptop) {
		this.laptop=laptop;
	}
	
	@Autowired
	public void setComputer(Computer laptop) {
		this.laptop=laptop;
	}
	*/
	//Remove @Primary from class Desktop and un-comment the above code the program will still run. Here the compile() method of Laptop class will be called.
	// this is because the name of the reference variable (of type Computer) is laptop and there is a class named Laptop (of type Computer).
	// If we change the name from laptop to lapto then it will not work
	
	@Autowired
	private Computer computer;
	
	public Developer(Computer computer) {
		this.computer=computer;
	}
	
	@Autowired
	public void setComputer(Computer computer) {
		this.computer=computer;
	}
	
	public void code() {
		System.out.println("I am coding a Spring boot project");
		computer.compile();
	}
}

