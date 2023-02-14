package com.lperthel.datastructures;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DeleteNthNodeFromEndOfListTest {
private Solution solution = new Solution();
	
	@Test
	void test_GivenOneElemntListExpectNull() {
		
ListNode oneElementList=(ListNode.generateList(1))[0]; 
assertNull(solution.removeNthFromEnd(oneElementList,1));
	}
	@Test
	void  test_GivenMultiElementList_ExpectDeletedMiddleElement() {
int n =2;
		ListNode[] input = ListNode.generateList(1,2,3,4,5);
String expected = "[1,2,3,5]";
ListNode deletedNth= solution.removeNthFromEnd(input [0],n);
String actual = ListNode.printList(deletedNth);
assertEquals(expected,actual);
	}

}