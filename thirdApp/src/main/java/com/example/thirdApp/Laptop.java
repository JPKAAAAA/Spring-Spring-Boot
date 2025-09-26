package com.example.thirdApp;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
	public void compile() {
		System.out.println("Compilation Completed without any error");
	}
	public void debugAndRun() {
		System.out.println("Program debugging and Running....");
	}
}
