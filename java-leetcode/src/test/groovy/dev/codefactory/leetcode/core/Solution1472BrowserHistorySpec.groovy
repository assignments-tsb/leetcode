package dev.codefactory.leetcode.core

import spock.lang.Specification

class Solution1472BrowserHistorySpec extends Specification {

    def solution = new Solution1472BrowserHistory()

    def 'it should provide a solution'() {

        given:
        ArrayList<String> input = ["BrowserHistory","visit","visit","visit","back","back","forward","visit","forward","back","back"]

        and:
        ArrayList<ArrayList<Object>> parameters = [["leetcode.com"],["google.com"],["facebook.com"],["youtube.com"],[1],[1],[1],["linkedin.com"],[2],[2],[7]]

        when:
        def result = solution.execute(input, parameters)

        then:
        result == [null,null,null,null,"facebook.com","google.com","facebook.com",null,"linkedin.com","google.com","leetcode.com"]
    }
}
