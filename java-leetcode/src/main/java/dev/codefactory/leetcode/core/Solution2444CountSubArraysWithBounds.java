package dev.codefactory.leetcode.core;

public class Solution2444CountSubArraysWithBounds {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long count = 0;

        for (int i=0; i<nums.length; i++) {
            for (int j=i; j<nums.length; j++) {
                if (nums[j]>=minK && nums[j]<=maxK) {
                    count++;
                } else {
                    break;
                }
            }
        }

        return count;
    }

}
