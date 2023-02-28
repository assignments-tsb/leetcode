package dev.codefactory.leetcode.core

import spock.lang.Specification

class Solution0098ValidBinarySearchTreeSpec extends Specification {

    def solution = new Solution0098ValidBinarySearchTree()

    def 'it should return true if the tree is sorted properly'() {

        given:
        def sortedTree = new TreeNode(2)
        sortedTree.left = new TreeNode(1)
        sortedTree.right = new TreeNode(3)

        expect:
        solution.isValidBST(sortedTree)
    }

    def 'it should return false if the tree is not sorted properly'() {

        given:
        def sortedTree = new TreeNode(2)
        sortedTree.left = new TreeNode(3)
        sortedTree.right = new TreeNode(1)

        expect:
        !solution.isValidBST(sortedTree)
    }

    def 'it should return false if the tree is of the same value'() {

        given:
        def sortedTree = new TreeNode(2)
        sortedTree.left = new TreeNode(2)
        sortedTree.right = new TreeNode(2)

        expect:
        !solution.isValidBST(sortedTree)
    }

    def 'it should return false if the right node is less than the current node'() {

        given: 'right node is less than'
        def sortedTree = new TreeNode(5)
        sortedTree.left = new TreeNode(1)
        sortedTree.right = new TreeNode(4)
        sortedTree.right.left = new TreeNode(3)
        sortedTree.right.right = new TreeNode(6)

        expect:
        !solution.isValidBST(sortedTree)
    }

    def 'it should return false if the right node is less than the current node'() {

        given: 'right node is less than'
        def sortedTree = new TreeNode(5)
        sortedTree.left = new TreeNode(4)
        sortedTree.right = new TreeNode(6)
        sortedTree.right.left = new TreeNode(3)
        sortedTree.right.right = new TreeNode(7)

        expect:
        !solution.isValidBST(sortedTree)
    }

    def 'it should return true for single value when node is max'() {

        given:
        def sortedTree = new TreeNode(Integer.MAX_VALUE)

        expect:
        solution.isValidBST(sortedTree)
    }

    def 'it should return true for single value when node is min'() {

        given:
        def sortedTree = new TreeNode(Integer.MAX_VALUE)

        expect:
        solution.isValidBST(sortedTree)
    }
}
