package dev.codefactory.leetcode.core

import spock.lang.Specification

class Solution0912ArraySortSpec extends Specification {

    def solution = new Solution0912ArraySort()

    def 'it should sort the array'(int[] input, int[] expectedOutput) {

        when:
        def actualOutput = solution.sortArray(input)

        then:
        actualOutput == expectedOutput

        where:
        input           | expectedOutput
        []              | []
        [1]             | [1]
        [1,3,2]         | [1,2,3]
        [3,5,6,0,1]     | [0,1,3,5,6]
    }
}
