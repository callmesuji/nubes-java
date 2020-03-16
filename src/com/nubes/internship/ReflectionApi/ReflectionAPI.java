package com.nubes.internship.ReflectionApi;

import java.lang.reflect.Method;
import java.util.InputMismatchException;

class Employee {
	private String name;
	private int empno;
	private double salary;

	public Employee() {
	}

	public Employee(String name, int empno, double salary) {
		super();
		this.name = name;
		this.empno = empno;
		this.salary = salary;
	}

	public void showInfo() {
		double taxamount = caltaxamount();
		double netsalary = taxamount - salary;
		System.out.println(name);
		System.out.println(netsalary);
	}

	private double caltaxamount() {
		return salary * 0.12;
	}

}

public class ReflectionAPI {
	public static void main(String[] args) {
		try {
			Class c = Class.forName("com.nubes.internship.ReflectionApi.Employee");
			Method method[] = c.getDeclaredMethods();
			for (Method m : method) {
				System.out.println(m);
			}

		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
	}

}
