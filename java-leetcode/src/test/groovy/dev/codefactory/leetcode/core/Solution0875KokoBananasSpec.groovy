package dev.codefactory.leetcode.core

import spock.lang.Specification

class Solution0875KokoBananasSpec extends Specification {
    def solution = new Solution0875KokoBananas()

    def 'it should calculate the minimum time to eat the bananas'(int[] piles, int h, int expected) {

        when:
        def result = solution.minEatingSpeed(piles, h)

        then:
        result == expected

        where:
        piles               | h     | expected
        [3,6,7,11]          | 8     | 4
        [30,11,23,4,20]     | 5     | 30
        [30,11,23,4,20]     | 6     | 23
    }
}
