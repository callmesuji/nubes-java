package com.nubes.internship.testcases.day_2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

import com.nubes.internship.day_2.InsertionSort;

public class InsertionSortSpec {
	@SuppressWarnings("static-access")
	@Test
	public void withInsertionSort() {
		InsertionSort obj = new InsertionSort();

		int[] values = { 5, 4, 3, 2, 1 };
		int[] expected = { 1, 2, 3, 4, 5 };
		obj.insertionSort(values);
		assertArrayEquals(expected, values);

	}

}
