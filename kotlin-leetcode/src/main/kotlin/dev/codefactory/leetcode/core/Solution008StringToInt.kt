package dev.codefactory.leetcode.core

class Solution008StringToInt {
    fun myAtoi(s: String): Int {
        if (s.isEmpty()) return 0

        val cleanString = s.trimStart()
        var isNegativeNumber: Boolean = cleanString.startsWith("-")
        val cleanStringWithoutSign = if (cleanString.startsWith("-") || cleanString.startsWith("+")) {
            cleanString.drop(1)
        } else cleanString

        var value: Long = 0
        for (c in cleanStringWithoutSign) {
            val digit = c.toInt()-48
            if (digit in 0..9) {
                value = value*10 + digit
            } else if (c != '+' && c != ' ') {
                break
            }

            if (value > Int.MAX_VALUE) {
                return if(!isNegativeNumber) Int.MAX_VALUE else Int.MIN_VALUE
            }
        }

        if (isNegativeNumber) {
            return -1*value.toInt()
        }

        return value.toInt()
    }
}