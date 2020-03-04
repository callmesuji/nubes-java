package com.nubes.internship.day_1;
/*Write a program to accept 2 numbers “m” and “n” from the user and determine m^n (without using predefined functions).*/

import java.util.Scanner;

public class PowOfNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		double num1 = sc.nextInt();
		System.out.println("Enter second number : ");
		double num2 = sc.nextInt();
		double p = Math.pow(num1, num2);
		System.out.println(p);
		sc.close();
	}

}
