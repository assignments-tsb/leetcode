package dev.codefactory.leetcode.core;

public class Solution0006ZigZagConversion {

    public String convert(String s, int numRows) {
        if (s.length() <= 1) return s;

        /*

        PAYPALISHIRING

        PAHNAPLSIIGYIR

        [0] -> [0]
        [1] -> [4]
        [2] -> [11]
        [3] -> [5]
        [4] -> [6]

         */

        StringBuilder[] sb = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) sb[i] = new StringBuilder();
        int i = 0, n = s.length();
        while (i < n) {
            for (int j = 0; j < numRows && i < n; j++)
                sb[j].append(s.charAt(i++));
            for (int j = numRows - 2; j > 0 && i < n; j--)
                sb[j].append(s.charAt(i++));
        }
        for (int j = 1; j < numRows; j++)
            sb[0].append(sb[j]);
        return sb[0].toString();
    }
}
