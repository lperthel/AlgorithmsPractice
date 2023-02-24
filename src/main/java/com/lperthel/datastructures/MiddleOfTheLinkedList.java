package com.lperthel.datastructures;

public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
    int i , j = 0;
    ListNode refHead = head;
    while(refHead!=null) {
refHead = refHead.next;
    	j++;
    }
    
    	i = j/2;
    	for(j= 0;j<i;j++) {
    		head = head.next;
    	}
    	return head;

}
}