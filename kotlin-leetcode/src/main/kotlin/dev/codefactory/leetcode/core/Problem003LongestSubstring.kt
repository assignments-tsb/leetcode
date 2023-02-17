package dev.codefactory.leetcode.core

class Problem003LongestSubstring {
    fun lengthOfLongestSubstring(s: String): Int {
        if (s.length<=1 || isNotRepeating(s)) return s.length

        if (isNotRepeating(s.drop(1))
            || isNotRepeating(s.dropLast(1))) {
            return s.length-1
        }

        return maxOf(lengthOfLongestSubstring(s.drop(1)), lengthOfLongestSubstring(s.dropLast(1)))
    }

    private val cache = mutableMapOf<String, Boolean>()

    private fun isNotRepeating(s: String): Boolean {
        if (cache.containsKey(s)) return false

        val existence = mutableMapOf<String, Boolean>()

        for (i in s.indices) {
            val currentChar = s[i].toString()

            if (existence.containsKey(currentChar)) {
                cache[s] = true
                return false
            }

            existence[currentChar] = true
        }

        return true
    }

}