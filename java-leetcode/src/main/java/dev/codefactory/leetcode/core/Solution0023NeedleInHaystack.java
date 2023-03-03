package dev.codefactory.leetcode.core;

public class Solution0023NeedleInHaystack {
    public int strStr(String haystack, String needle) {

        haystack:
        for (int i=0; i<=haystack.length()-needle.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                for (int j=0; j<needle.length(); j++) {
                    if (haystack.charAt(i+j) != needle.charAt(j)) {
                        continue haystack;
                    }
                }
                return i;
            }
        }

        return -1;
    }
}
