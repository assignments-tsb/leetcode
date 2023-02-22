package dev.codefactory.leetcode.core

import spock.lang.Specification

class Solution0015ThreeSumSpec extends Specification {

    def solution = new Solution0015ThreeSum()

    def 'it should return the list of index of possible numbers that sum up to zero'() {

        given:
        int[] nums = [-1,0,1,2,-1,-4]
        List<List<Integer>> expectedResult = [[-1,-1,2],[-1,0,1]]

        when:
        def result = solution.threeSum(nums)

        then:
        result == expectedResult
    }
}
