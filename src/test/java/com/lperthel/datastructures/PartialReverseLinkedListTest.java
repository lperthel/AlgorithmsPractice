package com.lperthel.datastructures;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PartialReverseLinkedListTest {
	private Solution partialReverseLinkedList = new Solution();
	@Test
	void test_GivenArrayOfNums_ExpectReversedPrintedListOfNodes() {
int left =3;
		ListNode[] input = ListNode.generateList(0,1,2,3,4,5);
		int right = 5;
String expected = "[0,1,4,3,2,5]";
ListNode reverse= partialReverseLinkedList.reverseBetween(input [0],left,right);
String actual = ListNode.printList(reverse);

assertEquals(expected,actual);
	}
	@Test
	void test_GivenNullExpectNull() {
ListNode nullList= partialReverseLinkedList.reverseBetween(null,0,0);
assertNull(nullList);
	}

}
	