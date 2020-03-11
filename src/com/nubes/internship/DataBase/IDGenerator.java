package com.nubes.internship.DataBase;

public class IDGenerator {
	private static Integer id = 1001;

	private IDGenerator() {
	}

	public static Integer getId() {
		return id++;
	}
}
