package com.nubes.internship.day_1;

/*Write a program to accept the lower bound number and the upper bound number from the user and print the prime numbers between them.*/
import java.util.Scanner;

public class PrimeNumBetweenRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lower bound value : ");
		int num1 = sc.nextInt();
		System.out.println("Enter the upper bound value : ");
		int num2 = sc.nextInt();
		sc.close();
		primeRanges(num1, num2);
		System.out.println();
	}

	public static void primeRanges(int lb, int up) {
		System.out.print("The prime numbers between " + lb + " and " + up + " are : ");

		for (int i = lb; i <= up; i++) {
			if (isprime(i)) {
				System.out.print(i + " ");
			}
		}

	}

	private static boolean isprime(int num) {
		if (num < 2) {
			return false;
		}
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}

}
