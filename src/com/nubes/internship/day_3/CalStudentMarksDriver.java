package com.nubes.internship.day_3;
/*Write a program to create a Class Student with id, name ,sub[5], display() and calSum(int a[]).
Find the sum and display the student details by using display() method.*/

public class CalStudentMarksDriver {

	public static void main(String[] args) {
		int[] marks = { 10, 30, 60 };
		CalStudentMarks s = new CalStudentMarks(1001, "sujith", marks);
		s.display();
	}

}
