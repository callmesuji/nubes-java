package com.nubes.internship.day_5;

public class IDGenerator {

	private static Integer cid = 1000;

	public static Integer getNewId() {
		return cid++;
	}

}
