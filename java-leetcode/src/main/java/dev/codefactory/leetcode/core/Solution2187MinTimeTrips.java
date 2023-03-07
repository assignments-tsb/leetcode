package dev.codefactory.leetcode.core;

public class Solution2187MinTimeTrips {
    public long minimumTime(int[] time, int totalTrips) {
        long left = 0;
        long right = Integer.MAX_VALUE;

        while (left < right) {
            long mid = (left + right) / 2;
            long trips = 0;

            for (int j : time) {
                trips += mid / j;
            }

            if (trips >= totalTrips) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}
