package dev.codefactory.leetcode.core;

public class Solution0058LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        var startCount = false;
        var count = 0;
        for (int i=s.length()-1; i>=0; i--) {
            if (s.charAt(i)!=' ') {
                count++;
            }
            if (startCount && s.charAt(i)==' ') {
                break;
            }
            if (!startCount && s.charAt(i)!=' ') {
                startCount = true;
            }
        }
        return count;
    }
}
