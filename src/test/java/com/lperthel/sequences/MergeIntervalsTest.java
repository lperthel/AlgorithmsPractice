		package com.lperthel.sequences;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MergeIntervalsTest {
	private MergeIntervals mergeIntervals = new MergeIntervals();
private 	int[][]  actual;
	@BeforeEach
	public void X() {	
	actual = null;
	}

	@Test
	void test_Given4ElementArrayWith3Overlaps_Return3ElementArray() {
final int[][] input = {{1,3},{2,6},{8,10},{15,18}};
		int[][] expected  = {{1,6},{8,10},{15,18}};
		actual = mergeIntervals .merge(input);
		assertEquals(Arrays.deepToString(expected),Arrays.deepToString(actual));
	}
	@Test
	void test_GivenSingleOverlap_ReturnSingleElementArray() {
final int[][] input = {{1,4},{2,3}};
		int[][] expected  = {{1,4,}};
		actual = mergeIntervals .merge(input);
		assertEquals(Arrays.deepToString(expected),Arrays.deepToString(actual));
	}
@Test
void test_Given2elementArrayWithMinOverlap_ExpectSingleElementArray() {
final int[][] input = {{1,4},{0,4}};
	int[][] expected  = {{0,4}};
	actual = mergeIntervals .merge(input);
	assertEquals(Arrays.deepToString(expected),Arrays.deepToString(actual));
}
}