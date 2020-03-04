package com.nubes.internship.day_2;

public class MissingNumber {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 8, 9 };
		System.out.println(missingNumber(arr, arr.length));
	}

	public static int missingNumber(int[] arr, int n) {
		int total = 1;
		for (int i = 2; i < n+1; i++) {
			total += i;
			total -= arr[i-2];
		}
		return total;
	}
}
