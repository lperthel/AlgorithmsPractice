package com.lperthel.datastructures;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class LinkedListCycleTest {
private LinkedListCycle linkedListCycle = new LinkedListCycle(); 
	@Test
	void test_GivenOneElemntListExpectFalse () {
ListNode oneElementList=(ListNode.generateList(1))[0]; 
assertFalse(linkedListCycle.hasCycle(oneElementList));
	}
	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS)
	void  test_Given4ElementListWithCycle_ExpectTrue() {
		ListNode[] input = ListNode.generateList(1,2,3,4,5);
		input[3].next = input[1];
		assertTrue(linkedListCycle.hasCycle(input[0]));
}
}