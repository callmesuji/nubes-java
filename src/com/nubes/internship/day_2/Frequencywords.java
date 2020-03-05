package com.nubes.internship.day_2;

public class Frequencywords {

	public static void main(String[] args) {
		String[] s = new String[] { "cat", "cat", "cat", "puppy", "dog" ,"cat"};
		frequency(s);
	}

	public static void frequency(String[] s) {
		int count = 0;
		int n = s.length;
		for (int i = 0; i < n
				; i++) {
			for (int j = 0; j <= n-i-1; j++) {
				if (s[j].equals(s[j+1])) {
					count++;
				}

			}
		}
		System.out.println(count);

	}

}
