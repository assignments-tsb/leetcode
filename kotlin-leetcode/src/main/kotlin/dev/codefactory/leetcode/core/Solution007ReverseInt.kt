package dev.codefactory.leetcode.core

class Solution007ReverseInt {
    fun reverse(x: Int): Int {
        var i = x
        var reversed: Long = 0
        var remainder: Int

        while (i != 0) {
            remainder = i % 10
            reversed = (reversed*10)+remainder
            i /= 10
        }

        if (reversed >= Int.MAX_VALUE
            || reversed <= Int.MIN_VALUE) {
            return 0
        }

        return reversed.toInt()
    }
}