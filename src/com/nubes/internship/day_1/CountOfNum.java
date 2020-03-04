package com.nubes.internship.day_1;

/*Write a program to accept a number from the user and count the number of digits in the number.*/
import java.util.Scanner;

public class CountOfNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		sc.close();
		
		count(num);

	}

	public static int count(int num) {
		if(num == 1) {
			return num;
		}else if(num > 1) {
			
		}
		
		return num;
		
	}

}
