package dev.codefactory.leetcode.core.shared

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

        if (next==null && other.next==null) {
            return `val` == other.`val`
        }

        return false
    }

    override fun hashCode(): Int {
        var result = `val`
        result = 31 * result + (next?.hashCode() ?: 0)
        return result
    }
}