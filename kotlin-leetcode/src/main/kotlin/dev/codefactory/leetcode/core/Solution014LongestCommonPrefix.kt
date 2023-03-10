package dev.codefactory.leetcode.core

import kotlin.math.min

class Solution014LongestCommonPrefix {
    private fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.size == 1) return strs[0]

        val maxLength = strs.fold(200) { a, b  -> min(a, b.length) }
        var commonPrefix = ""

        for (i in 0 until maxLength) {
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