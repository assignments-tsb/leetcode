package dev.codefactory.leetcode.core;

public class Solution0098ValidBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        return isValid(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isValid(TreeNode node, Integer lowerBound, Integer upperBound) {
        if (node==null) return true;
        if (node.val <= lowerBound || node.val >= upperBound) return false;

        return isValid(node.left, lowerBound, node.val) && isValid(node.right, node.val, upperBound);
    }
}
