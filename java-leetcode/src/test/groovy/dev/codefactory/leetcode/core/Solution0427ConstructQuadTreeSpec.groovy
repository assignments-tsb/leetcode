package dev.codefactory.leetcode.core

import spock.lang.Specification

class Solution0427ConstructQuadTreeSpec extends Specification {

    def solution = new Solution0427ConstructQuadTree()

    def 'it should construct a new grid'() {

        given:
        int[][] grid = [
                [0,1],
                [1,0],
        ]

        and:
        int[][] expected = [
                [0,1],
                    [1,0],
                    [1,1],
                    [1,1],
                    [1,0],
        ]
        Node expectedAsNode = createNodes(expected)

        when:
        def result = solution.construct(grid)

        then:
        result == expectedAsNode
    }

    private Node createNodes(int[][] nodeList) {
        if (nodeList.length==0) return null

        def firstNode = new Node()
        for (int i=1; i<nodeList.length; i++) {

        }

        return firstNode
    }
}
