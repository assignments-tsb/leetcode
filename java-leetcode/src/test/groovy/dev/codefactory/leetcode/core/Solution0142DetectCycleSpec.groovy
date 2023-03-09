package dev.codefactory.leetcode.core

import dev.codefactory.leetcode.core.common.ListNode
import spock.lang.Specification

class Solution0142DetectCycleSpec extends Specification {
    def solution = new Solution0142DetectCycle()

    def 'it should detect the node that connects to the tail'(int[] head, int[] expected) {

        when:
        def result = solution.detectCycle(ListNode.from(head))

        then:
        result.toArray() == expected

        where:
        head        | expected
        [3,2,0,-4]  | [2,0,-4]
        [1,2]       | [1,2]
    }

    def 'it should return null where theres no cycle'() {

        given:
        def head = ListNode.from((int[]) [1])

        when:
        def result = solution.detectCycle(head)

        then:
        result == null
    }
}
