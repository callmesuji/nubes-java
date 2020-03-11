package com.nubes.internship.CrudOperationsUsingDatabaseConnection;

public class IDGenerator {
	private static Integer id = 1001;

	private IDGenerator() {
	}

	public static Integer getId() {
		return id++;
	}
}
