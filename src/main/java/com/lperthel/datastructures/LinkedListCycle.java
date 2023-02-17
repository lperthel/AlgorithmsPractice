package com.lperthel.datastructures;

public class LinkedListCycle {

public boolean hasCycle(ListNode head) {
	if(head ==null)
		return false;
	ListNode scout = head.next;
	while(head!=scout && head!=null && scout!=null && scout.next!=null) {
		head= head.next;
		scout=scout.next.next;
	}
	if(head ==scout)
		return true;
	else
		return false;
    }
}