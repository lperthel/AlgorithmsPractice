package com.lperthel.datastructures;

public class LinkedListCycleII {
	public ListNode detectCycle(ListNode head) {
		if(head == null)
			return null;
ListNode dummy = new ListNode();
		ListNode hare= hasCycle(head);		
if(hare== null)
	return null;
dummy.next = head;
return findIntersection(dummy,hare);
	}
	public ListNode hasCycle(ListNode head) {
		ListNode scout = head.next;
		while(head!=scout && head!=null && scout!=null && scout.next!=null) {
			head= head.next;
			scout=scout.next.next;
		}
		if(head ==scout)
			return scout;
		else
			return null;
	}
    private ListNode findIntersection(ListNode tortoise, ListNode hare) {
    	while(hare != tortoise) {
    		tortoise = tortoise.next;
    		hare = hare.next;
    	}
    	return tortoise;
	}
	}
