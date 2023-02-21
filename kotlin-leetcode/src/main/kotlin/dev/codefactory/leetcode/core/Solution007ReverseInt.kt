package dev.codefactory.leetcode.core

class Solution007ReverseInt {
    fun reverse(x: Int): Int {
        var i = x
        var reversed = 0
        var remainder: Int

        while (i != 0) {
            remainder = i % 10
            reversed = (reversed*10)+remainder
            i /= 10
        }

        return reversed
    }
}