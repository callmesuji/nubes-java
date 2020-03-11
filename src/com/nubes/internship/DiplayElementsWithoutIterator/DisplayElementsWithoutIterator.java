package com.nubes.internship.DiplayElementsWithoutIterator;

import java.util.ArrayList;
import java.util.List;

public class DisplayElementsWithoutIterator {
	public static void main(String[] args) {
		DisplayElementsWithoutIterator obj = new DisplayElementsWithoutIterator();
		List<String> list = new ArrayList<>();
		list.add("Sujith");
		list.add("Rajesh");
		list.add("Mahesh");
		list.add("Suresh");
		list.add("Rajesh");

		obj.showElements(list);

	}

	private void showElements(List<String> list) {
		System.out.println(list.toString());
	}

}
