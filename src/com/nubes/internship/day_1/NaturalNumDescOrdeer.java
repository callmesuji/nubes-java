package com.nubes.internship.day_1;
/*Write a program to generate the first 'N' natural numbers and print them in descending order.*/

import java.util.Scanner;

public class NaturalNumDescOrdeer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of natural numbers to be generated :");
		int num = sc.nextInt();
		System.out.print("The first " + num + " natural numbers in descending order are : ");
		for (int i = num; i >= 1; i--) {
			System.out.print(i + " ");
		}
		sc.close();
	}

}
