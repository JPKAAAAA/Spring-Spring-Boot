package com.example.springFirstApp;

public class Developer {
	private Laptop laptop;
	public Developer() {
		System.out.println("Developer Object Created");
	}
	
	public Developer(Laptop laptop) {
		super();
		this.laptop = laptop;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public void code() {
		System.out.println("I am coding a Spring project");
		laptop.compile();
		laptop.debugAndRun();
	}
}
