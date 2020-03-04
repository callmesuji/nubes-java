package com.nubes.internship.day_2;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 64, 34, 25, 12, 22, 11, 90 };
		System.out.println("Before Sorting :" + Arrays.toString(arr));
		bubblesort(arr);
		System.out.println("After Sorting  :" + Arrays.toString(arr));

	}

	public static void bubblesort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}
		}

	}
}