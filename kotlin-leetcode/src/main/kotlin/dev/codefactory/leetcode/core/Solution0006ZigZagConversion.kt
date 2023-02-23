package dev.codefactory.leetcode.core

class Solution0006ZigZagConversion {

    fun convert(s: String, numRows: Int): String {
        if (s.length <= 1) return s

        val sb = arrayOfNulls<StringBuilder>(numRows)
        for (i in 0 until numRows) sb[i] = StringBuilder()
        var i = 0
        val n = s.length
        while (i < n) {
            run {
                var j = 0
                while (j < numRows && i < n) {
                    sb[j]!!.append(s[i++])
                    j++
                }
            }
            var j = numRows - 2
            while (j > 0 && i < n) {
                sb[j]!!.append(s[i++])
                j--
            }
        }
        for (j in 1 until numRows) sb[0]!!.append(sb[j])
        return sb[0].toString()
    }
}