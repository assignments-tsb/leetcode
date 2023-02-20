package dev.codefactory.leetcode.core

class Solution005LongestPalindromicSubstring {
    fun longestPalindrome(s: String): String {
        if (s.length<=1) return s
        if (s.length==2) {
            return if (s[0]==s[1]) s
            else s[0].toString()
        }

        val n = s.length
        val flags = Array(n) { BooleanArray(n) }

        for (i in 0 until n) {
            flags[i][i] = true
        }

        var maxLength = 1
        var start = 0

        for (i in 0 until n-1) {
            if (s[i] == s[i+1]) {
                flags[i][i+1] = true
                start = i
                maxLength = 2
            }
        }

        for (currentLength in 3 .. n) {
            for (i in 0 until (n-currentLength+1)) {
                val end = i + currentLength - 1

                if (flags[i+1][end-1] && s[i] == s[end]) {
                    flags[i][end] = true

                    if (currentLength > maxLength) {
                        start = i
                        maxLength = currentLength
                    }
                }
            }
        }

        return s.substring(start, start+maxLength)
    }
}