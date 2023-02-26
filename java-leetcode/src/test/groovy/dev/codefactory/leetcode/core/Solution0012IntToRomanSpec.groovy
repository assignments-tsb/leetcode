package dev.codefactory.leetcode.core

import spock.lang.Specification

class Solution0012IntToRomanSpec extends Specification {

    def solution = new Solution0012IntToRoman()

    def 'it should convert in to romain for single digits'(Integer input, String expected) {

        when:
        def result = solution.intToRoman(input)

        then:
        result == expected

        where:
        expected    | input
        "I"         | 1
        "V"         | 5
        "X"         | 10
        "L"         | 50
        "C"         | 100
        "D"         | 500
        "M"         | 1000
    }


    def 'it should convert in to romain for multiple digits'(Integer input, String expected) {

        when:
        def result = solution.intToRoman(input)

        then:
        result == expected

        where:
        expected    | input
        "III"       | 3
        "XXX"       | 30
        "CCC"       | 300
        "MMM"       | 3000
    }
}
