package com.nubes.internship.day_1;

/*Write a program to accept a number from the user and find the reverse of the entered number.*/
import java.util.Scanner;

public class ReverseANUmber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : "); // 12345
		int num = sc.nextInt();
		sc.close();
		System.out.println("The Revese Of Entered Number Is : " + isPalindrome(num)); // 54321
	}

	public static int isPalindrome(int num) {
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num /= 10;
		}
		return rev;
	}
}