package com.lperthel.sequences;
import static com.lperthel.util.Printer.print;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;public class ThreeSumTest {
private Solution solution = new Solution();
private List<List<String>>expected ;
private List<List<String>>actual;
@Before
public void init() {	
expected = new ArrayList<>() ;
actual = null;
}
	@Test
	public void test_Given3ElementArray_ReturnResultsAs3SumList() {
		int[] ThreeElementArray = {-1, 0, 1};
expected.add(Arrays.asList("-1","0","1"));
actual = solution.threeSum(ThreeElementArray );
print(expected);
assertEquals(expected,actual);c
	}
}