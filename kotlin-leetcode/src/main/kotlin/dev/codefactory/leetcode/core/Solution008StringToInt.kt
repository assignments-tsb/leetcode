package dev.codefactory.leetcode.core

class Solution008StringToInt {
    fun myAtoi(s: String): Int {
        if (s.isEmpty()) return 0

        var isNegativeNumber = false

        var value = 0
        for (c in s) {
            if (c == '-' && value == 0) {
                isNegativeNumber = true
            }

            val digit = c.toInt()-48
            if (digit in 0..9) {
                value = value*10 + digit
            }
        }

        if (isNegativeNumber) {
            return -1*value
        }

        return value
    }
}