package com.nubes.internship.day_3;

/*Write a program to Create Class Product with id, name and  price. Create an object with names
laptop and desktop and swap the prices.

   Example:
      Product laptop=new product(100,’sony’,8500)
      Product desktop=new product(100,’sony’,35000)
      Display laptop price  as  35000 and desktop price  as 8500,  using pass by object.*/
public class ProductSalarySwapping {
	int id;
	String name;
	double salary;

	public ProductSalarySwapping(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void display() {
		System.out.println("Id :" + id);
		System.out.println("Name  :" + name);
		System.out.println("Salary :" + salary);
		System.out.println("------------------");
	}

	public static void main(String[] args) {
		ProductSalarySwapping laptop = new ProductSalarySwapping(1001, "dell", 25000.25);
		ProductSalarySwapping desktop = new ProductSalarySwapping(1002, "acer", 50000.50);
		laptop.display();
		desktop.display();

	}

}
