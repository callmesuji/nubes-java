package com.nubes.internship.day_1;
/*Write a program to accept a number from the user and count the number of prime digits.*/
import java.util.Scanner;

public class CountNumOfPrimeDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int count = 0;
		while (num != 0) {
			int r = num % 10;
			if (isprime(r)) {
				count++;
			}
			num /= 10;
		}
		System.out.println("Number of prime digits in the entered number is : " + count);
		sc.close();
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