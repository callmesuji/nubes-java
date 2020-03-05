package com.nubes.internship.day_4;

public class StaticExample {

	int id;
	String name;
	static String college = "yts";

	static void change() {
		college = "BBit";
	}

	public StaticExample(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public void display() {
		System.out.println("id :" + id);
		System.out.println("name : " + name);
		System.out.println("college " + college);
		System.out.println("---------------------");
		}

	public static void main(String[] args) {
		StaticExample s1 = new StaticExample(101, "sujith");
		s1.display();
		StaticExample.change();
		StaticExample s2 = new StaticExample(102, "rajesh");
		s2.display();

	}

}
