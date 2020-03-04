package com.nubes.internship.day_1;
/*Write a program to accept a number, if it is negative then covert it to a positive number.*/

import java.util.Scanner;

public class ConvertPositiveNumberToNegative {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		if (num != 0) {
			int result = -(num);
			System.out.println("the result is : " + result);
		}
		sc.close();
	}

}
