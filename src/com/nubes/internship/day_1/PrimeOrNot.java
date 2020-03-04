package com.nubes.internship.day_1;

/*Write a program to accept a number and determine whether it is a prime number or not.*/
import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int num = sc.nextInt();
		sc.close();
		if (isprime(num)) {
			System.out.println("The entered number " + num + " is a prime number");
		} else {
			System.out.println("The entered number " + num + " is not a prime number");
		}
	}

	public static boolean isprime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int getprimes(int num) {
		
		return 1;

	}

}
