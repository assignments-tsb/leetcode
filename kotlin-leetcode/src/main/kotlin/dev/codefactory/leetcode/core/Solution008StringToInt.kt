package dev.codefactory.leetcode.core

class Solution008StringToInt {
    fun myAtoi(s: String): Int {
        if (s.isEmpty()) return 0

        var isNegativeNumber = false

        var value: Long = 0
        for (c in s) {
            val digit = c.toInt()-48
            if (c == '-' && value <= 0) {
                isNegativeNumber = true
            } else if (digit in 0..9) {
                value = value*10 + digit
            } else if (c != '+' && c != ' ' && value <= 0) {
                return 0
            }

            if (value > Int.MAX_VALUE) {
                return if(isNegativeNumber) Int.MIN_VALUE else Int.MAX_VALUE
            }
        }

        if (isNegativeNumber) {
            return -1*value.toInt()
        }

        return value.toInt()
    }
}