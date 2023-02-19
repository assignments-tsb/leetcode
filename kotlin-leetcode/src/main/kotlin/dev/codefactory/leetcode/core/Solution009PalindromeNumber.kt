package dev.codefactory.leetcode.core

class Solution009PalindromeNumber {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) return false

        val asStr = x.toString()
        val lastIndex = asStr.length-1

        for (i in 0 .. lastIndex/2) {
            if (asStr[i] != asStr[lastIndex-i]) {
                return false
            }
        }

        return true
    }
}