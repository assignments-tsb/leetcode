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
}
