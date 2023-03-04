package dev.codefactory.leetcode.core;

public class Solution2444CountSubArraysWithBounds {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        if (minK==maxK) return countSubarrays(nums, minK);

        int count = 0;

        for (int i=0; i<nums.length; i++) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for (int j=i; j<nums.length; j++) {
                if (nums[j] > max) max = nums[j];
                if (nums[j] < min) min = nums[j];

                if (min==minK && max==maxK) {
                    count++;
                }

                if (max > maxK || min < minK) break;
            }
        }

        return count;
    }

    private long countSubarrays(int num[], int minMax) {
        return factorial(num.length+1);
    }

    private long factorial(long n) {
        long sum = 0;
        for (int i=1; i<n; i++) sum+=i;
        return sum;
    }

}
