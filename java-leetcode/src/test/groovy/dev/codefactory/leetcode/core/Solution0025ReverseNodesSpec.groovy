package dev.codefactory.leetcode.core

import dev.codefactory.leetcode.core.common.ListNode
import spock.lang.Specification

class Solution0025ReverseNodesSpec extends Specification {

    def solution = new Solution0025ReverseNodes()

    def 'it should reverse the nodes in threes'(int[] input, int k, int[] expected) {

        when:
        def result = solution.reverseKGroup(ListNode.from(input), k)

        then:
        result.toArray() == expected

        where:
        input       | k | expected
        [1,2,3,4,5] | 6 | [1,2,3,4,5]
        [1,2,3,4,5] | 2 | [2,1,4,3,5]
        [1,2,3,4,5] | 3 | [3,2,1,4,5]
        [1,2,3,4,5] | 4 | [4,3,2,1,5]
    }
}
