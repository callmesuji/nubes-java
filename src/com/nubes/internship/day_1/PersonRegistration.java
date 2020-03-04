package com.nubes.internship.day_1;

/*The Sports Club registration form has the following details: name, mobile number and age. Per the membership policy, 
 * the person should be at least 18 years old to become a member. Write a program to accept the details mentioned above;
 *  if the age is >18 years then display the entered details with a congratulatory message, else the following message should be 
 *  displayed “Sorry! You need to be at least 18 years old to get membership.”*/
import java.util.*;

public class PersonRegistration {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name : ");
		String name = sc.next();
		System.out.println("Enter the mobile number : ");
		long m_no = sc.nextLong();
		System.out.println("Enter the age : ");
		int age = sc.nextInt();

		if (age <= 17) {
			System.out.println("“Sorry! You need to be at least 18 years old to get membership.");

		} else {
			System.out.println("Congratulations " + name + " for your successful registration.");
			System.out.println("Your Details Are As Follows : ");
			System.out.println("NAME : " + name);
			System.out.println("MOBILE NUMBER : " + m_no);
			System.out.println("AGE : " + age);

		}
		sc.close();
	}

}
