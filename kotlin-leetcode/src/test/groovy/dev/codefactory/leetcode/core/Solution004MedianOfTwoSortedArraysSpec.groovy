package dev.codefactory.leetcode.core

import spock.lang.Specification

class Solution004MedianOfTwoSortedArraysSpec extends Specification {

    def solution = new Solution004MedianOfTwoSortedArrays()

    def 'it should calculate the median of two sorted arrays with even elements'() {

        given:
        def nums1 = [1, 2]
        def nums2 = [3, 4]

        when:
        def median = solution.findMedianSortedArrays(nums1, nums2)

        then:
        median == 2.5 as Double
    }

    def 'it should calculate the median of two sorted arrays with odd elements'() {

        given:
        def nums1 = [1, 3]
        def nums2 = [2]

        when:
        def median = solution.findMedianSortedArrays(nums1, nums2)

        then:
        median == 2.0 as Double
    }
}
