package com.nubes.internship.day_7;

import java.util.HashMap;
import java.util.Map;

public class HashMapUsingIntegers {

	public static void main(String[] args) {
		HashMapUsingIntegers obj = new HashMapUsingIntegers();
		Integer[] arr = { 1, 2, 3, 4, 5 };
		obj.getcube(arr);

	}

	private void getcube(Integer[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		for (Integer i : arr) {
			map.put(1, (int) Math.pow(i, 3));
			System.out.println(map);
		}
	}

}
