package dev.codefactory.leetcode.core;

import dev.codefactory.leetcode.core.common.ListNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution0025ReverseNodes {
    public ListNode reverseKGroup(ListNode head, int k) {
        Queue<ListNode> q = new LinkedList<>();
        var current = head;

        var i = k;
        while (current!=null && i>0) {
            q.offer(current);
            current = current.next;
            i--;
        }

        while (!q.isEmpty()) {
            var top = q.remove();
            top.next = current;
            current = top;
        }

        return current;
    }

}
