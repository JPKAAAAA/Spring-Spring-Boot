package com.example.springFirstApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        //Developer dev= context.getBean(Developer.class);
        Developer dev=(Developer) context.getBean("dev1");
        dev.code();
        Laptop laptop= (Laptop) context.getBean("lap1");
        laptop.getDetails();
    }
}
