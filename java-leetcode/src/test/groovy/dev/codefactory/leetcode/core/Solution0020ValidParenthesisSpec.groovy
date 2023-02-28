package dev.codefactory.leetcode.core

import spock.lang.Specification

class Solution0020ValidParenthesisSpec extends Specification {

    def solution = new Solution0020ValidParenthesis()

    def 'it should return true for valid brackets'() {

        given:
        def s = "()"

        expect:
        solution.isValid(s)
    }

    def 'it should return true for valid multiple brackets'() {

        given:
        def s = "()[]{}"

        expect:
        solution.isValid(s)
    }

    def 'it should return false for invalid brackets'() {

        given:
        def s = "(]"

        expect:
        !solution.isValid(s)
    }
}
