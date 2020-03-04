package com.nubes.internship.day_1;

/*
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 */
import java.util.Scanner;

public class NumberPattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int s = 1;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(s + " ");
				++s;
			}
			System.out.println();

		}
		sc.close();

	}

}
