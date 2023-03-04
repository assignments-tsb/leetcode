package dev.codefactory.leetcode.core

import spock.lang.Specification

class Solution2444CountSubArraysWithBoundsSpec extends Specification {

    def solution = new Solution2444CountSubArraysWithBounds()

    def 'it should count the number of sub-arrays matching the bound'(int[] array, int minK, int maxK, int expected) {

        when:
        def result = solution.countSubarrays(array, minK, maxK)

        then:
        result == expected

        where:
        array           | minK  | maxK  | expected
        [1,3,5,2,7,5]   | 1     | 5     | 2
        [1,1,1,1]       | 1     | 1     | 10
    }
}
