package com.mrazi.leetcode

import java.util.ArrayList




fun findClosestElements(arr: IntArray, k: Int, x: Int): List<Int> {
    var lo = 0
    var hi: Int = arr.size - 1
    while (hi - lo >= k) {
        if (Math.abs(arr[lo] - x) > Math.abs(arr[hi] - x)) {
            lo++
        } else {
            hi--
        }
    }
    val result: MutableList<Int> = ArrayList(k)
    for (i in lo..hi) {
        result.add(arr[i])
    }
    return result
}