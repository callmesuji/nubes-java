package com.nubes.internship.day_7;

import java.util.HashSet;
import java.util.Set;

public class RemovingElementsWithSameName {
	public static void main(String[] args) {
		RemovingElementsWithSameName obj = new RemovingElementsWithSameName();
		Set<String> set = new HashSet<>();
		set.add("Sujith");
		set.add("Rajesh");
		set.add("Mahesh");
		set.add("Suresh");
		obj.removeElements(set, "Mhesh");
		// System.out.println(set);

	}

	private void removeElements(Set<String> set, String name) {
		if (set.contains(name)) {
			set.remove(name);
			System.out.println(set);
		} else {
			System.out.println("Entered Name Not Fond");
		}
	}

}
