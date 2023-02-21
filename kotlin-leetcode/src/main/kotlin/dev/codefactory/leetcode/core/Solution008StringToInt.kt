package dev.codefactory.leetcode.core

class Solution008StringToInt {
    fun myAtoi(s: String): Int {
        if (s.isEmpty()) return 0

        val isNegativeNumber = s.startsWith("-")
        val absoluteStr = if (s.startsWith("-") || s.startsWith("+")) s.drop(1) else s

        var value = 0
        var multiplier = 1
        for (c in absoluteStr) {
            value = value*multiplier + c.digitToInt()
            multiplier *= 10
        }

        if (isNegativeNumber) {
            return -1*value
        }

        return value
    }
}