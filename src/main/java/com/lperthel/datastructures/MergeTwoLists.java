package com.lperthel.datastructures;

public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
ListNode combinedTail = new ListNode();
ListNode combinedHead = combinedTail;
while(list1!= null && list2 != null) {
	if(list1.val < list2.val) {
		combinedTail.next = list1;
		list1= list1.next;
	} else {
		combinedTail.next = list2;
		list2 = list2.next;
	}
	combinedTail = combinedTail.next;
	combinedTail.next = null;
}
if(list1!=null)
	combinedTail.next = list1;
else
	combinedTail.next = list2;
return combinedHead.next;
    }

}
