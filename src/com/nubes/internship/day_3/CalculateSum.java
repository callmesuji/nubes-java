package com.nubes.internship.day_3;

/*create a class CalculateSum with the int sum() method and pass different number of 
parameters of type int and invoke the sum() method and display the result.
*/
public class CalculateSum {

	public static void main(String[] args) {
		System.out.println(sum(10, 20));
		System.out.println(sum(30, 40));
	}

	public static int sum(int... arr) {
		int sum = 0;
		for (int ele : arr) {
			sum += ele;
		}
		return sum;

	}
}