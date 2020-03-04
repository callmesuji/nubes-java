package com.nubes.internship.day_1;
/*Write a program to accept two numbers from the user and determine bigger of the two.*/
import java.util.Scanner;

public class BiggestOfTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number num1 : ");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number num2 : ");
		int num2 = sc.nextInt();
		int big;
		if (num1 > num2) {
			big = num1;
			System.out.println("The bigger of the two numbers entered (" + num1 + " and " + num2 + ")" + " is " + big);
		} else {
			big = num2;
			System.out.println("The bigger of the two numbers entered (" + num1 + " and " + num2 + ")" + " is " + big);
		}
		sc.close();
	}

}
