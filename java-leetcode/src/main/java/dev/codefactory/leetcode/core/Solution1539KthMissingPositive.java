package dev.codefactory.leetcode.core;

public class Solution1539KthMissingPositive {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        int missingBefore = arr[0] - 1;

        if (missingBefore >= k) return k;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int missing = arr[mid] - mid - 1;

            if (missing < k) {
                left = mid + 1;
                missingBefore = arr[mid];
            } else {
                right = mid - 1;
            }
        }

        return missingBefore + k - (arr[left - 1] - (left - 1) - 1);
    }
}
