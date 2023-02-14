package com.lperthel.datastructures;

public class PartiallyReversedLinkedList {

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
    			head.next = tail;
    		}
    			return head;
    	}
    	else {
    		ListNode nextNode = head.next;
    	
    		ListNode tail = reverseBetween(nextNode,left-1,right-1);
    		nextNode.next = head;
    		if(left == 1) 
    			head.next = reverseListEnd;
    		
    		else
    		head.next = null;
    		return tail;}
    		    }
}
