package com.lperthel.datastructures;

public class RemoveNthNodeFromEndOfList {
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode dummy = new ListNode();
		dummy.next = head;
ListNode right = stepForward(dummy,n);
removeNthFromEndHelper(dummy,right,n);
return dummy.next;
	 
	}
	private ListNode stepForward(ListNode head, int n) {
				for(int i=0;i<n;i++)
					head = head.next;
				return head;
}
	private  void removeNthFromEndHelper(ListNode   head, ListNode right, int n) {
	while(right.next != null) {
		head = head.next;
		right = right.next;
	}
	head.next = head.next.next;
	}
}