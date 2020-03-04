package com.nubes.internship.day_3;
/*Write a program to create a class Employee with id, name and salary. With the getter and
setter methods initialize the employee object. When you invoke toString() method, it should
display the id, name and salary.
     Example:
           Id=100;
           Name =”miani”
           Salary=25000;
           If invoked toString() method ,the output should be id =100 and name = miani and
           Salary = 25000*/

public class Employee {
	int id;
	String name;
	double salary;

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		Employee emp = new Employee(1001, "sujith", 2000.45);
		System.out.println(emp);
	}
}
