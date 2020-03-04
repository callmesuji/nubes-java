package com.nubes.internship.day_1;

/*Write a program to accept a number and find its factorial.*/
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int num = sc.nextInt();
		sc.close();
		System.out.print("The factorial of " + num + " is :" + fact(num));

	}

	public static int fact(int num) {
		if (num == 0) {
			return 1;
		}

		return num * fact(num - 1);

	}

}
