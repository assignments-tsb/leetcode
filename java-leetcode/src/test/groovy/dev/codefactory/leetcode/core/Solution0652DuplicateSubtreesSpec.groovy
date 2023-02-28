package dev.codefactory.leetcode.core

import spock.lang.Specification

class Solution0652DuplicateSubtreesSpec extends Specification {

    def solution = new Solution0652DuplicateSubtrees()

    def 'it should find a single node duplicate'() {

        given:
        def root = new TreeNode(2)
        root.left = new TreeNode(1)
        root.right = new TreeNode(1)

        when:
        def result = solution.findDuplicateSubtrees(root)

        then:
        result.size() == 1

        and:
        result.get(0).val == 1
    }
}
