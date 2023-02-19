package dev.codefactory.leetcode.core

import spock.lang.Specification

class Solution032LongestValidParenthesisSpec extends Specification {

    def solution = new Solution032LongestValidParenthesis()

    def 'it should work for empty string'() {

        given:
        def s = ""

        when:
        def result = solution.longestValidParentheses(s)

        then:
        result == 0
    }

    def 'it should work for null string'() {

        given:
        def s = ""

        when:
        def result = solution.longestValidParentheses(s)

        then:
        result == 0
    }

    def 'it should calculate the total number of valid'(String s, Integer expectedCount) {

        when:
        def result = solution.longestValidParentheses(s)

        then:
        result == expectedCount

        where:
        s               | expectedCount
        "(()"           | 2
        "(())"          | 4
        ")()())"        | 4
    }
}
