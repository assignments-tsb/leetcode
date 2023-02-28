package dev.codefactory.leetcode.core;

import java.util.*;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Solution0652DuplicateSubtrees {

    private static final String DELIMITER = "-";
    private static final String NULL_NODE = "X";

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> duplicates = new LinkedList<>();

        stringifyAndCount(root, new HashMap<>(), duplicates);

        return duplicates;
    }

    private String stringifyAndCount(TreeNode node, Map<String, Integer> count, List<TreeNode> duplicates) {
        if (node==null) return NULL_NODE;

        String key = node.val + DELIMITER + stringifyAndCount(node.left, count, duplicates) + stringifyAndCount(node.right, count, duplicates);
        count.put(key, count.getOrDefault(key, 0) + 1);
        if (count.get(key) == 2) {
            duplicates.add(node);
        }

        return key;
    }
}

 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
 }
