package com.lperthel.datastructures;
class Solution {
    public ListNode reverseList(ListNode head) {
    	if(head== null || head.next == null)
return head;
ListNode nextNode = head.next;
ListNode tail = reverseList(nextNode);
nextNode.next = head;
head.next = null;
return tail;
    }
}
