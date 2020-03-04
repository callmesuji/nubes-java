package com.nubes.internship.testcases.day_2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.nubes.internship.day_2.MissingNumber;

public class MissingNumberSpec {

	@SuppressWarnings("static-access")
	@Test
	void missingElement() {
		MissingNumber obj = new MissingNumber();
 		assertEquals(7, obj.missingNumber(new int[] { 1, 2, 3, 4, 5, 6, 8, 9},8));

	}

}
