package com.lperthel.trees;

import lombok.ToString;

public class TreeNode {
     int val;
     public TreeNode left;
     public TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 public static TreeNode generateNaryTreeExample1() {
	 TreeNode root = new TreeNode(3);
	 TreeNode node2 =new TreeNode(9);
	 TreeNode node3 = new TreeNode(20);
	 TreeNode node4 =new TreeNode(15);
	 TreeNode node5 =new TreeNode(7);
	root.left = node2;
	root.right = node3;
	node3.left = node4;
	node3.right = node5;
	 
	 return root;
 
 }
 public static TreeNode generateValidBinarySearchTree() {
	 
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

public static TreeNode generateDuplicateElementsTree() {
	 
	 TreeNode root = new TreeNode(2);
	 TreeNode node2 =new TreeNode(2);
	 TreeNode node3 = new TreeNode(2);
	root.left = node2;
	root.right = node3;
	 return root;
 
 }

@Override
public String toString() {
	return "TreeNode [val=" + val + "]";
}
 
 }
