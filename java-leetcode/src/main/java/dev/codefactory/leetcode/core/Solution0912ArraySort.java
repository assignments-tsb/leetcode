package dev.codefactory.leetcode.core;

public class Solution0912ArraySort {
    public int[] sortArray(int[] nums) {
        if (nums.length<=1) return nums;

        quicksort(nums,0, nums.length-1);

        return nums;
    }

    private int[] quicksort(int[] nums, int left, int right) {
        if (left >= right) return nums;

        int pivot = nums[left];
        int i = left+1;
        int j = right;

        while (i <= j) {
            if (nums[i] > pivot && nums[j] <= pivot) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            } else if (nums[i] <= pivot) {
                i++;
            } else if (nums[j] > pivot) {
                j--;
            }
        }

        int temp = nums[left];
        nums[left] = nums[j];
        nums[j] = temp;

        quicksort(nums, left, j-1);
        quicksort(nums, j+1, right);

        return nums;
    }
}
