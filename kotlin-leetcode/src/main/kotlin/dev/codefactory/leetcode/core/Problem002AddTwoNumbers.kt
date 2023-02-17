package dev.codefactory.leetcode.core

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Problem002AddTwoNumbers {

    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        val sum = ListNode(l1!!.`val` + l2!!.`val`)

        if (l1.next!=null && l2.next!=null) {
            sum.next = addTwoNumbers(l1.next, l2.next)
        }

        return sum
    }
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null

    override fun toString(): String {
        if (next==null) return "$`val`"
        return "$`val` -> ${next.toString()}"
    }

    override fun equals(other: Any?): Boolean {
        if (other == null || other !is ListNode) {
            return false
        }

        if (next!=null && other.next!=null) {
            return `val` == other.`val` && next!! == other.next
        }
        return `val` == other.`val`
    }

    override fun hashCode(): Int {
        var result = `val`
        result = 31 * result + (next?.hashCode() ?: 0)
        return result
    }
}