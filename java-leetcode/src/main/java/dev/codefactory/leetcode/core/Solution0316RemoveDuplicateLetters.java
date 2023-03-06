package dev.codefactory.leetcode.core;

import java.util.*;

public class Solution0316RemoveDuplicateLetters {
    public String removeDuplicateLetters(String s) {
        Map<Character, Integer> lastOccurrence = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            lastOccurrence.put(s.charAt(i), i);
        }
        Stack<Character> stack = new Stack<>();
        Set<Character> seen = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (seen.contains(c)) {
                continue;
            }
            while (!stack.isEmpty() && stack.peek() > c && i < lastOccurrence.get(stack.peek())) {
                seen.remove(stack.pop());
            }
            stack.push(c);
            seen.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }
        return sb.toString();
    }
}
