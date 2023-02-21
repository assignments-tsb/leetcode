package dev.codefactory.leetcode.core

class Solution008StringToInt {
    fun myAtoi(s: String): Int {
        if (s.isEmpty()) return 0

        var isNegativeNumber: Boolean? = null

        var value: Long = 0
        for (c in s) {
            val digit = c.toInt()-48
            if (c == '-' && value <= 0) {
                if (isNegativeNumber != null) return 0
                isNegativeNumber = true
            } else if (c == '+') {
                if (isNegativeNumber != null) return 0
                isNegativeNumber = false
            } else if (digit in 0..9) {
                value = value*10 + digit
            } else if (c != '+' && c != ' ') {
                break
            }

            if (value > Int.MAX_VALUE) {
                return if(isNegativeNumber==null || !isNegativeNumber) Int.MAX_VALUE else Int.MIN_VALUE
            }
        }

        if (isNegativeNumber!=null && isNegativeNumber) {
            return -1*value.toInt()
        }

        return value.toInt()
    }
}