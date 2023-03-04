package dev.codefactory.leetcode.core

import spock.lang.Specification

class Solution2444CountSubArraysWithBoundsSpec extends Specification {

    def static LARGE = [35054,398719,945315,945315,820417,945315,35054,945315,171832,945315,35054,109750,790964,441974,552913]
    def solution = new Solution2444CountSubArraysWithBounds()

    def 'it should count the number of sub-arrays matching the bound'(int[] array, int minK, int maxK, int expected) {

        when:
        def result = solution.countSubarrays(array, minK, maxK)

        then:
        result == expected

        where:
        array           | minK  | maxK   | expected
        [1,3,5,2,7,5]   | 1     | 5      | 2
        [1,1,1,1]       | 1     | 1      | 10
        LARGE           | 35054 | 945315 | 81
    }

}
