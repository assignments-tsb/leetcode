package dev.codefactory.leetcode.core

import spock.lang.Specification

class Solution015ThreeSumSpec extends Specification {

    def solution = new Solution015ThreeSum()

    def 'it should find all possible answers when possible'() {

        given:
        def nums = [-1,0,1,2,-1,-4]
        def expectedResult = [[-1,-1,2],[-1,0,1]]

        when:
        def result = solution.threeSum(nums)

        then:
        result == expectedResult
    }

    def 'it should return empty when not possible'() {

        given:
        def nums = [0,1,1]
        def expectedResult = []

        when:
        def result = solution.threeSum(nums)

        then:
        result == expectedResult
    }

    def 'it should return work with zero'() {

        given:
        def nums = [0,0,0]
        def expectedResult = [[0, 0, 0]]

        when:
        def result = solution.threeSum(nums)

        then:
        result == expectedResult
    }
}
