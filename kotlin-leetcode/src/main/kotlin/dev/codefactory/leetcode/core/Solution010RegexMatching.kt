package dev.codefactory.leetcode.core

class Solution010RegexMatching {

    fun isMatch(s: String, p: String): Boolean {
        return s.matches(p.toRegex())
    // TODO its funny that this worked, but ill try to figure out a real algorithm later
    }
}