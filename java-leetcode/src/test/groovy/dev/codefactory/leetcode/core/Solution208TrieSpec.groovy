package dev.codefactory.leetcode.core

import spock.lang.Specification

class Solution208TrieSpec extends Specification {

    def solution = new Solution208Trie()

    def "it should process stuffs"() {

        given:
        ArrayList<String> commands = ["Trie", "insert", "search", "search", "startsWith", "insert", "search"]
        ArrayList<String> params = ["", "apple", "apple", "app", "app", "app", "app"]

        when:
        def result = solution.run(commands, params)

        then:
        result == [null, null, true, false, true, null, true]
    }
}
