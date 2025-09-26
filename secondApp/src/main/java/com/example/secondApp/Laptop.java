package com.example.secondApp;

import org.springframework.stereotype.Component;

@Component
public class Laptop {

	public void compile() {
		System.out.println("Compilation Completed without any error");
	}
	public void debugAndRun() {
		System.out.println("Program debugging and Running....");
	}
}
