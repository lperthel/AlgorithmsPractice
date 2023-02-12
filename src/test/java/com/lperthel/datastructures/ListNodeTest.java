package com.lperthel.datastructures;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ListNodeTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test_GivenArrayOfNums_ExpectPrintedListOfNodes() {
ListNode.generateList(1,2,3,4,5)	;
String expected = "[1,2,3,4,5]";
String actual = ListNode.printList((ListNode.generateList(1,2,3,4,5))[0]);
assertEquals(expected,actual);
	}
	}
