package dev.codefactory.leetcode.core;

import java.util.Arrays;

public class Solution0016ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int closest = Integer.MAX_VALUE;

        for (int i=0; i<nums.length-2; i++) {

            int left = i+1;
            int right = nums.length-1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (Math.abs(sum-target) < Math.abs(closest-target)) {
                    closest = sum;
                }

                left++;
                right--;
            }

        }

        return closest;
    }
}
