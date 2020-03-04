package com.nubes.internship.day_2;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 5, 4, 3, 2, 1 };
		System.out.println("Before Sorting :" + Arrays.toString(arr));
		insertionSort(arr);
		System.out.println("Before Sorting :" + Arrays.toString(arr));
		normalinsertionSort(arr);

	}

	public static int insertionSort(int[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int max = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > max) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = max;
		}
		return n;

	}

	public static int[] normalinsertionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		return arr;

	}

}
