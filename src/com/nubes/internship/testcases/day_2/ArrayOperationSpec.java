package com.nubes.internship.testcases.day_2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.nubes.internship.day_2.ArrayOperations;

public class ArrayOperationSpec {
	@SuppressWarnings("static-access")
	@Test
	void withBiggestelement() {
		ArrayOperations obj = new ArrayOperations();
		int res = obj.second_biggest(new int[] { 100, 20, 30, 50, 50, 80, 90 });
		assertEquals(90, res);

	}

}
