package dev.codefactory.leetcode.core

import spock.lang.Specification

class Solution0023NeedleInHaystackSpec extends Specification {

    def solution = new Solution0023NeedleInHaystack()

    def 'it should find the index of the first occurrence of the string'(String haystack, String needle, int expectedIndex) {

        when:
        def result = solution.strStr(haystack, needle)

        then:
        result == expectedIndex

        where:
        haystack    | needle    | expectedIndex
        "sadbutsad" | "sad"     | 0
        "sadbutsad" | "but"     | 3
        "sadbutsak" | "sak"     | 6
        "leetcode"  | "leeto"   | -1
        "leetcode"  | "eto"     | -1
    }
}
