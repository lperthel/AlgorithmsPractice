		package com.lperthel.sequences;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.lperthel.util.Printer;

class MergeIntervalsTest {
	private Solution solution = new Solution();
private 	int[][]  actual;
	@BeforeEach
	public void X() {	
	actual = null;
	}

	@Test
	void test_Given4ElementArrayWith3Overlaps_Return3ElementArray() {
//		final int[][] input = {{1,3},{2,6},{8,10},{15,18}};
		final int[][] input = {{1,3},{2,6}};
		int[][] expected  = {{1,6}};
		actual = solution .merge(input);
		assertEquals(Arrays.deepToString(expected),Arrays.deepToString(actual));
	}

}
