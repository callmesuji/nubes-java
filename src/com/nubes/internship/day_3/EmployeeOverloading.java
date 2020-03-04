package com.nubes.internship.day_3;
/*Write a program to Create class Employee with
Employee(int id,String name)
Employee(int id,String name,float sal)
void display();
    If the employee object has to be created with only two parameters, then initial default salary should be
    Rs 20000. Display employee details by using display method.*/

public class EmployeeOverloading {
	int id;
	String name;
	double salary;

	public EmployeeOverloading(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public EmployeeOverloading(int id, String name) {
		super();
		this.salary = 20000.0;
		this.id = id;
		this.name = name;
	}

	public void display() {
		System.out.println("Id :" + id);
		System.out.println("Name  :" + name);
		System.out.println("Salary :" + salary);
		System.out.println("------------------");
	}

}
