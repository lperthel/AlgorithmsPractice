package com.lperthel.datastructures;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class ReverseALinkedListTest {
private ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
	@Test
	void test_GivenArrayOfNums_ExpectReversedPrintedListOfNodes() {
ListNode[] input = ListNode.generateList(1,2,3,4,5)	;
String expected = "[5,4,3,2,1]";
ListNode reverse= reverseLinkedList.reverseList(input [0]);
String actual = ListNode.printList(reverse);

assertEquals(expected,actual);
	}
	@Test
	void test_GivenNullExpectNull() {
ListNode nullList= reverseLinkedList.reverseList(null);
assertNull(nullList);
	}

}
