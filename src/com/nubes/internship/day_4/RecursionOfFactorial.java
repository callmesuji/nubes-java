package com.nubes.internship.day_4;

import java.util.Scanner;

public class RecursionOfFactorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number For Factorial :");
		int num = sc.nextInt();
		sc.close();
		System.out.println(fact(num));
		
	}

	private static int fact(int num) {
		if(num < 2) {
			return 1;
		}else 
			return num*fact(num-1);
	}

}
