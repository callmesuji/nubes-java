package com.nubes.internship.day_3;

/*Write a program to Create class Product with pid, pname , price and display(). 
Create 10 objects and store in an array. Display all product information by using display() method.*/
public class Product {
	int pid;
	String pname;
	double price;

	public void display() {
		System.out.println("Id      : " + pid);
		System.out.println("Name    : " + pname);
		System.out.println("Price   : " + price);
		System.out.println("----------------------");
	}

	public Product(int pid, String pname, double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}

}
