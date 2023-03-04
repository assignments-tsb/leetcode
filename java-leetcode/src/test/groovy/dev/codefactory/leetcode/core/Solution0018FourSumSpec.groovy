package dev.codefactory.leetcode.core

import spock.lang.Specification

class Solution0018FourSumSpec extends Specification {

    def solution = new Solution0018FourSum()

    def 'it should return an array of unique quadruplet'(int[] nums, int target, List<List<Integer>> output) {

        when:
        def result = solution.fourSum(nums, target)

        then:
        equalsUnordered(output, result)

        where:
        nums                                            | target        | output
        [1,0,-1,0,-2,2]                                 | 0             | [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
        [2,2,2,2,2]                                     | 8             | [[2,2,2,2]]
        [1000000000,1000000000,1000000000,1000000000]   | -294967296    | []
    }

    private boolean equalsUnordered(List<List<Integer>> lists1, List<List<Integer>> lists2) {
        if (lists1.size() != lists2.size()) return false

        for (List<Integer> l1 : lists1) {
            boolean found = false
            for (List<Integer> l2 : lists2) {
                if (l1.containsAll(l2)) {
                    found = true
                }
            }
            if (!found) {
                return false
            }
        }
        return true
    }
}
