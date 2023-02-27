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

    def 'it should construct a new quad-tree from a complex 8x8 grid'() {

        given:
        int[][] grid = [
                [1,1,1,1,0,0,0,0],
                [1,1,1,1,0,0,0,0],
                [1,1,1,1,1,1,1,1],
                [1,1,1,1,1,1,1,1],
                [1,1,1,1,0,0,0,0],
                [1,1,1,1,0,0,0,0],
                [1,1,1,1,0,0,0,0],
                [1,1,1,1,0,0,0,0],
        ]

        and:
        Node expectedAsNode = new Node(false, false)
        expectedAsNode.topLeft = new Node(true, true)
        expectedAsNode.topRight = new Node(true, false)
        expectedAsNode.bottomLeft = new Node(true, true)
        expectedAsNode.bottomRight = new Node(false, true)

        expectedAsNode.topRight.topLeft = new Node(false, true)
        expectedAsNode.topRight.topRight = new Node(false, true)
        expectedAsNode.topRight.bottomLeft = new Node(true, true)
        expectedAsNode.topRight.bottomRight = new Node(true, true)

        when:
        def result = solution.construct(grid)

        then:
        result == expectedAsNode
    }

}
