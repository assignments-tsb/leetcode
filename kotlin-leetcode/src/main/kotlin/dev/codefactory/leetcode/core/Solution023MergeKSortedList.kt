package dev.codefactory.leetcode.core

import dev.codefactory.leetcode.core.shared.ListNode

class Solution023MergeKSortedList {
    private fun mergeKLists(lists: Array<ListNode?>): ListNode? {
        if (lists.isEmpty()) return null

        var remaining = lists.size - 1

        while (remaining != 0) {
            var i = 0
            var j = remaining

            while (i < j) {
                lists[i] = mergeNodes(lists[i], lists[j])

                i++
                j--

                if (i >= j) remaining = j
            }
        }

        return lists[0]
    }

    private fun mergeNodes(a: ListNode?, b: ListNode?): ListNode? {
        if (a==null && b==null) return null
        if (a==null) return b
        if (b==null) return a

        if(a.`val` <= b.`val`) {
            a.next = mergeNodes(a.next, b)
            return a
        }

        b.next = mergeNodes(a, b.next)
        return b
    }

    fun mergeKLists(listNodes: ArrayList<ListNode>): ListNode? {
        val a: Array<ListNode?> = Array(listNodes.size) { i -> ListNode(i) }
        for (i in 0 until listNodes.size) {
            a[i] = listNodes[i]
        }

        return mergeKLists(a)
    }
}