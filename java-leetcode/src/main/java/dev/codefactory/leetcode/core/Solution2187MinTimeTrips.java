package dev.codefactory.leetcode.core;

public class Solution2187MinTimeTrips {
    public long minimumTime(int[] time, int totalTrips) {
        for (int t=0; true; t++) {
            int totalTripsAtT = 0;
            for (int i : time) {
                totalTripsAtT += t / i;
            }
            if (totalTripsAtT>=totalTrips) return t;
        }
    }
}
