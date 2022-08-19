package com.mrazi.leetcode

fun balancedStringSplit(s: String): Int {
    var counter = 0
    var result = 0
    for (c in s) {
        if(c == 'L') {
            counter++
        } else {
            counter--
        }
        if (counter == 0) {
            result++
        }
    }

    return result
}