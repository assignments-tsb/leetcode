package dev.codefactory.leetcode.core

import spock.lang.Specification

class Solution0041FirstMissingPositiveSpec extends Specification {

    def solution = new Solution0041FirstMissingPositive()

    def 'it should solve example 1'() {

        given:
        int[] nums = [1, 2, 0]

        expect:
        solution.firstMissingPositive(nums) == 3
    }

    def 'it should solve example 2'() {

        given:
        int[] nums = [3, 4, -1, 1]

        expect:
        solution.firstMissingPositive(nums) == 2
    }

    def 'it should solve example 3'() {

        given:
        int[] nums = [7,8,9,11,12]

        expect:
        solution.firstMissingPositive(nums) == 1
    }
}
