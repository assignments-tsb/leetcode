package dev.codefactory.leetcode.core

import spock.lang.Specification

class Solution0011ContainerWithMostWaterSpec extends Specification {

    def solution = new Solution0011ContainerWithMostWater()

    def 'it should return the area of the largest container'() {

        given:
        int[] height = [1,8,6,2,5,4,8,3,7]

        when:
        def result = solution.maxArea(height)

        then:
        result == 49
    }
}
