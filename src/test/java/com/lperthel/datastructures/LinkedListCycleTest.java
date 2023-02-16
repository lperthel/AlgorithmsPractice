package com.lperthel.datastructures;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinkedListCycleTest {
private Solution solution = new Solution(); 
	@Test
	void test_GivenOneElemntListExpectFalse () {
ListNode oneElementList=(ListNode.generateList(1))[0]; 
assertFalse(solution.hasCycle(oneElementList));
	}
	
}
