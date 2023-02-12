package com.lperthel.datastructures;


public class ListNode {
 int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 static ListNode[]  generateList(int...nums) {
    	 ListNode[] nodes = new ListNode[nums.length];
    	 for(int i =0;i<nodes.length;i++)
    		 nodes[i] = new ListNode();
    	for(int i=0;i<nodes.length ;i++) {
    		nodes[i].val = nums[i];
    		if(i+1 != nums.length)
    		nodes[i].next = nodes[i+1];
    	}
    	return nodes;
     }
     static ListNode[]  reverseList(ListNode[] nodes) {
    	 ListNode[] revNodes = new ListNode[nodes.length];
    	
    	for(int i=0;i<nodes.length ;i++) {
    		if(i== 0)
    			nodes[i].next =null;
    		else
    		nodes[i].next = nodes[i-1];
    	}
    	return nodes;
     }
static String printList(ListNode node) {
	  StringBuilder nodesToString = new StringBuilder("[");
	  while(node!=null) {
		  nodesToString .append(node.val);
		  if(node.next != null)
		  nodesToString.append(",");
		  node = node.next;
	  }
	  nodesToString.append("]");
	  return nodesToString.toString();
  }
}