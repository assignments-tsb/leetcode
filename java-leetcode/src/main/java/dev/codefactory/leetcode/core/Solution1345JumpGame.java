package dev.codefactory.leetcode.core;

import java.util.*;

public class Solution1345JumpGame {
    public int minJumps(int[] arr) {
        int n = arr.length;

        if (n==1) return 0;

        Map<Integer, Integer> minSteps = new HashMap<>();
        minSteps.put(0,0);

        Queue<Integer> q = new LinkedList<>();
        q.add(0);

        Map<Integer, LinkedList<Integer>> mapForIndex = new HashMap<>();
        for (int i=0; i<n; i++) {
            if (!mapForIndex.containsKey(arr[i])) {
                mapForIndex.put(arr[i], new LinkedList<>());
            }
            mapForIndex.get(arr[i]).add(i);
        }

        boolean[] visited = new boolean[n]; visited[0] = true;
        int step = 0;

        while (!q.isEmpty()) {
            for (int size = q.size(); size > 0; --size) {
                int i = q.poll();
                if (i == n - 1) return step;
                List<Integer> next = mapForIndex.get(arr[i]);
                next.add(i - 1); next.add(i + 1);
                for (int j : next) {
                    if (j >= 0 && j < n && !visited[j]) {
                        visited[j] = true;
                        q.offer(j);
                    }
                }
                next.clear();
            }
            step++;
        }

        return 0;
    }
}
