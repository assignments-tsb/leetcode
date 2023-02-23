package dev.codefactory.leetcode.core

import spock.lang.Specification

class Solution0006ZigZagConversionSpec extends Specification {

    def solution = new Solution0006ZigZagConversion()

    def 'it should return a single character string'() {

        given:
        def input = "P"

        when:
        def result = solution.convert(input, 100)

        then:
        result == input
    }

    def 'it should convert flat string to zigzag'() {

        given:
        def input = "PAYPALISHIRING"
        def rows = 3

        and:
        def expected = """
            P   A   H   N
            A P L S I I G
            Y   I   R
        """.replace(" ", "")
                .replace("\n", "")

        when:
        def result = solution.convert(input, rows)

        then:
        result == expected
    }
}
