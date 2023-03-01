package dev.codefactory.leetcode.core;

public class Solution0912ArraySort {
    public int[] sortArray(int[] nums) {
        if (nums.length<=1) return nums;

        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                if (nums[j]<nums[i]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        return nums;
    }
}
