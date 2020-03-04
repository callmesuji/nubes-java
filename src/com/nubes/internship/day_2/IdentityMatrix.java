package com.nubes.internship.day_2;

import java.util.Scanner;

public class IdentityMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any NUmber :");
		int num = sc.nextInt();
		sc.close();
		identity(num);
	}

	public static int identity(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					System.out.print(1 + " ");
				} else
					System.out.print(0 + " ");
			}
			System.out.println();
		}
		return n;
	}

}
