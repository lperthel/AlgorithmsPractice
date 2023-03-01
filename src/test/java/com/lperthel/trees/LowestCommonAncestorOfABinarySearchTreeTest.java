package com.lperthel.trees;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LowestCommonAncestorOfABinarySearchTreeTest {
private Solution solution = new Solution();
	@Test
	void testExample1() {
		TreeNode[] nodes= TreeNode.generateFourLevelBinarySearchTreeArray();
		TreeNode expected= nodes[0];
		TreeNode actual = solution.lowestCommonAncestor(nodes[0],nodes[1],nodes[2]);
		assertEquals(expected,actual);
	}
	@Test
	void testExample2() {
		TreeNode[] nodes= TreeNode.generateFourLevelBinarySearchTreeArray();
		TreeNode expected= nodes[1];
		TreeNode actual = solution.lowestCommonAncestor(nodes[0],nodes[1],nodes[4]);
		assertEquals(expected,actual);
	}

}
