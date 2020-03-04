package com.nubes.internship.day_1;
/*Write a program to accept a number “n” from the user; then display the sum of the series 1+1/2+1/3+……….+1/n.*/

import java.util.Scanner;

public class SumOfSeries1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		// 1/1+1/2+1/3+……….+1/n.
		int num = sc.nextInt();
		System.out.println(sum(num));
		sc.close();
	}

	static double sum(int n) 
    { 
      double  s = 0.0; 
      for (int i = 1; i <= n; i++) 
          s = s + 1/i; 
      return s; 
    } 

}
