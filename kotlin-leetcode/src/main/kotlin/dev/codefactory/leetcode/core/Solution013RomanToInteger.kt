package dev.codefactory.leetcode.core

import java.lang.IllegalArgumentException

class Solution013RomanToInteger {
    fun romanToInt(s: String): Int {
        if (s.length==1) return strToInt(s)

        return 0
    }

    private fun strToInt(s: String): Int = when(s) {
        "I" -> 1
        "V" -> 5
        "X" -> 10
        "L" -> 50
        "C" -> 100
        "D" -> 500
        "M" -> 1000
        else -> throw IllegalArgumentException("Unknown roman numeral $s")
    }
}