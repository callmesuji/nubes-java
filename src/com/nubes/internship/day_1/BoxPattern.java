package com.nubes.internship.day_1;

import java.util.Scanner;

public class BoxPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int n = 1;
		for (int i = num; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print(n + " ");
				++n;
			}

		}
		sc.close();
	}

}
