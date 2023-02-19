package dev.codefactory.leetcode.core

import spock.lang.Specification
import static dev.codefactory.leetcode.core.shared.ListNodeUtil.*

class Solution023MergeKSortedListSpec extends Specification {

    def solution = new Solution023MergeKSortedList()

    def "it should merge multiple sorted list into one"() {

        given:
        def lists = [
                createNode(1,4,5),
                createNode(1,3,4),
                createNode(2,6)
        ]
        def expectedList = createNode(1,1,2,3,4,4,5,6)

        when:
        def result = solution.mergeKLists(lists)

        then:
        result == expectedList
    }

    def "it should work on an empty list"() {

        given:
        def emptyList = createNode()

        when:
        def result = solution.mergeKLists([emptyList])

        then:
        result == null
    }

    def "it should work on multiple empty list"() {

        given:
        def emptyList = createNode()

        when:
        def result = solution.mergeKLists([emptyList, emptyList])

        then:
        result == null
    }
}
