package com.nubes.internship.day_1;

/*Write a program to accept two numbers num1 and num2; when one is subtracted from the other, 
 * the result should always be a positive number.*/
import java.util.Scanner;

public class PositiveNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number num1 : ");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number num2 : ");
		int num2 = sc.nextInt();
		int sub;
		if (num1 > num2) {
			sub = num1 - num2;
			System.out.println("The result (difference) is : " + sub);
		} else {
			sub = num2 - num1;
			System.out.println("The result (difference) is : " + sub);
		}
		sc.close();
	}

}
