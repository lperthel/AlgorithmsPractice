package com.lperthel.sequences;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IsomorphicStringsTest {
	private IsomorphicStrings solution = new IsomorphicStrings();
	@Test
	void testGiven3CharIsomorphicString_ExpectTrue() {
	String s = "egg";
			String t = "add";
			assertTrue(solution.isIsomorphic(s,t));
	}
	@Test
	void Test_GivenStringWithRepeatedMappedCharacter_ExpectFalse() {
	String s = "eggy";
			String t = "addd";
			assertFalse(solution.isIsomorphic(s,t));
			assertFalse(solution.isIsomorphic(t,s));
	}
	
//class end
}