package com.nubes.internship.day_1;
/*Write a program to accept a character from the user and check whether it is a vowel or consonant using switch statement.*/

import java.util.Scanner;

public class VowelsAndConsonants {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any character : ");
		char ch = sc.next().charAt(0);
		switch (ch) {
		case 'a':
			System.out.println("you entered vowel");
			break;
		case 'e':
			System.out.println("you entered vowel");
			break;
		case 'i':
			System.out.println("you entered vowel");
			break;
		case 'o':
			System.out.println("you entered vowel");
			break;
		case 'u':
			System.out.println("you entered vowel");
			break;

		default:
			System.out.println("you entered consonant");
			break;
		}
		sc.close();

	}

}
