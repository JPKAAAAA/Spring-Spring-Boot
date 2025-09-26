package com.example.springSecondApp;

public class Developer {
	private String name;
	private int age;
	Computer computer;
	public Developer() {
		System.out.println("Developer Constructor");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Computer getComputer() {
		return computer;
	}

	public void setComputer(Computer computer) {
		this.computer = computer;
	}
	
	@Override
	public String toString() {
		return "Developer [name=" + name + ", age=" + age + "]";
	}

	public void build() {
		System.out.println(toString());
		System.out.println("Working on Awesome Project");
		computer.compile();
	}
}
