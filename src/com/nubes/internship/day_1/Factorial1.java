package com.nubes.internship.day_1;

/*Write a program to accept a number and find the factorial of the number (using while loop).*/
import java.util.Scanner;

public class Factorial1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		sc.close();
		fact(num);
	}

	private static void fact(int num) {
		int rev = 0;
		while (num == 0 || num == 1) {
			System.out.println("you have entered one number :" + num);
			break;
		}
		while (num > 1) {
			rev = rev * 10 + num % 10;
			num /= 10;
			num--;
		}
		System.out.println(rev + " ");

	}
}
