package com.nubes.internship.day_1;

/*Write a program to add the first 7 terms of the following series using a for loop:
1/1!+2/2!+3 /3!+....*/
import java.util.Scanner;

public class SumOfSeries3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		double num = sc.nextInt();
		System.out.println(sum(num));
		sc.close();
	}

	public static double sum(double num) {
		double res = 0.0;
		double fact = 1;
		for (int i = 1; i <= num; i++) {
			res = res + (i / fact * i);
		}

		return res;
	}
}