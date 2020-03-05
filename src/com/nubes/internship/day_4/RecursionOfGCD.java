package com.nubes.internship.day_4;

import java.util.Scanner;

public class RecursionOfGCD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The First NUmber For Factorial :");
		int num1 = sc.nextInt();
		System.out.println("Enter The Second Number For Factorial :");
		int num2 = sc.nextInt();
		sc.close();
		System.out.println("The GCD Of " + num1 + " And " + num2 + " Is : " + gcd(num1, num2));
	}

	private static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);

	}

}
