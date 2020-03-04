package com.nubes.internship.day_1;

/*Write a program to accept the following details of an employee: empno, name and monthly salary; 
 * calculate the yearly salary and display the result.*/
import java.util.Scanner;

public class MonthlySalary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the empno : ");
		int empno = sc.nextInt();
		System.out.println("Enter the employee name : ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Enter the monthly salary : ");
		double month_sal = sc.nextDouble();
		double year_sal = month_sal * 12;
		System.out.println("hi " + name + "! Your employee id is " + empno + ", monthly salary is Rs " + month_sal
				+ "and yearly salary is Rs" + year_sal);
		sc.close();
	}

}
