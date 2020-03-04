package com.nubes.internship.day_1;
/*Write a program to accept a number “n” from the user; find the sum of the series 1/23+1/33+1/43……..+1/n3*/

import java.util.Scanner;

public class SumOfSeries2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		System.out.println(sum(num));
		sc.close();
	}

	private static double sum(int num) {
		double sum = 0.0;

		for (int i = 1; i <= num; i++) {
			sum += 1 / Math.pow(i + 1, 3);
		}

		return sum;
	}

}
