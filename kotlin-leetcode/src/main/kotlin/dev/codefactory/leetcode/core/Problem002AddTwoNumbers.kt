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
        return ListNode(l1!!.`val` + l2!!.`val`)
    }
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}