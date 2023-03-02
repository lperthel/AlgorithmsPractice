package com.lperthel.trees;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

class NaryTreePreorderTraversalTest {

	private NaryTreePreorderTraversal solution = new NaryTreePreorderTraversal();
	@Test
	void testExample1() {
		Node input = Node.generateExample1();
		List<Integer> list = Arrays.asList(1,3,5,6,2,4);
String actual = StringUtils.join(	solution.preorder(input), ",");
String expected = StringUtils.join(list,",");
assertEquals(expected,actual);
	}

}
