package com.nubes.internship.day_1;

/*Write a program to accept 3 numbers from the user and find the biggest of them.*/
import java.util.Scanner;

public class BigOfThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number num1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the 2nd number num2: ");
		int num2 = sc.nextInt();
		System.out.println("Enter the 3rd number num3: ");
		int num3 = sc.nextInt();
		int big;
		if (num1 > num2 && num1 > num3) {
			big = num1;
			System.out.println("The biggest of the 3 numbers entered is: " + big);
		} else if (num2 > num3) {
			big = num2;
			System.out.println("The biggest of the 3 numbers entered is: " + big);
		} else {
			big = num3;
			System.out.println("The biggest of the 3 numbers entered is: " + big);
		}
		sc.close();
	}
}