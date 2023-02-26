package com.lperthel.NonLinearDataStructures;

import java.util.Arrays;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
@Getter @Setter
class Node {
	 public int val;
	 public List<Node> children;
	 public Node() {}

	 public Node(int _val) {
	     val = _val;
	 }

	 public Node(int _val, List<Node> _children) {
	     val = _val;
	     children = _children;
	 }
	 public static Node generateExample1() {
	 Node root= new Node(1);
	 List<Node> row2 = Arrays.asList(new Node(3), new Node(2), new Node(4));
	 List<Node> row3 = Arrays.asList(new Node(5), new Node(6));
	 root.children = row2;
	 row2.get(0).children = row3;
	 return root;
	 }
	}