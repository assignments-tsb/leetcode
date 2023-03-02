package dev.codefactory.leetcode.core

import spock.lang.Specification

class Solution0033SearchInRotatedArraySpec extends Specification {

    def solution = new Solution0033SearchInRotatedArray()

    def 'it should find the index of the target within a sorted array'(int[] nums, int target, int expectedIndex) {

        when:
        def result = solution.search(nums, target)

        then:
        result == expectedIndex

        where:
        nums                    | target    | expectedIndex
        [4,5,6,7,0,1,2]         | 0         | 4
        [4,5,6,7,0,1,2]         | 3         | -1
        [-1]                    | 0         | -1
    }
}
