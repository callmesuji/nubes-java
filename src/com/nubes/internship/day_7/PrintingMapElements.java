package com.nubes.internship.day_7;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PrintingMapElements {

	public static void main(String[] args) {
		PrintingMapElements obj = new PrintingMapElements();
		String[] names = { "Sujith", "Rajesh", "Mahesh", "Suresh" };
		obj.getElemets(names);
	}

	private void getElemets(String[] names) {
		Map<Integer, String> map = new HashMap<>();
		for (int i = 0; i < names.length; i++) {
			map.put(i + 1, names[i]);
		}
		
		Set<Entry<Integer, String>> es = map.entrySet();
		for (Entry<Integer, String> entry : es) {
			System.out.print(entry.getKey() + " : " + entry.getValue() + " ");
		}

	}
}
