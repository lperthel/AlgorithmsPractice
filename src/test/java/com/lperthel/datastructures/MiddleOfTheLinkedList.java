package com.lperthel.datastructures;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MiddleOfTheLinkedList {
private Solution solution = new Solution();
	@Test
	void test_GivenFiveElementList_ExpectMiddleElement() {
		ListNode[] input1 = ListNode.generateList(1,2,4,5,6);
		ListNode[] input = ListNode.generateList(1,2,3,4,5);
String actual = ListNode.printList(solution.middleNode(input[0]));
String expected =ListNode.printList(input[2]);
assertEquals(expected,actual);
	}

}
