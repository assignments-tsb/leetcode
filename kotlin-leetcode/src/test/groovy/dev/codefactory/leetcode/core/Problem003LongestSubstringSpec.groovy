package dev.codefactory.leetcode.core

import spock.lang.Specification

class Problem003LongestSubstringSpec extends Specification {

    def solution = new Problem003LongestSubstring()

    def 'it should return 1 when all characters are the same'() {

        given:
        def input = "bbbbbbb"

        when:
        def count = solution.lengthOfLongestSubstring(input)

        then:
        count == 1
    }
}
