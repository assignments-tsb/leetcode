package dev.codefactory.leetcode.core

import spock.lang.Specification

class Solution0049GroupAnagramsSpec extends Specification {

    def solution = new Solution0049GroupAnagrams()

    def 'it should group anagrams together'(String[] input, List<List<String>> expectedOutput) {

        when:
        def result = solution.groupAnagrams(input)

        then:
        result.containsAll(expectedOutput)
        expectedOutput.containsAll(result)

        where:
        input                                   | expectedOutput
        ["eat","tea","tan","ate","nat","bat"]   | [["bat"],["nat","tan"],["ate","eat","tea"]]
        [""]                                    | [[""]]
        ["a"]                                   | [["a"]]
    }
}
