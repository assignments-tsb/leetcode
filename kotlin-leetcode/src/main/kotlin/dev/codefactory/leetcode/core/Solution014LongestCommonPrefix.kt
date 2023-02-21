package dev.codefactory.leetcode.core

import kotlin.math.max

class Solution014LongestCommonPrefix {
    private fun longestCommonPrefix(strs: Array<String>): String {

        val maxLength = strs.fold(0) { a, b  -> max(a, b.length) } - 1
        var commonPrefix = ""

        for (i in 0 until  maxLength) {
            for (element in strs) {
                if (strs[0][i] != element[i]) {
                    return commonPrefix
                }
            }
            commonPrefix += strs[0][i]
        }

        return commonPrefix
    }

    fun longestCommonPrefix(strs: List<String>): String {
        return longestCommonPrefix(strs.toTypedArray())
    }
}