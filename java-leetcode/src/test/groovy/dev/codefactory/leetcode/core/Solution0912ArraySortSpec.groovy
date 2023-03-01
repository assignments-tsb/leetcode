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
        input                                                       | expectedOutput
        []                                                          | []
        [1]                                                         | [1]
        [1,3,2]                                                     | [1,2,3]
        [3,5,6,0,1]                                                 | [0,1,3,5,6]
        [Integer.MAX_VALUE, 1, 5, 7, -1, 0, Integer.MIN_VALUE]      | [Integer.MIN_VALUE, -1, 0, 1, 5, 7, Integer.MAX_VALUE]
    }

    def 'it should sort the array really fast'() {

        given: 'a large array'
        int[] largeArray = new int[50_000]
        largeArray[0] = Integer.MAX_VALUE
        largeArray[largeArray.length-1] = Integer.MIN_VALUE
        for (int i=1; i<largeArray.length-1; i++) {
            largeArray[i] = new Random().nextInt(500_000_000, Integer.MAX_VALUE)
        }

        when:
        def output = solution.sortArray(largeArray)

        then:
        output.length == 50_000
        output[0] == Integer.MIN_VALUE
        output[output.length-1] == Integer.MAX_VALUE
    }
}
