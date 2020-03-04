package com.nubes.internship.day_1;
/*Write a program to generate the first 'N' natural numbers. Accept the value of 'N' from the user.*/
import java.util.Scanner;

public class NaturalNumbersGenerator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of natural numbers to be generated : ");
		int num = sc.nextInt();
		System.out.println("First " + num + " natural numbers are : ");
		for (int i = 1; i <= num; i++) {
			System.out.print(i + " ");
		}
		sc.close();
	}

}
