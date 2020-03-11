package com.nubes.internship.ElementsToLeftLowerCaseAndRightUpperCase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LowerCaseAndUpperCase {

	public static void main(String[] args) {
		LowerCaseAndUpperCase obj = new LowerCaseAndUpperCase();

		List<String> list = new ArrayList<>();

		String names[] = { "sujith", "rajesh", "mahesh", "suresh", "nareen", "ambresh" };

		for (String name : names) {
			list.add(name);
		}

		Collections.sort(list);

		obj.getResults(list);

	}

	private void getResults(List<String> list) {
		int len = list.size();
		for (int i = 0; i < len / 2; i++) {
			System.out.println(list.get(i).toLowerCase());
		}
		for (int i = len / 2; i < len; i++) {
			System.out.println(list.get(i).toUpperCase());
		}

	}
}
