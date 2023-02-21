package dev.codefactory.leetcode.core

import spock.lang.Specification

class Solution007ReverseIntSpec extends Specification {

    def solution = new Solution007ReverseInt()

    def 'it should reverse the integer'(Integer input, Integer expected) {

        when:
        def result = solution.reverse(input)

        then:
        result == expected

        where:
        input   | expected
        123     | 321
        -123    | -321
        120     | 21
    }


    def 'it should return zero for buffer overflow'(Integer input) {

        when:
        def result = solution.reverse(input)

        then:
        result == 0

        where:
        input           | _
        1534236469      | _
        -2147483648     | _
    }
}
