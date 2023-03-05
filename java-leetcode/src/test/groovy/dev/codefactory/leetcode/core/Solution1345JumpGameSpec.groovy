package dev.codefactory.leetcode.core

import spock.lang.Specification

class Solution1345JumpGameSpec extends Specification {

    def solution = new Solution1345JumpGame()

    def 'it should calculate the minimum number of jumps to reach the last index'(int[] arr, int expected) {

        when:
        def result = solution.minJumps(arr)

        then:
        result == expected

        where:
        arr | expected
        [100,-23,-23,404,100,23,23,23,3,404]    | 3
        [7]                                     | 0
        [7,6,9,6,9,6,9,7]                       | 1
        [1,0,0,0,0,2,1,2]                       | 2
        [1,0,0,0,0,2,3,2]                       | 4
    }
}
