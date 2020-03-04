package com.nubes.internship.day_2;

public class ArrayOperations {

	public static void main(String[] args) {
		int[] arr = new int[] { 100, 20, 30, 50, 50, 2002, 2001 };

		System.out.println("Biggest Element :" + biggest(arr));
		System.out.println("Second Biggest Element :" + second_biggest(arr));
	}

	/*
	 * private static int S_big(int[] arr) { int big = 0; int s_big = 0; for (int i
	 * = 0; i < arr.length; i++) { if (arr[i] > big) { s_big = big; big = arr[i]; }
	 * else if (arr[i] > s_big && arr[i] != big) { s_big = arr[i]; } }
	 * 
	 * return s_big; }
	 */
	public static int second_biggest(int[] arr) {
		int s_big = 0, big = 0;
		for (int a : arr) {
			if (a > big) {
				s_big = big;
				big = a;
			} else if (a > s_big && a != big) {
				s_big = a;
			}
		}
		return s_big;
	}

	public static int biggest(int[] arr) {
		int big = arr[0];
		for (int a : arr) {
			if (big < a) {
				big = a;
			}
		}
		return big;
	}
}