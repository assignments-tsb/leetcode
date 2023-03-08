package dev.codefactory.leetcode.core

import spock.lang.Specification

class Solution0058LengthOfLastWordSpec extends Specification {
    def solution = new Solution0058LengthOfLastWord()

    def 'it should count the length of the last word'(String s, int expected) {

        when:
        def result = solution.lengthOfLastWord(s)

        then:
        result == expected

        where:
        s                               | expected
        "Hello World"                   | 5
        "   fly me   to   the moon  "   | 4
        "luffy is still joyboy"         | 6
        "a"                             | 1
        " a"                            | 1
        "a "                            | 1
        " a "                           | 1
    }
}
