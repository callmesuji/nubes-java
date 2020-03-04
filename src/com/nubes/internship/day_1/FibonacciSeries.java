package com.nubes.internship.day_1;

/*Write a program to accept a number and print the Fibonacci series up to the entered number.*/
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the upper bound number to generate the Fibonacci numbers : ");
		int num = sc.nextInt();
		System.out.println("Fibonacci series up to the entered number is: ");
		int a = 0, b = 1, sum = 0;
		System.out.print(a + " " + b);

		for (int i = 2; i <= num; i++) {
			sum = a + b;
			a = b;
			b = sum;
			System.out.print(" " + sum);
		}
		sc.close();
	}

}
