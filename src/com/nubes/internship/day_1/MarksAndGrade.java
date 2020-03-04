package com.nubes.internship.day_1;

/*Write a program to accept the marks scored in three subjects; determine the sum and average of the entered marks.
 *  Grade is awarded based on following criteria.*/
import java.util.Scanner;

public class MarksAndGrade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks scored in 1st subject: ");
		int sub1 = sc.nextInt();
		System.out.println("Enter the marks scored in 1st subject: ");
		int sub2 = sc.nextInt();
		System.out.println("Enter the marks scored in 3rd subject:");
		int sub3 = sc.nextInt();
		int sum;
		int avg;
		char grade;
		sum = (sub1 + sub2 + sub3);
		avg = (sum) / 3;
		if (avg < 35) {
			grade = 'C';
			System.out.println("Total marks : " + sum);
			System.out.println("Average is  : " + avg);
			System.out.println("Grade       : " + grade);
		} else if (avg > 35 && avg < 60) {
			grade = 'B';
			System.out.println("Total marks : " + sum);
			System.out.println("Average is  : " + avg);
			System.out.println("Grade       : " + grade);
		} else {
			grade = 'A';
			System.out.println("Total marks : " + sum);
			System.out.println("Average is  : " + avg);
			System.out.println("Grade       : " + grade);
		}
		sc.close();
	}
}
