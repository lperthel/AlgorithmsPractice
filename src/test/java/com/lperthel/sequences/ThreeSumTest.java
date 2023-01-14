package com.lperthel.sequences;
import static com.lperthel.util.Printer.print;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;public class ThreeSumTest {
private Solution solution = new Solution();
private List<List<String>>expected ;
private List<List<String>>actual;
@Before
public void X() {	
expected = new ArrayList<>() ;
actual = null;
Solution.ThreeSumMatch.clearMatches();
}
@Test
public void test_GivenMultiElementArrayMultipleMatches_ReturnMatches() {
	final int[] multiElementArray = {-1,0,1,2,-1,-4};
	expected.add(Arrays.asList("-1","-1","2"));
	expected.add(Arrays.asList("-1","0","1"));
actual = solution.threeSum(multiElementArray );
print("actual = ",actual);
assertEquals(expected,actual);
}

@Test
public void test_GivenMultiElementArraySingleMatch_ReturnMatch() {
	int[] multiElementArray = {-1,0,1,2};
expected.add(Arrays.asList("-1","0","1"));
actual = solution.threeSum(multiElementArray );
print("actual = ",actual);
assertEquals(expected,actual);
}

@Test
@Ignore
public void test_GivenArrayWithNoThreeSums_ReturnEmptyList() {
	int[] multiElementArray = {-2,0,1};
expected.add(Arrays.asList("0","0","0"));
actual = solution.threeSum(multiElementArray );
print("actual = ",actual);
assertEquals(expected,actual);
}
@Test
public void test_GivenArrayofZeros_ReturnZeros() {
	int[] multiElementArray = {0,0,0};
expected.add(Arrays.asList("0","0","0"));
actual = solution.threeSum(multiElementArray );
print("actual = ",actual);
assertEquals(expected,actual);
}


}