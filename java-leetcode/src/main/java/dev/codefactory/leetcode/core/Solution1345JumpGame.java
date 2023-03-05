package dev.codefactory.leetcode.core;

import java.util.*;

public class Solution1345JumpGame {
    public int minJumps(int[] arr) {
        if (arr.length==1) return 1;

        Map<Integer, Integer> minSteps = new HashMap<>();
        minSteps.put(0,0);

        Queue<Integer> q = new LinkedList<>();
        q.add(0);

        while (!q.isEmpty()) {
            var currentIndex = q.remove();
            var currentStep = minSteps.get(0);

            //left
            if (currentIndex+1<arr.length && !minSteps.containsKey(currentIndex+1)) {
                minSteps.put(currentIndex+1, currentStep+1);
                q.add(currentIndex+1);
            }

            //right
            if (currentIndex-1>=0 && !minSteps.containsKey(currentIndex-1)) {
                minSteps.put(currentIndex-1, currentStep+1);
                q.add(currentIndex-1);
            }

            //special
            for (int i=0; i<arr.length; i++) {
                if (arr[currentIndex]==arr[i] && i!=currentIndex && !minSteps.containsKey(i)) {
                    minSteps.put(i, currentStep+1);
                    q.add(i);
                }
            }
        }

        return minSteps.get(arr.length-1);
    }
}
