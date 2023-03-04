package dev.codefactory.leetcode.core;

public class Solution2444CountSubArraysWithBounds {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int count = 0;

        for (int i=0; i<nums.length; i++) {
            int min = nums[i];
            int max = nums[i];
            for (int j=i; j<nums.length; j++) {
                if (nums[j] > max) max = nums[j];
                if (nums[j] < min) max = nums[j];

                if (min==minK && max==maxK) {
                    count++;
                }
            }
        }

        return count;
    }

}
