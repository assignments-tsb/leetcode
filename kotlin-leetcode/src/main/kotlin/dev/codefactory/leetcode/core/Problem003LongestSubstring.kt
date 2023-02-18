package dev.codefactory.leetcode.core

class Problem003LongestSubstring {
    private val cache = mutableMapOf<String, Boolean>()
    fun lengthOfLongestSubstring(s: String): Int {
        if (s.length<=1) return s.length

        var maxLength = 0
        var accumulator = ""

        for (i in s.indices) {

            val newChar = s[i].toString()

            if (accumulator.contains(newChar)) {
                accumulator = accumulator.substring(accumulator.indexOf(newChar)+1)
            }

            accumulator += newChar
            maxLength = maxOf(maxLength, accumulator.length)
        }

        return maxLength
    }

}