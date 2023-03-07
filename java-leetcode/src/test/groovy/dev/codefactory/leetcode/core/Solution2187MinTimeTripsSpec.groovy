package dev.codefactory.leetcode.core

import spock.lang.Specification

class Solution2187MinTimeTripsSpec extends Specification {
    def solution = new Solution2187MinTimeTrips()

    def 'it should calculate the minimum trips to complete all trips'(int[] time, int totalTrips, long expected) {

        when:
        def result = solution.minimumTime(time, totalTrips)

        then:
        result == expected

        where:
        time        | totalTrips    | expected
        [1,2,3]     | 5             | 3
        [2]         | 1             | 2
        [1,1,1,1,1] | 4             | 1
        [1,1,1,1,1] | 5             | 1
        [1,1,1,1,1] | 6             | 2
    }
}
