package com.mrazi.leetcode

fun isSubsequence(s: String, t: String): Boolean {
    if (s.isEmpty()) return true
    var indexS = 0
    var indexT = 0
    while (indexT < t.length) {
        if (t[indexT] == s[indexS]) {
            indexS++
            if (indexS == s.length) return true
        }
        indexT++
    }
    return false
}