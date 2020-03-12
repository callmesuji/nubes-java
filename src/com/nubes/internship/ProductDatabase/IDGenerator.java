package com.nubes.internship.ProductDatabase;

public class IDGenerator {
	private static Integer id = 1000;

	public static Integer getnewid() {
		return id++;
	}

}
