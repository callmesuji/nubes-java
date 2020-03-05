package com.nubes.internship.day_4;

import java.util.Scanner;

public class RecursionSumOfNAturalNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number For Factorial :");
		int num = sc.nextInt();
		sc.close();
		System.out.println(sum(num));
	}

	private static int sum(int num) {
		if (num == 0)
			return 0;
		return num + sum(num - 1);

	}

}
