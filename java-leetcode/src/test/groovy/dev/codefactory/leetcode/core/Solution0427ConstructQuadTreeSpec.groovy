package dev.codefactory.leetcode.core

import spock.lang.Specification

class Solution0427ConstructQuadTreeSpec extends Specification {

    def solution = new Solution0427ConstructQuadTree()

    def 'it should construct a new quad-tree from a simple 2x2 grid'() {

        given:
        int[][] grid = [
                [0,1],
                [1,0],
        ]

        and:
        Node expectedAsNode = new Node(false, false)
        expectedAsNode.topLeft = new Node(false, true)
        expectedAsNode.topRight = new Node(true, true)
        expectedAsNode.bottomLeft = new Node(true, true)
        expectedAsNode.bottomRight = new Node(false, true)

        when:
        def result = solution.construct(grid)

        then:
        result == expectedAsNode
    }

}
