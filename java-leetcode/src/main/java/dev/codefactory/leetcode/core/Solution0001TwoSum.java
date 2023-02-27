package dev.codefactory.leetcode.core;

import java.util.HashMap;

public class Solution0001TwoSum {
    public int[] twoSum(int[] nums, int target) {
        var itemMap = new HashMap<Integer, Integer>();

        for(int i=0; i<nums.length; i++) {
            var pair = target-nums[i];
            if (itemMap.containsKey(pair)) {
                return new int[]{itemMap.get(pair), i};
            }

            itemMap.put(nums[i], i);
        }

        return new int[]{-1};
    }
}
