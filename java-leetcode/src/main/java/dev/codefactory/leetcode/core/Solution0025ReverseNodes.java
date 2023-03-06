package dev.codefactory.leetcode.core;

import dev.codefactory.leetcode.core.common.ListNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution0025ReverseNodes {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) return null;

        Queue<ListNode> q = new LinkedList<>();
        var current = head;

        for (int i=0; i<k; i++) {
            // we don't have enough nodes to reverse,
            // keep the original
            if (current==null) return head;

            q.offer(current);
            current = current.next;
        }

        var finalNode = q.remove();
        finalNode.next = reverseKGroup(current, k);

        while (!q.isEmpty()) {
            var top = q.remove();
            top.next = finalNode;
            finalNode = top;
        }

        return finalNode;
    }

}
