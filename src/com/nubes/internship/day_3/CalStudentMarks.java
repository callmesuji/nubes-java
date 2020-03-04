package com.nubes.internship.day_3;

/*Write a program to create a Class Student with id, name ,sub[5], display() and calSum(int a[]).
Find the sum and display the student details by using display() method.*/
public class CalStudentMarks {
	int id;
	String name;
	int[] sub;

	public CalStudentMarks(int id, String name, int[] sub) {
		super();
		this.id = id;
		this.name = name;
		this.sub = sub;
	}

	public void display() {
		int sum = calsum(sub);
		System.out.println("Id :" + id);
		System.out.println("Name  :" + name);
		System.out.println("Total Marks :" + sum);
	}

	private int calsum(int[] s) {
		int sum = 0;
		for (int ele : s) {
			sum += ele;
		}
		return sum;
	}

}
