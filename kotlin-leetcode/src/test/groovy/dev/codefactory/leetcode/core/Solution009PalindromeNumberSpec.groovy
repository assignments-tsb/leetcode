package dev.codefactory.leetcode.core

import spock.lang.Specification

class Solution009PalindromeNumberSpec extends Specification {

    def solution = new Solution009PalindromeNumber()

    def 'it should return false for negative numbers'() {

        given:
        def n = -101

        when:
        def result = solution.isPalindrome(n)

        then:
        !result
    }

    def 'it should return true for palindrome numbers'(Integer n) {

        when:
        def result = solution.isPalindrome(n)

        then:
        result

        where:
        n       | _
        1       | _
        11      | _
        12121   | _
        1221    | _
    }

    def 'it should return false for non-palindrome numbers'(Integer n) {

        when:
        def result = solution.isPalindrome(n)

        then:
        !result

        where:
        n       | _
        10      | _
        112     | _
    }
}
