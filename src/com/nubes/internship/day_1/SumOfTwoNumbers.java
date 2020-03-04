package com.nubes.internship.day_1;
/*Write a program to accept two numbers from the user, calculate the sum and display the same.*/

import java.util.Scanner;

public class SumOfTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num1 value: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the num2 value: ");
		int num2 = sc.nextInt();
		int sum = num1 + num2;
		System.out.println("sum of " + num1 + " and " + num2 + " is" + sum);
		sc.close();
	}

}
