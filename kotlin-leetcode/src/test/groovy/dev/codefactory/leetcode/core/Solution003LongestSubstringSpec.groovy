package dev.codefactory.leetcode.core

import spock.lang.Specification

class Solution003LongestSubstringSpec extends Specification {

    def solution = new Solution003LongestSubstring()

    def 'it should return the maximum length of non-repetitive string'(String input, Integer longest) {

        when:
        def count = solution.lengthOfLongestSubstring(input)

        then:
        count == longest

        where:
        input                       | longest
        ""                          | 0
        "abcabcbb"                  | 3
        "bbbbb"                     | 1
        "pwwkew"                    | 3
        "rpdivsinokxnkctsfukinavkn" | 10
        "kmzmtyyfgqzzrsadztlfuhfmo" | 10

    }
}
