package dev.codefactory.leetcode.core;

public class Solution0912ArraySort {
    public int[] sortArray(int[] nums) {
        if (nums.length<=1) return nums;

        mergeSort(nums,0, nums.length-1);

        return nums;
    }

    private void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    private void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[m + 1 + j];
        }
        int i = 0;
        int j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    @Deprecated
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
