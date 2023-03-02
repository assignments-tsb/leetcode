package dev.codefactory.leetcode.core

import spock.lang.Specification

class Solution0016ThreeSumClosestSpec extends Specification {

    def solution = new Solution0016ThreeSumClosest()

    def 'it should solve for the closest value to the target for 3 index'(int[] nums, int target, int closest) {

        when:
        def result = solution.threeSumClosest(nums, target)

        then:
        result == closest

        where:
        nums            | target    | closest
        [-1,2,1,-4]     | 1         | 2
        [0,0,0]         | 1         | 0
    }
}
