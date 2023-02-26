//
//  Solution0072EditDistance.swift
//  swift-leetcode
//
//  Created by Lyndon Bibera on 2/26/23.
//

import Foundation

class Solution0072EditDistance {
    
    func minDistance(_ word1: String, _ word2: String) -> Int {
        let m = word1.count
        let n = word2.count
        
        if (m==0 || n==0) {
            return abs(m-n)
        }
        
        var dp = Matrix(rows: m+1, columns: n+1)
        
        for i in 0...m {
            dp[i, 0] = i
        }
        
        for i in 0...n {
            dp[0, i] = i
        }
        
        for i in 1...m {
            for j in 1...n {
                if (word1[i-1] == word2[j-1]) {
                    dp[i,j] = dp[i-1,j-1]
                } else {
                    dp[i,j] = 1 + min(dp[i,j-1], min(dp[i-1,j], dp[i-1,j-1]))
                }
            }
        }
        
        return dp[m,n]
    }
}

struct Matrix {
    let rows: Int
    let columns: Int
    var data: [Int]
    
    init(rows: Int, columns: Int) {
        self.rows = rows
        self.columns = columns
        self.data = Array(repeating: 0, count: rows * columns)
    }
    
    func indexIsValid(row: Int, column: Int) -> Bool {
        return row >= 0 && row < rows && column >= 0 && column < columns
    }
    
    subscript(row: Int, column: Int) -> Int {
        get {
            assert(indexIsValid(row: row, column: column), "Index out of range")
            return data[(row * columns) + column]
        }
        set {
            assert(indexIsValid(row: row, column: column), "Index out of range")
            data[(row * columns) + column] = newValue
        }
    }
}

extension String {
    subscript(i: Int) -> String {
        return  i < count ? String(self[index(startIndex, offsetBy: i)]) : ""
    }
}
