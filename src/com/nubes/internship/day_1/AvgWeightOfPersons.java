package com.nubes.internship.day_1;
/*Write a program to accept the weight of 3 persons, calculate the total weight, 
 * determine the average weight and display these details.*/

import java.util.Scanner;

public class AvgWeightOfPersons {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the weight of the first person: ");
		double person1 = sc.nextDouble();
		System.out.println("Enter the weight of the second person: ");
		double person2 = sc.nextDouble();
		System.out.println("Enter the weight of the third person: ");
		double person3 = sc.nextDouble();
		double sum = person1 + person2 + person3;
		double avg = (sum) / 3;
		System.out.println(
				"The sum of weight of the 3 persons is " + sum + " Kgs and the average weight is " + avg + " Kgs");
		sc.close();
	}

}
