package dev.codefactory.leetcode;

import java.util.HashMap;

/**
 * Return the string without any duplicate characters.
 */
public class MachineProblem {

    public String removeDuplicateCharacters(String input) {

        var mapOfCount = new HashMap<Character, Integer>();

        for (int i = 0; i<input.length(); i++) {
            char c = input.charAt(i);
            if (!mapOfCount.containsKey(c)) {
                mapOfCount.put(c, 1);
            } else {
                mapOfCount.put(c, mapOfCount.get(c)+1);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<input.length(); i++) {
            char c = input.charAt(i);
            if (mapOfCount.get(c) == 1) {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    /**
     * Given an unsorted array of integers find the longest subset
     * where all integers are in ascending order?
     * Integers do not have increase by one in the found sequence.
     */
    public int findLongestAscendingSubset(int[] arr) {

        int longest = 0;

        int lastAscending = 0;
        for (int i=1; i<arr.length-1; i++) {
            if (arr[i-1] > arr[i]) {
                longest = Math.max(i-lastAscending, longest);
                lastAscending = i;
            }
        }

        return longest;
    }
}
