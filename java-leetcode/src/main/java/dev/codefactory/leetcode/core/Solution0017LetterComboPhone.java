package dev.codefactory.leetcode.core;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution0017LetterComboPhone {

    private static final Map<Character, String> KEY_MAP = Map.of(
            '2', "abc",
            '3', "def",
            '4', "ghi",
            '5', "jkl",
            '6', "mno",
            '7', "pqrs",
            '8', "tuv",
            '9', "wxyz"
    );
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return Collections.emptyList();

        var combos = new LinkedList<String>();
        createCombos(digits, 0, "", combos);
        return combos;
    }

    private void createCombos(String digits, Integer index, String currentCombo, List<String> comboAccumulator) {
        if (index == digits.length()) {
            comboAccumulator.add(currentCombo);
            return;
        }

        String characters = KEY_MAP.get(digits.charAt(index));

        for (int i=0; i<characters.length(); i++) {
            createCombos(digits, index+1, currentCombo + characters.charAt(i), comboAccumulator);
        }
    }
}
