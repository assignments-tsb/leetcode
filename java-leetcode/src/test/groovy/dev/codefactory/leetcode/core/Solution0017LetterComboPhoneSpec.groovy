package dev.codefactory.leetcode.core

import spock.lang.Specification

class Solution0017LetterComboPhoneSpec extends Specification {

    def solution = new Solution0017LetterComboPhone()

    def 'it should return the combination of all phone number'() {

        given:
        def digits = "23"

        and:
        List<String> expected = ["ad","ae","af","bd","be","bf","cd","ce","cf"]

        when:
        def result = solution.letterCombinations(digits)

        then:
        result == expected
    }

    def 'it should still work on empty'() {

        given:
        def digits = ""

        and:
        List<String> expected = []

        when:
        def result = solution.letterCombinations(digits)

        then:
        result == expected
    }

    def 'it should still work on single digit'() {

        given:
        def digits = "2"

        and:
        List<String> expected = ["a", "b", "c"]

        when:
        def result = solution.letterCombinations(digits)

        then:
        result == expected
    }
}
