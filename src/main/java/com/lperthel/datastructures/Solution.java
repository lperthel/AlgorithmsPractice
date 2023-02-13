package com.lperthel.datastructures;

public class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
    	if(head== null || head.next == null)
    		return head;
    		ListNode nextNode = head.next;
    		ListNode tail = reverseBetween(nextNode,left,right);
    		nextNode.next = head;
    		head.next = null;
    		return tail;
    		    }
}
