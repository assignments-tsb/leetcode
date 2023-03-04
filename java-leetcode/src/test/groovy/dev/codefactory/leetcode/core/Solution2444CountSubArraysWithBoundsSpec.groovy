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
        array           | minK      | maxK      | expected
        [1,3,5,2,7,5]   | 1         | 5         | 2
        [1,1,1,1]       | 1         | 1         | 10
        LARGE           | 35_054    | 945_315   | 81
        LARGE2          | 35        | 945       | 81
        allOnesLarge()  | 1         | 1         | 705082704
    }

    def static LARGE2 = [35,398,945,945,820,945,35,945,171,945,35,109,790,441,552]
    def static LARGE = [35_054,398_719,945_315,945_315,820_417,945_315,35_054,945_315,171_832,945_315,35_054,109_750,790_964,441_974,552_913]

    int[] allOnesLarge() {
        int[] n = new int[Math.pow(10, 5)]
        for (int i=0; i<n.length; i++) n[i] = 1
        return n
    }

}
