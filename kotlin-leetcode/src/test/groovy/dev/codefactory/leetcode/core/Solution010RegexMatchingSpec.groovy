package dev.codefactory.leetcode.core

import spock.lang.Specification

class Solution010RegexMatchingSpec extends Specification {

    def solution = new Solution010RegexMatching()

    def "it should return true if the regex pattern matches the string"() {

        given:
        def s = "ab"
        def p = ".*"

        when:
        def result = solution.isMatch(s, p)

        then:
        result
    }
}
