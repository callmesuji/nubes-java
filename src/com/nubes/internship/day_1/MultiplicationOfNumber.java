package com.nubes.internship.day_1;

/*Write a program to accept a number from the user and print its multiplication table (upto “times 10”).*/
import java.util.Scanner;

public class MultiplicationOfNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to generate its multiplication table:");
		int num = sc.nextInt();
		System.out.println("Multiplication table for " + num + " is :");
		for (int i = 1; i <= 10; i++) {
			int mul = num * i;
			System.out.println(num + " * " + i + " = " + mul);

		}
		sc.close();
	}
}
