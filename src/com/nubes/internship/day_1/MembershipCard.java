package com.nubes.internship.day_1;

/*In a shopping mall, privileged customers (if they have a membership card) are being given a 10% discount on the billed amount, 
 * and the others are being given a 3% discount. Write a program to accept the billing amount and confirm the membership card from 
 * the customer; calculate and display the net amount to be paid by the customer.*/
import java.util.Scanner;

public class MembershipCard {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the bill amount : ");
		int amount = sc.nextInt();
		System.out.println("Do you have a membership card?");
		char ch = sc.next().charAt(0);
		double discount;
		double net_amount;
		if (ch == 'y' || ch == 'Y') {
			discount = (amount * 0.1);
			net_amount = (amount - discount);
			System.out.println("Thank you! Your total bill amount is Rs " + amount + ", discount is Rs "
					+ (int) discount + " net amount payable is Rs " + net_amount);
		} else {
			discount = (amount * 0.03);
			net_amount = (amount - discount);
			System.out.println("Thank you! Your total bill amount is Rs " + amount + ", discount is Rs "
					+ (int) discount + " net amount payable is Rs " + net_amount);
		}
		sc.close();
	}
}