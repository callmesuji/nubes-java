package com.nubes.internship.day_1;
/*Write a program to accept a number from the user and determine whether it is an Armstrong number or not.*/
import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int rev = 0;
		int temp = num;

		while (temp != 0) {
			int r = temp % 10;
			rev = rev + (r * r * r);
			temp /= 10;
		}
		if (num == rev) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not Armstrong Number");
		}
		sc.close();
	}

}
