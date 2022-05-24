package com.mrazi.leetcode

fun longestSubarray(A: IntArray): Int {
    var i = 0
    var j: Int
    var k = 1
    var res = 0
    run {
        j = 0
        while (j < A.size) {
            if (A.get(j) === 0) {
                k--
            }
            while (k < 0) {
                if (A.get(i) === 0) {
                    k++
                }
                i++
            }
            res = Math.max(res, j - i)
            ++j
        }
    }
    return res
}