package com.nubes.internship.Listdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmpDriver {
	public static void main(String[] args) {
		Employee emp1 = new Employee(1001, "sujith", "Bangalore");
		Employee emp2 = new Employee(1002, "Rajesh", "Bangalore");
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(emp1);
		emp.add(emp2);
		for (Employee e : emp) {
			System.out.println(e);
		}
		System.out.println("----------------------------");
		Iterator<Employee> itr = emp.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
