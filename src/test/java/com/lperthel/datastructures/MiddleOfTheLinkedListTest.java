package com.lperthel.datastructures;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MiddleOfTheLinkedListTest {
private MiddleOfTheLinkedList solution = new MiddleOfTheLinkedList();
	@Test
	void test_GivenFiveElementList_ExpectMiddleElement() {
		ListNode[] input = ListNode.generateList(1,2,3,4,5);
String actual = ListNode.printList(solution.middleNode(input[0]));
String expected =ListNode.printList(input[2]);
assertEquals(expected,actual);
	}
	@Test
	void test_GivenSixElementList_ExpectMiddleElement() {
		ListNode[] input = ListNode.generateList(1,2,3,4,5,6);
String actual = ListNode.printList(solution.middleNode(input[0]));
String expected =ListNode.printList(input[3]);
assertEquals(expected,actual);
	}

}
