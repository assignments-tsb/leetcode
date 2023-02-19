package dev.codefactory.leetcode.core.shared

class ListNodeUtil {

    static ListNode createNode(Integer[] numbers) {
        if (numbers.length == 0) return null
        if (numbers.length == 1) return new ListNode(numbers[0])
        def node = new ListNode(numbers[0])
        node.next = createNode(numbers.drop(1))
        return node
    }
}
