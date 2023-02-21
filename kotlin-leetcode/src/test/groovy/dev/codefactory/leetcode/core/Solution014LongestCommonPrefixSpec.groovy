package dev.codefactory.leetcode.core

import spock.lang.Specification

class Solution014LongestCommonPrefixSpec extends Specification {

    def solution = new Solution014LongestCommonPrefix()

    def 'it should return the longest common prefix'(List<String> input, String expected) {

        when:
        def result = solution.longestCommonPrefix(input)

        then:
        result == expected

        where:
        input                       | expected
        ["flower","flow","flight"]  | "fl"
        ["dog","racecar","car"]     | ""
    }
}
