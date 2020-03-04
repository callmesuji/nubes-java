package com.nubes.internship.day_2;

public class Frequencywords {

	public static void main(String[] args) {
		String[] s = new String[] { "cat", "cat", "cat", "puppy", "dog" };
		frequency(s);
	}

	public static void frequency(String[] s) {
		int count = 0;
		int n = s.length;
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j <= i; j++) {
				if (s[i].equals(s[j])) {
					count++;
				}

			}
		}
		System.out.println(count);

	}

}
