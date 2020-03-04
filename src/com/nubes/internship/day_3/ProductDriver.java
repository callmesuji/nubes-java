package com.nubes.internship.day_3;

/*Write a program to Create class Product with pid, pname , price and display(). 
Create 10 objects and store in an array. Display all product information by using display() method.*/
public class ProductDriver {

	public static void main(String[] args) {
		Product p1 = new Product(1001, "sujith", 123.45);
		Product p2 = new Product(1002, "rajesh", 132.45);
		Product p3 = new Product(1003, "suresh", 145.65);
		Product p4 = new Product(1004, "mahesh", 251.68);
		Product p5 = new Product(1005, "manju", 985.45);
		Product p6 = new Product(1006, "achal", 789.32);
		Product p7 = new Product(1007, "venkat", 625.45);
		Product p8 = new Product(1008, "prasad", 986.20);
		Product p9 = new Product(1009, "kiran", 569.02);

		Product[] arr = { p1, p2, p3, p4, p5, p6, p7, p8, p9 };
		for (Product p : arr) {
			p.display();
		}

	}

}
