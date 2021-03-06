// Remove Duplicates from Sorted List Total Accepted: 64286 Total Submissions: 186128 My Submissions Question Solution 
// Given a sorted linked list, delete all duplicates such that each element appear only once.

// For example,
// Given 1->1->2, return 1->2.
// Given 1->1->2->3->3, return 1->2->3.

// Hide Tags Linked List

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class RemoveDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
    	if (head == null) {
    		return head;
    	}

    	ListNode dummy = new ListNode(0);
    	dummy.next = head;
    	while (head.next != null) {
    		if (head.val == head.next.val) {
    			head.next = head.next.next;
    		}
    		else {
	    		head = head.next;
    		}
    	}

    	return dummy.next;
    }
}
