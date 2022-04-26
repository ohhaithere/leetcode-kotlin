package com.mrazi.leetcode

private fun checkPalindrome(s: String, i: Int, j: Int): Boolean {
    var i = i
    var j = j
    while (i < j) {
        if (s[i] != s[j]) {
            return false
        }
        i++
        j--
    }
    return true
}

fun validPalindrome(s: String): Boolean {
    var i = 0
    var j = s.length - 1
    while (i < j) {
        if (s[i] != s[j]) {
            return checkPalindrome(s, i, j - 1) || checkPalindrome(s, i + 1, j)
        }
        i++
        j--
    }
    return true
}