package dev.codefactory.leetcode.core

class Solution005LongestPalindromicSubstring {
    fun longestPalindrome(s: String): String {
        if (s.length<=1) return s
        if (s.length==2) {
            return if (s[0]==s[1]) s
            else s[0].toString()
        }

        return s
    }
}