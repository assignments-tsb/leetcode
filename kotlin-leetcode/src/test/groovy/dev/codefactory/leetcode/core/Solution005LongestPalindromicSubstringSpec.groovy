package dev.codefactory.leetcode.core

import spock.lang.Specification

class Solution005LongestPalindromicSubstringSpec extends Specification {

    def solution = new Solution005LongestPalindromicSubstring()

    def 'it should return the longest palindrome'(String input, String expected) {

        when:
        def result = solution.longestPalindrome(input)

        then:
        result == expected

        where:
        input               | expected
        "a"                 | "a"
        "abba"              | "abba"
        "abbac"             | "abba"
        "zabba"             | "abba"
        "zxcvbabbcbbat"     | "abbcbba"
    }
}
