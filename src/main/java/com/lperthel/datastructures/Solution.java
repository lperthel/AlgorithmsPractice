package com.lperthel.datastructures;
/**
xx * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
    	if(head.next == null)
return head;
ListNode nextNode = head.next;
ListNode tail = reverseList(nextNode);
nextNode.next = head;
head.next = null;
return tail;
    }
}
