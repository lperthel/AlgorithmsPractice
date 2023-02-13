package com.lperthel.datastructures;

public class Solution {
    private ListNode reverseListStart;

	public ListNode reverseBetween(ListNode head, int left, int right) {
    	if(head== null || head.next == null)
    		return head;
    	if(left >= 2) {
    		if(left == 2)
    		reverseListStart = head;
    		ListNode tail = reverseBetween(head.next,left-1,right);
    		if(tail != head.next)
    			head.next = tail;
    		return head;
    	}
    	else {
    		ListNode nextNode = head.next;
    	
    		ListNode tail = reverseBetween(nextNode,left,right);
    		nextNode.next = head;
    		head.next = null;
    		return tail;}
    		    }
}
