package com.lperthel.datastructures;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MergeTwoSortedListsTest {
private MergeTwoLists solution = new MergeTwoLists();
@Test
void test_givenTwoListsOfDifferentLength_ExpectMergedList() {
	ListNode[] input1 = ListNode.generateList(1,2,4,5,6);
	ListNode[] input2 = ListNode.generateList(1,3,4);
	String expected= ListNode.printList((ListNode.generateList(1,1,2,3,4,4,5,6))[0]);
String actual = ListNode.printList(solution.mergeTwoLists(input1[0], input2[0]));
	assertEquals(expected,actual);
	

}

}
