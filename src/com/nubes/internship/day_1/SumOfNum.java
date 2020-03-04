package com.nubes.internship.day_1;
/*Write a program to accept a number from the user and find the sum of digits in the entered number.*/
import java.util.Scanner;

public class SumOfNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : "); // 123
		int num = sc.nextInt();
		sc.close();
		sum(num);
		System.out.println("The Sum Of Entered Numbers Is : " + sum(num)); // output is 6.
	}

	public static int sum(int num) {
		int sum = 0;
		while (num != 0) {
			int rem = num % 10;
			sum = sum + rem;
			num /= 10;
		}
		return sum;
	}
}
