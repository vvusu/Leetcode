package com.vvusu.leetcode;

import com.vvusu.list.ListNode;

// https://leetcode.com/problems/linked-list-cycle/submissions/
public class _0141_环形链表 {
	
	public boolean hasCycle(ListNode head) {
		if (head == null || head.next == null) {
			return false;
		}
		ListNode slow = head;
		ListNode fast = head.next;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return true;
			}
		}
		return false;
	}
}