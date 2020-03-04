package com.nubes.internship.day_3;
/*Write a program to Create class Employee with
Employee(int id,String name)
Employee(int id,String name,float sal)
void display();
    If the employee object has to be created with only two parameters, then initial default salary should be
    Rs 20000. Display employee details by using display method.*/

public class EmployeeOverloadingDriver {

	public static void main(String[] args) {
		EmployeeOverloading emp1 = new EmployeeOverloading(1001, "sujith");
		EmployeeOverloading emp2 = new EmployeeOverloading(1002, "Rajesh", 2500.99);
		emp1.display();
		emp2.display();
	}

}
