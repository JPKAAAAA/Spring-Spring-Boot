package com.example.springSecondApp;

public class Desktop implements Computer {
	public Desktop() {
		System.out.println("Desktop Constructor");
	}
	public void compile() {
		System.out.println("compiling in Desktop");
	}
}
