package com.nubes.internship.day_3;

/*Write a program to create a Class Student with id, name ,sub[5], display() and calSum(int a[]).
Find the sum and display the student details by using display() method.*/
import java.util.Scanner;

public class SwitchOperations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the choice : ");
		System.out.println("1.Factorial 2.Table 3.Prime Or Not");
		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("---Factorial---");
			System.out.println("Enter The Number For Factorial Value : ");
			int fact = sc.nextInt();
			isFactorial(fact);
			break;
		case 2:
			System.out.println("---TABLE---");
			System.out.println("Enter The Number TO Print Table : ");
			int num = sc.nextInt();
			isTable(num);
			break;
		case 3:
			System.out.println("---PRIME OR NOT---");
			System.out.println("Enter The Number TO Check Prime Or Not : ");
			int prime = sc.nextInt();
			boolean i = isPrime(prime);
			System.out.println(i);
			break;

		default:
			System.out.println("You Have Entered the Wrong Input Please Try Again.");
			sc.close();
			break;
		}
	}

	public static void isFactorial(int num) {
		int res = 1;
		if (num == 0 || num == 1) {
			System.out.println("The Value Of " + num + "! is :" + res);
		} else if (num > 1) {
			for (int i = 2; i <= num; i++) {
				res = res * i;
			}
			System.out.println(res);
		}
	}

	public static void isTable(int num) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}

	}

	public static boolean isPrime(int num) {
		if (num < 2) {
			return false;
		}
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;

	}

}
