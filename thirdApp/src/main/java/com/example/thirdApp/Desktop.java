package com.example.thirdApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Computer {
	public void compile() {
		System.out.println("Compilation Completed instantly without any error");
	}
	public void debugAndRun() {
		System.out.println("Program debugging and Running....");
		System.out.println("Program Terminated Successfully!!!");
	}
}

