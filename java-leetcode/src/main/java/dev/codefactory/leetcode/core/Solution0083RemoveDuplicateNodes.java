package dev.codefactory.leetcode.core;

import dev.codefactory.leetcode.core.common.ListNode;

public class Solution0083RemoveDuplicateNodes {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = head;
        ListNode curr = head.next;

        while (curr != null) {
            if (prev.val == curr.val) {
                prev.next = curr.next;
            } else {
                prev = curr;
            }
            curr = curr.next;
        }

        return head;
    }
}
