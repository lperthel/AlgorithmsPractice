package com.lperthel.trees;

import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.Test;

class ValidateBinarySearchTreeTest {
private ValidateBinarySearchTree solution = new ValidateBinarySearchTree();
	@Test
	void testExample2() {
	TreeNode input = ValidateBinarySearchTreeTest.generateValidateBinarySearchTreeExample2();
	assertFalse(solution.isValidBST(input));
	}

@Test
void testGivenTreeWithDuplicateElements_ExpectFalse() {
TreeNode input = TreeNode.generateDuplicateElementsTree();
assertFalse(solution.isValidBST(input));
}
public static TreeNode generateValidateBinarySearchTreeExample2() {
	 TreeNode root = new TreeNode(5);
	 TreeNode node2 =new TreeNode(1);
	 TreeNode node3 = new TreeNode(4);
	 TreeNode node4 =new TreeNode(3);
	 TreeNode node5 =new TreeNode(6);
	root.left = node2;
	root.right = node3;
	node3.left = node4;
	node3.right = node5;
	 
	 return root;
 
 }
}