package dev.codefactory.leetcode.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution208Trie {

    public ArrayList<Boolean> run(ArrayList<String> commands, ArrayList<String> params) {
        var results = new ArrayList<Boolean>(commands.size());
        Trie trie = null;
        for (int i=0; i<commands.size(); i++) {
            if (commands.get(i) == "Trie") {
                trie = new Trie();
                results.add(i, null);
            } else if (commands.get(i).equalsIgnoreCase("insert")) {
                trie.insert(params.get(i));
                results.add(i, null);
            } else if (commands.get(i).equalsIgnoreCase("search")) {
                results.add(i, trie.search(params.get(i)));
            } else if (commands.get(i).equalsIgnoreCase("startsWith")) {
                results.add(i, trie.startsWith(params.get(i)));
            }
        }

        return results;
    }
}

class Trie {

    private final Character DELIMITER = '.';
    private final Map<Character, Trie> leaf = new HashMap<>();
    public Trie() {}

    public void insert(String word) {
        var currentTrie = this;
        for (int i=0; i<word.length(); i++) {
            var c = word.charAt(i);
            if (currentTrie.leaf.containsKey(c)) {
                currentTrie = currentTrie.leaf.get(c);
            } else {
                Trie t = new Trie();
                currentTrie.leaf.put(c, t);
                currentTrie = t;
            }
        }
        Trie t = new Trie();
        currentTrie.leaf.put(DELIMITER, t);
    }

    public boolean search(String word) {
        var currentTrie = this;
        for (int i=0; i<word.length(); i++) {
            var c = word.charAt(i);
            if (currentTrie.leaf.containsKey(c)) {
                currentTrie = currentTrie.leaf.get(c);
            } else {
                return false;
            }
        }
        return currentTrie.leaf.containsKey(DELIMITER);
    }

    public boolean startsWith(String prefix) {
        var currentTrie = this;
        for (int i=0; i<prefix.length(); i++) {
            var c = prefix.charAt(i);
            if (currentTrie.leaf.containsKey(c)) {
                currentTrie = currentTrie.leaf.get(c);
            } else {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return leaf.keySet().toString();
    }
}
