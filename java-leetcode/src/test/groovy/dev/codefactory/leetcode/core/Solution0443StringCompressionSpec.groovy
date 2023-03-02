package dev.codefactory.leetcode.core

import spock.lang.Specification

class Solution0443StringCompressionSpec extends Specification {

    def solution = new Solution0443StringCompression()

    def 'it should return the size of the compress string'(String input, int expectedOutput, String expectedArray) {

        given:
        char[] inputArray = input.toCharArray()

        when:
        def result = solution.compress(inputArray)

        then:
        result == expectedOutput

        and:
        inputArray.join().startsWith(expectedArray)

        where:
        input           | expectedOutput | expectedArray
        "aabbccc"       | 6              | "a2b2c3"
        "a"             | 1              | "a"
        "abbbbbbbbbbbb" | 4              | "ab12"
    }
}
