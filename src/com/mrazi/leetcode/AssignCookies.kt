package com.mrazi.leetcode

fun main(args: Array<String>) {
    findContentChildren(intArrayOf(1,2,3), intArrayOf(1,1))
}


    fun findContentChildren(g: IntArray, s: IntArray): Int {
        var counter = 0;
        var result = 0;
        g.sortDescending()
        s.sortDescending()

        for (child in g) {
            for (i in counter until s.size) {
                if (child <= s[i]) {
                    counter++;
                    result++;
                    break
                }
            }
        }
        return result;
    }

