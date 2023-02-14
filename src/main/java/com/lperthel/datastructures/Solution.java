package com.lperthel.datastructures;

public class Solution {
	private int m = 0;
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode dummy = new ListNode();
		dummy.next = head;
removeNthFromEndHelper(dummy,n);
return dummy.next;
	 
	}
	private ListNode removeNthFromEndHelper(ListNode head, int n) {
		if(head == null)
			return head;
		else {
var 			tail =removeNthFromEndHelper(head.next,n);
m++;
if(m == n)
	return tail;
head.next = tail;
			return head;
		}
}
}