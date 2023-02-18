package dev.codefactory.leetcode.core

class Solution004MedianOfTwoSortedArrays {

    private fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        val newArray = ArrayList<Int>()
        newArray.addAll(nums1.toList())
        newArray.addAll(nums2.toList())
        newArray.sort()

        val size = newArray.size
        val mid = size/2

        if (size%2 == 0) {
            return (newArray[mid] + newArray[mid-1]) / 2.0
        }

        return newArray[mid].toDouble()
    }

    //for testing purposes only
    fun findMedianSortedArrays(nums1: ArrayList<Int>, nums2: ArrayList<Int>): Double {
        return findMedianSortedArrays(nums1.toIntArray(), nums2.toIntArray())
    }
}