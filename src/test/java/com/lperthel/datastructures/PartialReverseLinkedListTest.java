package com.lperthel.datastructures;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PartialReverseLinkedListTest {
	private Solution partialReverseLinkedList = new Solution();
	@Test
	void test_GivenArrayOfNums_ExpectPartiallyReversedPrintedListOfNodes() {
int left =3;
		ListNode[] input = ListNode.generateList(0,1,2,3,4,5);
		int right = 5;
String expected = "[0,1,4,3,2,5]";
ListNode reverse= partialReverseLinkedList.reverseBetween(input [0],left,right);
String actual = ListNode.printList(reverse);

assertEquals(expected,actual);
	}
	@Test
	void test_GivenArrayOfNums_ExpectFullyReversedPrintedListOfNodes() {
int left =1;
		ListNode[] input = ListNode.generateList(2,3,4);
		int right = 3;
String expected = "[4,3,2]";
ListNode reverse= partialReverseLinkedList.reverseBetween(input [0],left,right);
String actual = ListNode.printList(reverse);

assertEquals(expected,actual);
	}
	@Test
	void test_GivenArrayOfNums_ExpectReversedFrontSectionOfList() {
int left =1;
		ListNode[] input = ListNode.generateList(1,2,3);
		int right = 2;
String expected = "[2,1,3]";
ListNode reverse= partialReverseLinkedList.reverseBetween(input [0],left,right);
String actual = ListNode.printList(reverse);

assertEquals(expected,actual);
	}

}