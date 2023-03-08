package dev.codefactory.leetcode.core

import dev.codefactory.leetcode.core.common.ListNode
import spock.lang.Specification

class Solution0083RemoveDuplicateNodesSpec extends Specification {
    def solution = new Solution0083RemoveDuplicateNodes()

    def 'it should remove duplicates'(int[] input, int[] expected) {

        when:
        def result = solution.deleteDuplicates(ListNode.from(input))

        then:
        result.toArray() == expected

        where:
        input           | expected
        [1,2,3]         | [1,2,3]
        [1,2,2,3]       | [1,2,3]
        [1,2,2,3,3]     | [1,2,3]
        [1,1,2,3,3]     | [1,2,3]
    }

}
