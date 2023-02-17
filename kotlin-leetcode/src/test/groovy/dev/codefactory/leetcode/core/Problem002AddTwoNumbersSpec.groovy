package dev.codefactory.leetcode.core

import spock.lang.Specification

class Problem002AddTwoNumbersSpec extends Specification {

    def solution = new Problem002AddTwoNumbers()

    def 'it adds single digits'() {

        given: "two positive integers"
        def l1 = new ListNode(1)
        def l2 = new ListNode(2)

        when:
        def result = solution.addTwoNumbers(l1, l2)

        then:
        result.val == 3
    }
}
