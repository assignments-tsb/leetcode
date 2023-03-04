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

    private long countSubarrays(int[] num, int k) {
        long count = 0;

        int left = 0;
        int i = 0;
        while (i<num.length) {
            if (num[i]!=k) {
                count += factorial(i-left+1);
                left = i+1;
            }
            if (i==num.length-1) {
                count += factorial(i-left+2);
            }
            i++;
        }

        return count;
    }

    private long factorial(long n) {
        long sum = 0;
        for (int i=1; i<n; i++) sum+=i;
        return sum;
    }

}
