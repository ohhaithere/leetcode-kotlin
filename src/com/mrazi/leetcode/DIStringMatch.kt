package com.mrazi.leetcode

fun diStringMatch(s: String): IntArray {
    val result = IntArray(s.length + 1);

    var i = 0;
    var d = s.length
    var iter = 0;

    for (c in s) {
        if (c == 'I') {
            result[iter] = i;
            i++
        } else {
            result[iter] = d
            d--
        }
        iter++
    }

    result[iter] = d

    return result
}