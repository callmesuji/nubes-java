package com.nubes.internship.testcases.day_2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.nubes.internship.day_2.IntegerSearch;

public class IntegerSearchSpec {
	@SuppressWarnings("static-access")
	@Test
	public void WithIntegerSearch() {
		IntegerSearch obj = new IntegerSearch();
		boolean res = obj.search(new int[] { 5, 6, 10, 13, 8 }, 8);
		assertEquals(true, res);

	}

}
