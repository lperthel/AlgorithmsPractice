package com.lperthel.datastructures;

public class Solution {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		if(n == 1)
			return head.next;
		else {
			return head;
		}
}
}