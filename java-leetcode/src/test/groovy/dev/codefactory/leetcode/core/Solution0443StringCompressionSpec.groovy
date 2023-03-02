package dev.codefactory.leetcode.core

import spock.lang.Specification

class Solution0443StringCompressionSpec extends Specification {

    def solution = new Solution0443StringCompression()

    def 'it should return the size of the compress string'(String input, int expectedOutput) {

        when:
        def result = solution.compress(input.toCharArray())

        then:
        result == expectedOutput

        where:
        input           | expectedOutput
        "aabbccc"       | 6
        "a"             | 1
        "abbbbbbbbbbbb" | 4
    }
}
