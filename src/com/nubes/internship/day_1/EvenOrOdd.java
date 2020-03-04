package com.nubes.internship.day_1;
/*Write a program to accept a number from the user and determine whether it is even or odd.*/
import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		if(num%2 != 0) {
			System.out.println("The entered number "+num+" is odd");
		}else {
			System.out.println("The entered number "+num+" is even");
		}
		sc.close();
	}

}
