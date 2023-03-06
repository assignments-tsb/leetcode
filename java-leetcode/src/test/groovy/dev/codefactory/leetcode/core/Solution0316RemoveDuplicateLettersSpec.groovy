package dev.codefactory.leetcode.core

import spock.lang.Specification

class Solution0316RemoveDuplicateLettersSpec extends Specification {

    def solution = new Solution0316RemoveDuplicateLetters()

    def 'it should retain only the unique letters'(String s, String expectedResult) {

        when:
        def result = solution.removeDuplicateLetters(s)

        then:
        result == expectedResult

        where:
        s           | expectedResult
        "bcabc"     | "abc"
        "cbacdcbc"  | "acdb"
        "e"         | "e"

    }
}
