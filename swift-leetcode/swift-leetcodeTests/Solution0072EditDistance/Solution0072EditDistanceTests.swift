//
//  Solution0072EditDistanceTest.swift
//  swift-leetcodeTests
//
//  Created by Lyndon Bibera on 2/26/23.
//

import XCTest

final class Solution0072EditDistanceTests: XCTestCase {
    
    let solution = Solution0072EditDistance()

    func testBasic() throws {
        let expected = 1
        let result = solution.minDistance("word", "work")
        
        XCTAssertEqual(result, expected)
    }
    
    func testWithEmptyString() throws {
        let expected = 0
        let result = solution.minDistance("", "")
        
        XCTAssertEqual(result, expected)
    }
    
    func testWithEmptyStringForOtherWord() throws {
        let expected = 1
        let result = solution.minDistance("a", "")
        
        XCTAssertEqual(result, expected)
    }


}
