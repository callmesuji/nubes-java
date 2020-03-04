package com.nubes.internship.day_1;

/*Write a program to accept the billing amount, if it is > 6000 then give a discount of 10% and display the net amount.*/
import java.util.Scanner;

public class DiscountCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the billing amount : ");
		int amount = sc.nextInt();
		if (amount > 6000) {
			int discount = (int) (amount - amount * 0.1);
			System.out.println("Your net billing amount: " + discount);
		} else {
			System.out.println(amount);
			sc.close();
		}
	}

}
