package com.mrazi.leetcode

class LongestPalindrome {

    fun longestPalindrome(s: String): Int {
        var count = IntArray(128);

        for (c in s.toCharArray()) {
            count[c.toInt()]++;
        }

        var result = 0;

        for(i in count) {
            result += i / 2 * 2;
            if (result % 2 == 0 && i % 2 == 1) {
                result++;
            }
        }
        return result;
    }

}