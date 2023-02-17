package dev.codefactory.leetcode.core

class Problem003LongestSubstring {
    fun lengthOfLongestSubstring(s: String): Int {
        if (s.length<=1) return 1
        if (isNotRepeating(s)) return s.length
        return maxOf(lengthOfLongestSubstring(s.drop(1)), lengthOfLongestSubstring(s.dropLast(1)))
    }

    private fun isNotRepeating(s: String): Boolean {
        val existence = mutableMapOf<String, Boolean>()

        for (i in s.indices) {
            val currentChar = s[i].toString()

            if (existence.containsKey(currentChar)) {
                return false
            }

            existence[currentChar] = true
        }

        return true
    }

}