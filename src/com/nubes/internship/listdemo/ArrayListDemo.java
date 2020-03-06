package com.nubes.internship.listdemo;

import java.util.ArrayList;

import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		System.out.println("List size :" + list.size());
		list.add("1001");
		list.add("1002");
		list.add("1003");
		list.add("sujith");
		list.add("Rajesh");
		System.out.println("Elements in List Are :" + list);
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("----------");
		for (String e : list) {
			System.out.println(e);
		}
		System.out.println("-----------");
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("1001");
		list2.add("1002");
		// list2.add("1003");
		list.removeAll(list2);
		Iterator<String> itr2 = list.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}

}
