package dev.codefactory.leetcode.core

import spock.lang.Specification

class Solution008StringToIntSpec extends Specification {

    def solution = new Solution008StringToInt()

    def 'it should convert a negative integer'(String input, Integer expected) {

        when:
        def result = solution.myAtoi(input)

        then:
        result == expected

        where:
        input       | expected
        "-123"      | -123
        "-1"        | -1
    }

    def 'it should convert a positive integer'(String input, Integer expected) {

        when:
        def result = solution.myAtoi(input)

        then:
        result == expected

        where:
        input       | expected
        "+123"      | 123
        "123"       | 123
        "42"        | 42
        "1"         | 1
        "1111111"   | 1111111
    }

    def 'it should strip trailing zeroes'(String input, Integer expected) {

        when:
        def result = solution.myAtoi(input)

        then:
        result == expected

        where:
        input           | expected
        "+0123"         | 123
        "0123"          | 123
        "0001"          | 1
    }

    def 'it should ignore none digits'(String input, Integer expected) {

        when:
        def result = solution.myAtoi(input)

        then:
        result == expected

        where:
        input               | expected
        "4193 with words"   | 4193
        "     -42"          | -42
        "      42"          | 42
        "   42   "          | 42
    }

}
