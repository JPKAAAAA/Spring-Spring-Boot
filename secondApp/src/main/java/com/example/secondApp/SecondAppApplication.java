package com.example.secondApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
public class SecondAppApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SecondAppApplication.class, args);
		//Developer d=new Developer();    //this object is not created inside spring container, rather it is created somewhere else in the JVM
		Developer d=context.getBean(Developer.class);  //we are getting the Developer class object from spring container
		d.code();
	}

}
