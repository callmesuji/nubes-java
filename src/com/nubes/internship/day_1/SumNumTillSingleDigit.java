package com.nubes.internship.day_1;
/*Write a program to accept a number from the user and calculate the sum of digits of the number;
 *  repeat the operation till the sum gets to be a single digit number.*/

import java.util.Scanner;

public class SumNumTillSingleDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int sum = 0;

		while (num != 0) {
			int m = num % 10;
			sum += m;
			num /= 10;
		}
		int temp = sum;
		int sum_1 = 0;
		while (temp != 0) {
			int m = temp % 10;
			sum_1 += m;
			temp /= 10;

		}

		System.out.println(sum_1);
		sc.close();
	}

}
