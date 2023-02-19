package dev.codefactory.leetcode.core

import dev.codefactory.leetcode.core.shared.ListNode

/**
 * https://leetcode.com/problems/add-two-numbers/
 *
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution002AddTwoNumbers {

    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        if (l1==null && l2!=null) return l2
        if (l2==null && l1!=null) return l1

        val sum = ListNode((l1?.`val`?:0) + (l2?.`val`?:0))
        val excess = if (sum.`val` >= 10) ListNode(1) else null

        if (l1?.next!=null || l2?.next!=null) {
            sum.next = addTwoNumbers(addTwoNumbers(l1?.next, l2?.next), excess)
        } else if (excess!=null) {
            sum.next = excess
        }

        sum.`val` = sum.`val` % 10
        return sum
    }
}

