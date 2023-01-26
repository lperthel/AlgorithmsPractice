package com.lperthel.sequences;
import static com.lperthel.util.Printer.print;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
public class ThreeSumTest {
private ThreeSum solution = new ThreeSum ();
private List<List<Integer>>expected ;
private List<List<Integer>>actual;
@BeforeEach
public void X() {	
expected = new ArrayList<>() ;
actual = null;
}
@Test
public void test_GivenMultiElementArrayMultipleMatches_ReturnMatches() {
	final int[] multiElementArray = {-1,0,1,2,-1,-4};
	expected.add(Arrays.asList(-1,-1,2));
	expected.add(Arrays.asList(-1,0,1));
actual = solution.threeSum(multiElementArray );
print("actual = ",actual);
 	assertEquals(expected,actual);
}
@Test
public void test_GivenMultiElementArrayMultipleMatches_ReturnMatches2() {
	final int[] multiElementArray = {2, 1, 0, 1, -2};
	expected.add(Arrays.asList(-2, 0,2));
	expected.add(Arrays.asList(-2,1,1));
actual = solution.threeSum(multiElementArray );
print("actual = ",actual);
assertEquals(expected,actual);
}
/*
@Test
public void test_GivenMultiElementArrayMultipleMatches_ReturnMatches3() {
	final int[] multiElementArray = {6,-5,-6,-1,-2,8,-1,4,-10,-8,-10,-2,-4,-1,-8,-2,8,9,-5,-2,-8,-9,-3,-5};
	expected.add(Arrays.asList(-1,-1,2));
	expected.add(Arrays.asList(-1,0,1));
actual = solution.threeSum(multiElementArray );
print("actual = ",actual);
assertEquals(expected,actual);
}
*/
@Test
public void test_GivenMultiElementArraySingleMatch_ReturnMatch() {
	int[] multiElementArray = {-1,0,1,2};
expected.add(Arrays.asList(-1,0,1));
actual = solution.threeSum(multiElementArray );
print("actual = ",actual);
assertEquals(expected,actual);
}
@Test
public void test_GivenMultiElementArraySingleMatch_ReturnMatch2() {
	int[] multiElementArray = {-1,0,1,0};
expected.add(Arrays.asList(-1,0,1));
actual = solution.threeSum(multiElementArray );
print("actual = ",actual);
assertEquals(expected,actual);
}

@Test
public void test_GivenArrayWithNoThreeSums_ReturnEmptyList() {
	int[] multiElementArray = {0,1,1};
actual = solution.threeSum(multiElementArray );
print("actual = ",actual);
assertEquals(expected,actual);
}
@Test
@Timeout(value = 10)
public void test_GivenTripleOneArrayReturnEmptyList() {
	int[] multiElementArray = {1, 1, 1};
actual = solution.threeSum(multiElementArray );
print("actual = ",actual);
assertEquals(expected,actual);
}

@Test
public void test_GivenTriplesZeros_ReturnZeros() {
	int[] tripleZeroArray = {0,0,0};
expected.add(Arrays.asList(0,0,0));
actual = solution.threeSum(tripleZeroArray );
print("actual = ",actual);
assertEquals(expected,actual);
}
@Test
public void test_GivenTriplesZerosMixedArray_ReturnZeros() {
	int[] tripleZeroMixedArray = {0,0,0, 1};
expected.add(Arrays.asList(0,0,0));
actual = solution.threeSum(tripleZeroMixedArray );
print("actual = ",actual);
	assertEquals(expected,actual);
}
@Test
public void test_GivenQuadZeros_ReturnSinglesZerosMatch() {
	int[] quadZeroArray = {0, 0, 0,0};
expected.add(Arrays.asList(0,0,0));
actual = solution.threeSum(quadZeroArray );
print("actual = ",actual);
assertEquals(expected,actual);
}


@Test
public void test_GivenQuadZerosMixedArray_ReturnSinglesZerosMatch() {
	int[] quadZeroMixedArray = {0, 0, 0,0, 1};
expected.add(Arrays.asList(0,0,0));
actual = solution.threeSum(quadZeroMixedArray );
print("actual = ",actual);
assertEquals(expected,actual);
}

}