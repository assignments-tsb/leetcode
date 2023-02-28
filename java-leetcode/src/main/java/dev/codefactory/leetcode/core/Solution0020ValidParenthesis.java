package dev.codefactory.leetcode.core;

import java.util.List;
import java.util.Stack;

public class Solution0020ValidParenthesis {

    private final static List<Character> OPEN_BRACKET = List.of('[', '{', '(');
    private final static List<Character> CLOSE_BRACKET = List.of(']', '}', ')');
    public boolean isValid(String s) {
        var stack = new Stack<Character>();

        for (int i=0; i<s.length(); i++) {
            var current = s.charAt(i);

            if (OPEN_BRACKET.contains(current)) {
                stack.push(current);
            } else {
                var partner = stack.pop();
                if (CLOSE_BRACKET.indexOf(current) != OPEN_BRACKET.indexOf(partner)) return false;
            }
        }

        return stack.isEmpty();
    }
}
