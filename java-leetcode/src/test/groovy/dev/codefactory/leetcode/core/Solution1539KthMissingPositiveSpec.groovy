package dev.codefactory.leetcode.core

import spock.lang.Specification

class Solution1539KthMissingPositiveSpec extends Specification {

    def solution = new Solution1539KthMissingPositive()

    def 'it should find the kth missing integer from the sorted array'(int[] arr, int k, int missing) {

        when:
        def result = solution.findKthPositive(arr, k)

        then:
        result == missing

        where:
        arr             | k     | missing
        [2,3,4,7,11]    | 5     | 9
        [1,2,3,4]       | 2     | 6
        [1,2,3,4,5]     | 5     | 10
        [2]             | 1     | 1
        [2]             | 2     | 3
        [2]             | 3     | 4
        [100]           | 1     | 1
        [100]           | 50    | 50
        [100]           | 150   | 151
    }
}
