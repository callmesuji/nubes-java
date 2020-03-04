package com.nubes.internship.day_1;

import java.util.Scanner;

public class SwappingTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number num1 : ");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number num2 : ");
		int num2 = sc.nextInt();
		System.out.println("Before swap , the values of num1 = " + num1 + " and " + " num2 = " + num2);
		num1 = num2;
		num2 = num1;

		System.out.println("After swap , the values of num1 = " + num1 + " and " + " num2 = " + num2);
		sc.close();
	}

}
