package dev.codefactory.leetcode.core;

public class Solution0035SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length-1;
        int left = 0;
        int right = n;
        int mid = n/2;

        while (left <= right) {
            if (nums[mid]==target) return mid;

            mid = (left + right) / 2;

            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}
