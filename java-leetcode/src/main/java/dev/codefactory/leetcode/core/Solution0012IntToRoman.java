package dev.codefactory.leetcode.core;

public class Solution0012IntToRoman {
    private static final int[] INT_VALUES = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] STR_VALUES = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public String intToRoman(int num) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < INT_VALUES.length; i++) {
            while (num >= INT_VALUES[i]) {
                num -= INT_VALUES[i];
                sb.append(STR_VALUES[i]);
            }
        }
        return sb.toString();
    }
}
