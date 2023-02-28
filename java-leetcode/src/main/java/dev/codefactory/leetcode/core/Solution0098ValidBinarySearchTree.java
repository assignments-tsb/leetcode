package dev.codefactory.leetcode.core;

public class Solution0098ValidBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isValid(TreeNode node, Long lowerBound, Long upperBound) {
        if (node==null) return true;
        if (node.val <= lowerBound || node.val >= upperBound) return false;

        return isValid(node.left, lowerBound, ((Integer) node.val).longValue()) && isValid(node.right, ((Integer) node.val).longValue(), upperBound);
    }
}
