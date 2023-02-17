package dev.codefactory.leetcode.core

import spock.lang.Specification

class Problem002AddTwoNumbersSpec extends Specification {

    def solution = new Problem002AddTwoNumbers()

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
        def l1 = createNode(2, 4, 3)
        def l2 = createNode(5, 6, 4)
        def expectedResult = createNode(7, 0, 8)

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

    def 'it should be equals'() {

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

    def 'it should be not equals with multiple nodes'() {

        given:
        def l1 = createNode(1, 2)
        def l2 = createNode(1, 3)

        expect:
        l1 != l2
    }

    private ListNode createNode(Integer[] numbers) {
        if (numbers.length == 0) return null
        if (numbers.length == 1) return new ListNode(numbers[0])
        def node = new ListNode(numbers[0])
        node.next = createNode(numbers.drop(1))
        return node
    }
}
