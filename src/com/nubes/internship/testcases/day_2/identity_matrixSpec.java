package com.nubes.internship.testcases.day_2;

import org.junit.Test;

import com.nubes.internship.day_2.IdentityMatrix;

public class identity_matrixSpec {
	@Test
	void withidentitymatrix() {
		IdentityMatrix obj = new IdentityMatrix();
		int[][] arr = new int[][] { { 1, 0, 0, 0 }, { 0, 1, 0, 0 }, { 0, 0, 1, 0 }, { 0, 0, 0, 1 } };
		int res = obj.identity(3);
		// assertArrayEquals(arr, obj.identity(3));

	}

}
