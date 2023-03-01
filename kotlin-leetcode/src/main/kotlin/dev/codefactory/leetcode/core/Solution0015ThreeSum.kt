package dev.codefactory.leetcode.core

import java.util.Collections

class Solution0015ThreeSum {

    private fun threeSum(nums: IntArray): List<List<Int>> {
        if (nums.isEmpty()) return Collections.emptyList()

        val result: MutableSet<List<Int>> = mutableSetOf()

        val sorted = nums.sorted()

        for (i in 0 until sorted.size-2) {
            for (j in i+1 until sorted.size-1) {
                for (k in j+1 until sorted.size) {
                    if (sorted[i] + sorted[j] + sorted[k] == 0) {
                        result.add(listOf(sorted[i], sorted[j], sorted[k]).sorted())
                    }
                }
            }
        }

        return result.toList()
    }

    fun threeSum(nums: List<Int>): List<List<Int>> {
        return threeSum(nums.toIntArray())
    }
}