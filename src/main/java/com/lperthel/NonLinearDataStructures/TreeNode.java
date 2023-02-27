package com.lperthel.NonLinearDataStructures;

 public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 public static TreeNode generateExample1() {
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
 }
