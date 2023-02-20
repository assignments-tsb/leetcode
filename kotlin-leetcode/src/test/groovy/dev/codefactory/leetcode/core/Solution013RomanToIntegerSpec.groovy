package dev.codefactory.leetcode.core

import spock.lang.Specification

class Solution013RomanToIntegerSpec extends Specification {

    def solution = new Solution013RomanToInteger()

    def 'it should solve single digit numbers'(String roman, Integer expected) {

        when:
        def result = solution.romanToInt(roman)

        then:
        result == expected

        where:
        roman   | expected
        "I"     | 1
        "V"     | 5
        "X"     | 10
        "L"     | 50
        "C"     | 100
        "D"     | 500
        "M"     | 1000
    }

    def 'it should solve addition of digits'(String roman, Integer expected) {

        when:
        def result = solution.romanToInt(roman)

        then:
        result == expected

        where:
        roman   | expected
        "III"   | 3
        "XXX"   | 30
        "CCC"   | 300
        "MMM"   | 3000
    }

    def 'it should solve subtraction of digits'(String roman, Integer expected) {

        when:
        def result = solution.romanToInt(roman)

        then:
        result == expected

        where:
        roman       | expected
        "IX"        | 9
        "IV"        | 4
        "LM"        | 950
        "CMXCIX"    | 999
        "MMMCMXCIX" | 3999
    }
}
