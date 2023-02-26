//
//  Solution0072EditDistanceTest.swift
//  swift-leetcodeTests
//
//  Created by Lyndon Bibera on 2/26/23.
//

import XCTest

final class Solution0072EditDistanceTests: XCTestCase {
    
    let solution = Solution0072EditDistance()

    func testExample() throws {
        let expected = 1
        let result = solution.minDistance("word", "work")
        
        XCTAssertEqual(result, expected)
    }


}
