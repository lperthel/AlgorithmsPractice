package com.lperthel.datastructures;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PartialReverseLinkedListTest {
	private Solution partialReverseLinkedList = new Solution();
	@Test
	void test_GivenArrayOfNums_ExpectReversedPrintedListOfNodes() {
ListNode[] input = ListNode.generateList(2,3,4);
String expected = "[4,3,2]";
ListNode reverse= partialReverseLinkedList.reverseBetween(input [0],0,0);
String actual = ListNode.printList(reverse);

assertEquals(expected,actual);
	}
	@Test
	void test_GivenNullExpectNull() {
ListNode nullList= partialReverseLinkedList.reverseBetween(null,0,0);
assertNull(nullList);
	}

}
	