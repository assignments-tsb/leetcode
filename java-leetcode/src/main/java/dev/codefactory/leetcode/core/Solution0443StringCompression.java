package dev.codefactory.leetcode.core;

public class Solution0443StringCompression {

    private static final char DEFAULT = ' ';
    public int compress(char[] chars) {
        StringBuilder s = new StringBuilder();

        char current = DEFAULT;
        int count = 0;

        for (int i=0; i<chars.length; i++) {
            if (current == chars[i]) {
                count++;
            } else {
                if (count>1) {
                    s.append(count);
                }
                count = 1;
                s.append(chars[i]);
                current = chars[i];
            }
        }

        if (count>1) {
            s.append(count);
        }

        for (int i=0; i<chars.length; i++) {
            if (i<s.length()) {
                chars[i] = s.charAt(i);
            }
        }

        return s.length();
    }
}
