package com.example.springFirstApp;

public class Laptop {
	private String name;
	private double price;
	public Laptop() {
		System.out.println("Laptop Object Created");
		System.out.println(toString());
	}
	public Laptop(String name, double price) {
		super();
		this.name = name;
		this.price = price;
		System.out.println("Laptop Object Created");
		System.out.println(toString());
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptop [name=" + name + ", price=" + price + "]";
	}
	public void getDetails() {
		System.out.println(getName());
		System.out.println(getPrice());
	}
	public void compile() {
		System.out.println("Compilation Completed without any error");
	}
	public void debugAndRun() {
		System.out.println("Program debugging and Running....");
	}
}
