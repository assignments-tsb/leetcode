package dev.codefactory.leetcode.core;

import java.util.HashMap;

public class Solution0041FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        var maxValue = 0;
        var hashMap = new HashMap<Integer, Boolean>();

        for (int num : nums) {
            hashMap.put(num, true);
            maxValue = Math.max(maxValue, num);
        }

        for (int i=1; i<maxValue; i++) {
            if (!hashMap.containsKey(i)) return i;
        }

        return maxValue+1;
    }
}
