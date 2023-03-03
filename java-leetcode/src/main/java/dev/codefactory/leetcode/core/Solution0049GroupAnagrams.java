package dev.codefactory.leetcode.core;

import java.util.*;

public class Solution0049GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        var table = new HashMap<String, List<String>>();

        for (int i=0; i<strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);

            var key = new String(chars);

            if (!table.containsKey(key)) {
                table.put(key, new LinkedList<>());
            }

            table.get(key).add(strs[i]);
        }

        return table.values().stream().toList();
    }
}
