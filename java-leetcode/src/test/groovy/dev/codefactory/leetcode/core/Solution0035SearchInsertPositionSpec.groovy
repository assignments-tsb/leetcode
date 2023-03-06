package dev.codefactory.leetcode.core

import spock.lang.Specification

class Solution0035SearchInsertPositionSpec extends Specification {
    def solution = new Solution0035SearchInsertPosition()

    def 'it should find the proper insertion index'(int[] nums, int target, int answer) {

        when:
        def result = solution.searchInsert(nums, target)

        then:
        result == answer

        where:
        nums        | target | answer
        [1,3,5,6]   | 5      | 2
        [1,3,5,6]   | 2      | 1
        [1,3,5,6]   | 7      | 4
    }
}
