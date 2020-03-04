package com.nubes.internship.day_1;
/*Write a program to accept the principal amount, rate of interest, time and calculate the simple interest.*/

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principal amount : ");
		int P = sc.nextInt();
		System.out.println("Enter the rate of interest ");
		double R = sc.nextDouble();
		System.out.println("Enter the time : ");
		int T = sc.nextInt();
		double SI = (P * T * R) / 100;
		System.out.println("Simple interest is " + SI);
		sc.close();

	}

}
