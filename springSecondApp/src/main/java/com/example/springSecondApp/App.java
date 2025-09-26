package com.example.springSecondApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        Developer dev1=(Developer) context.getBean("dev1");
        dev1.build();
        Developer dev2= (Developer) context.getBean("dev2");
        dev2.build();
    }
}
