package com.nubes.internship.day_2;

public class IntegerSearch {

	public static void main(String[] args) {
		int[] arr = new int[] { 5, 6, 10, 13, 8 };
		System.out.println(search(arr, 10));
	}

	public static boolean search(int[] arr, int n) {
		boolean isfound = false;
		for (int i = 0; i < arr.length; i++) {
			if (n == arr[i]) {
				return isfound = true;
			}
		}
		return isfound;
	}
}
