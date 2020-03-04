package com.nubes.internship.day_1;

/*Write a program to accept a number “n” from the user; then display the series 1,3,5,7,9,…,n and find the sum of the numbers in this series.*/
import java.util.Scanner;

public class PrimeNumSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		System.out.print("prime numbers for entered number " + num + " is : ");
		int count = primes(num);
		System.out.println();
		System.out.println("Total count of primes for " + num + " is : " + count);
		sc.close();
	}

	public static int primes(int num) {
		int count = 0;
		for (int i = 0; i <= num; i++) {
			if (isprime(i)) {
				System.out.print(i + " ");
				count += i;
			}
		}
		return count;
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