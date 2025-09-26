package com.example.springSecondApp;

public class Laptop implements Computer {
	public Laptop() {
		System.out.println("Laptop Constructor");
	}
	public void compile() {
		System.out.println("compiling");
	}
}
