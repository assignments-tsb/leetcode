package dev.codefactory.leetcode

import spock.lang.Specification

class MachineProblemSpec extends Specification {
    def sut = new MachineProblem()

    def 'test name'() {

        given:
        def input = "abbccd"

        when:
        def result = sut.removeDuplicateCharacters(input)

        then:
        result == "ad"
    }

    def 'test 2'() {

        given:
        int[] input = [0,100,1,2,5,-1,-1,1]

        when:
        def result = sut.findLongestAscendingSubset(input)

        then:
        result == 3
    }
}


/**
 *
 *
 * Table employees:
 |------------|-----------------|--------|
 |employee_id | name            | boss_id|
 |------------|-----------------|--------|
 |      1     | Max             | null   |
 |------------|-----------------|--------|
 |      2     | Jason           | 1      |
 |------------|-----------------|--------|
 |      3     | Alain           | 1      |
 |------------|-----------------|--------|
 |      4     | Victor          | 3      |
 |------------|-----------------|--------|
 |      5     | Mars            | 4      |
 |------------|-----------------|--------|

 Required output:
 |------------|-----------------|
 | name       | boss name       |
 |------------|-----------------|
 | Max        | No boss         |
 |------------|-----------------|
 | Jason      | Max             |
 |------------|-----------------|
 | Alain      | Max             |
 |------------|-----------------|
 | Victor     | Alain           |
 |------------|-----------------|
 | Mars       | Victor          |
 |------------|-----------------|


 SELECT
    e1.name AS name,
    e2.name AS boss_name
 FROM
    employees e1
 LEFT JOIN employees e2 ON e1.boss_id = e2.id


 */