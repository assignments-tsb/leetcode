package dev.codefactory.leetcode.core;

public class Solution0875KokoBananas {
    public int minEatingSpeed(int[] piles, int h) {
        // Find the maximum number of bananas in a pile
        int maxPile = Integer.MIN_VALUE;
        for (int pile : piles) {
            maxPile = Math.max(maxPile, pile);
        }

        // Binary search for the minimum possible eating speed
        int left = 1;
        int right = maxPile;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canFinish(piles, h, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean canFinish(int[] piles, int h, int k) {
        int hours = 0;
        for (int pile : piles) {
            hours += (pile + k - 1) / k;
        }
        return hours <= h;
    }
}
