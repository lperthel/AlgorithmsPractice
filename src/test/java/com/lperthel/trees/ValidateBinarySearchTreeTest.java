package com.lperthel.trees;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidateBinarySearchTreeTest {
private Solution solution = new Solution();
	@Test
	void testExample2() {
	TreeNode input = TreeNode.generateValidateBinarySearchTreeExample2();
	assertFalse(solution.isValidBST(input));
	}

}
