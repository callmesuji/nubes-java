package com.nubes.internship.day_1;
/*Write a program to accept two numbers num1, num2 and an operator. Simulate the calculator using switch statement.*/

import java.util.Scanner;

public class ArithmeticOpUsingSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number : ");
		int num2 = sc.nextInt();
		System.out.println("1.addition 2. subtraction 3. multiplication 4. division 5. modulus ");
		sc.nextLine();
		int s = sc.nextInt();
		int sum = 0;
		switch (s) {
		case 1:
			sum = num1 + num2;
			System.out.println("the addition of " + num1 + " and " + num2 + " is " + sum);
			break;
		case 2:
			sum = num1 - num2;
			System.out.println("the subtraction of " + num1 + " and " + num2 + " is " + sum);
			break;
		case 3:
			sum = num1 * num2;
			System.out.println("the multiplication of " + num1 + " and " + num2 + " is " + sum);
			break;
		case 4:
			sum = num1 / num2;
			System.out.println("the division of " + num1 + " and " + num2 + " is " + sum);
			break;
		case 5:
			sum = num1 % num2;
			System.out.println("the modulus of " + num1 + " and " + num2 + " is " + sum);
			break;

		default:
			System.out.println("please enter one of the above operator");
			break;
		}
		sc.close();
	}

}
