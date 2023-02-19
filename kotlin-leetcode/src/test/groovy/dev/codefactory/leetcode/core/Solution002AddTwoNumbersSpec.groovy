package dev.codefactory.leetcode.core

import dev.codefactory.leetcode.core.shared.ListNode
import spock.lang.Specification
import static dev.codefactory.leetcode.core.shared.ListNodeUtil.*

class Solution002AddTwoNumbersSpec extends Specification {

    def solution = new Solution002AddTwoNumbers()

    def 'it should adds single digits'() {

        given: "two positive integers"
        def l1 = new ListNode(1)
        def l2 = new ListNode(2)

        when:
        def result = solution.addTwoNumbers(l1, l2)

        then:
        result.val == 3
    }

    def 'it should add multiple digits with the same length'() {

        given:
        def l1 = createNode(2, 4, 3)
        def l2 = createNode(5, 1, 4)
        def expectedResult = createNode(7, 5, 7)

        when:
        def result = solution.addTwoNumbers(l1, l2)

        then:
        result == expectedResult
    }

    def 'it should add multiple digits with the carry over'() {

        given:
        def l1 = createNode(5)
        def l2 = createNode(5)
        def expectedResult = createNode(0, 1)

        when:
        def result = solution.addTwoNumbers(l1, l2)

        then:
        result == expectedResult
    }

    def 'it should add multiple digits with different length'() {

        given:
        def l1 = createNode(9,9,9,9,9,9,9)
        def l2 = createNode(9,9,9,9)
        def expectedResult = createNode(8,9,9,9,0,0,0,1)

        when:
        def result = solution.addTwoNumbers(l1, l2)

        then:
        result == expectedResult
    }

    def 'it should be equals'() {

        given:
        def l1 = createNode(1)
        def l2 = createNode(1)

        expect:
        l1 == l2
    }

    def 'it should not be equals'() {

        given:
        def l1 = createNode(1)
        def l2 = createNode(2)

        expect:
        l1 != l2
    }

    def 'it should be equals with multiple nodes'() {

        given:
        def l1 = createNode(1, 2)
        def l2 = createNode(1, 2)

        expect:
        l1 == l2
    }

    def 'it should be equals with multiple nodes x more'() {

        given:
        def l1 = createNode(8,9,9,9,0,0,0,1)
        def l2 = createNode(8,9,9,9,0,0,0,1)

        expect:
        l1 == l2
    }

    def 'it should be not equals with multiple nodes'() {

        given:
        def l1 = createNode(1, 2)
        def l2 = createNode(1, 3)

        expect:
        l1 != l2
    }

    def 'it should not be equals with multiple nodes x more'() {

        given:
        def l1 = createNode(8,9,9,9,0,0,0,1)
        def l2 = createNode(8,9,9,9,0,0,0,0)

        expect:
        l1 != l2
    }

    def 'it should not be equals when length is different'() {

        given:
        def l1 = createNode(1, 2, 3)
        def l2 = createNode(1, 2)

        expect:
        l1 != l2
    }

}
