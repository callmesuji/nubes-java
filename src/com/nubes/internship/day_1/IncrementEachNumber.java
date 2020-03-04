package com.nubes.internship.day_1;

import java.util.Scanner;

public class IncrementEachNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		sc.close();
		System.out.println(revNum(num)); // function call in print statement

	}

	private static int revNum(int num) {
		int rev = 0; // num =1234
		while (num != 0) {
			int dig = num % 10;
			if (dig == 9) {
				dig = 0;
			} else {
				dig += 1;
			}
			rev = rev * 10 + dig; // rev=5432
			num /= 10;
		}
		return numRev(rev); // Return value from numRev is 2345
	}

	private static int numRev(int num) {
		int rev = 0;
		while (num != 0) {
			int dig = num % 10;
			rev = rev * 10 + dig;
			num /= 10;
		}
		return rev; // rev=2345
	}

}