package com.lperthel.NonLinearDataStructures;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

class BinaryTreeLevelOrderTraversalTest {
private BinaryTreeLevelOrderTraversal solution = new BinaryTreeLevelOrderTraversal();
	@Test
	void testExample1() {

		TreeNode input = TreeNode.generateExample1();
				List<Integer> row1 = Arrays.asList(3);
		List<Integer> row2 = Arrays.asList(9,20);
		List<Integer> row3 = Arrays.asList(15,7);
		String expected = StringUtils.join(Arrays.asList(row1,row2,row3),",");
		String actual = StringUtils.join(solution.levelOrder(input), ",");
	assertEquals(expected,actual);
	}

}
