package com.lperthel.datastructures;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class LinkedListCycleIITest {
private Solution linkedListCycle = new Solution(); 
	@Test
	void test_GivenOneElemntListExpectFalse () {
ListNode oneElementList=(ListNode.generateList(1))[0]; 
assertNull(linkedListCycle.detectCycle(oneElementList));
	}
	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS)
	void  test_Given4ElementListWithCycle_ExpectTrue() {
		ListNode[] input = ListNode.generateList(1,2,3,4,5);
		input[3].next = input[1];
		assertEquals(input[3],linkedListCycle.detectCycle(input[0]));
}
}