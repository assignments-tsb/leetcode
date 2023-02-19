package dev.codefactory.leetcode.core

import dev.codefactory.leetcode.core.shared.ListNode

class Solution023MergeKSortedList {
    private fun mergeKLists(lists: Array<ListNode?>): ListNode? {
        if (lists.isEmpty()) return null
        return null
    }

    fun mergeKLists(listNodes: ArrayList<ListNode>): ListNode? {
        val a: Array<ListNode?> = Array(listNodes.size) { i -> ListNode(i) }
        for (i in 0 until listNodes.size) {
            a[i] = listNodes[i]
        }

        return mergeKLists(a)
    }
}