package dev.codefactory.leetcode.core

import java.lang.IllegalArgumentException

class Solution013RomanToInteger {
    fun romanToInt(s: String): Int {
        val n = s.length

        var total = asInt(s[n-1])

        for (i in n-2 downTo 0) {
            val currentNumber = asInt(s[i])

            if (currentNumber >= asInt(s[i+1])) {
                total += currentNumber
            } else {
                total -= currentNumber
            }
        }

        return total
    }

    private fun asInt(s: Char): Int = when(s) {
        'I' -> 1
        'V' -> 5
        'X' -> 10
        'L' -> 50
        'C' -> 100
        'D' -> 500
        'M' -> 1000
        else -> throw IllegalArgumentException("Unknown roman numeral $s")
    }
}