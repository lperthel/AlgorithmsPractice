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

}
