package com.nubes.internship.day_2;

public class VowelsConsonantsCount {

	public static void main(String[] args) {
		String str = "helloworld";
		countvowels_consonants(str);
	}
	public static void countvowels_consonants(String str) {
		int c_count = 0, v_count = 0;
		int n = str.length();
		for (int i = 0; i < n; i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				v_count++;
			} else {
				c_count++;
			}
		}
		System.out.println("No of vowels in a string is " + v_count);
		System.out.println("No of vowels in a string is " + c_count);
		

	}

}
