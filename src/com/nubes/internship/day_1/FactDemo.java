package com.nubes.internship.day_1;

public class FactDemo {

	public static void main(String[] args) {
		int num = 7; // 120
		int fact = getFact(num);
		System.out.println(fact);
	}

	private static int getFact(int num) {

		if (num == 0 || num == 1 || num == 2) {
			return 1;
		} else {
			int j = 2;
			for (int i = 3; i <= num; i++) {
				j *= i;
			}
			return j;
		}
	}
}
