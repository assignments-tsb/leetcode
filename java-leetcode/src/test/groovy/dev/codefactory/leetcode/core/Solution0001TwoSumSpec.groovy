package dev.codefactory.leetcode.core

import spock.lang.Specification

class Solution0001TwoSumSpec extends Specification {

    def solution = new Solution0001TwoSum()

    def 'it should return the index of two numbers whose sum is the target'() {

        given:
        int[] nums = [2,7,11,15]
        def target = 9
        int[] expectedResult = [0,1]

        when:
        def result = solution.twoSum(nums, target)

        then:
        result == expectedResult
    }
}
