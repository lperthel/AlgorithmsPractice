package com.lperthel.sequences;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ThreeSumTest {
private Solution solution = new Solution();
private List<List<String>>expected ;
@Before
private void init() {	
expected = new ArrayList<>() ;
}
	@Test
	public void test_Given3ElementArray_ReturnResultsAs3SumList() {
		int[] ThreeElementArray = {-1, 0, 1};
expected.add(Arrays.asList("-1","0","1"));

	}
}