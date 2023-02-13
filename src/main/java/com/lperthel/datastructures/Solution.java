package com.lperthel.datastructures;

public class Solution {

	private ListNode reverseListEnd;

	public ListNode reverseBetween(ListNode head, int left, int right) {
    	if(head== null || right == 1) {
    		reverseListEnd = head.next;
    		return head;
    	}
    	if(left >= 2) {
    		ListNode tail = reverseBetween(head.next,left-1,right-1);
    		{
    			if(tail != head.next)
    				head.next.next = reverseListEnd;
    			head.next = tail;
    		
    		}
    			return head;
    	}
    	else {
    		ListNode nextNode = head.next;
    	
    		ListNode tail = reverseBetween(nextNode,left,right-1);
    		nextNode.next = head;
    		head.next = null;
    		return tail;}
    		    }
}
