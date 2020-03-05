package com.nubes.internship.day_4;

public class Demo {
	public static void main(String[] args) {
		int num = 9845;
		while (num > 9) {
			int sum = num % 10 + num / 10;
			num = sum;
		}
		System.out.println(num);
	}
}
