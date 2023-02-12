package com.lperthel.datastructures;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReverseALinkedListTest {
private Solution solution = new Solution();
	@BeforeEach
	void setUp() throws Exception {
	}
	@Test
	void test_GivenArrayOfNums_ExpectReversedPrintedListOfNodes() {
ListNode[] input = ListNode.generateList(1,2,3,4,5)	;
String expected = "[5,4,3,2,1]";
ListNode reverse= solution.reverseList(input [0]);
String actual = ListNode.printList(reverse);
assertEquals(expected,actual);
	}


	@Test
	void test_GivenTwoElementLL_ExpectedReverseLL() {
//		ListNode twoElemnListNode List = ListNode.generateList)1,2;
fail();		
	}

}
