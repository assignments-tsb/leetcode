package dev.codefactory.leetcode.core

import java.util.Stack

class Solution032LongestValidParenthesis {

    fun longestValidParentheses(s: String): Int {

        val stack = Stack<Int>()
        stack.push(-1)
        var longest = 0

        for (i in 0 until s.length) {
            if (s[i] == '(') {
                stack.push(i)
            } else {
                stack.pop()

                if (stack.isEmpty()) {
                    stack.push(i)
                } else {
                    longest = maxOf(longest, i-stack.peek())
                }
            }
        }

        return longest
    }
}