package com.nubes.internship.testcases.day_2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.nubes.internship.day_2.BubbleSort;

public class BubbleSortSpec {

	@SuppressWarnings({ "static-access" })
	@Test
	void WithBubbleSort() {
		BubbleSort obj = new BubbleSort();
		int[] values = { 64, 34, 25, 12, 22, 11, 90 };
		int[] expected = { 11, 12, 22, 25, 34, 64, 90 };
		obj.bubblesort(values);
		assertArrayEquals(expected, values);

	}

}