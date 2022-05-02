package com.mrazi.leetcode

import java.util.HashMap




fun checkSubarraySum(nums: IntArray, k: Int): Boolean {
    val map: MutableMap<Int, Int> = HashMap()
    map[0] = -1
    var sum = 0
    for (i in nums.indices) {
        sum += nums[i]
        if (map.containsKey(sum % k)) {
            if (i - map[sum % k]!! >= 2) {
                return true
            }
        } else {
            map[sum % k] = i
        }
    }
    return false
}

fun main(args: Array<String>) {
    checkSubarraySum(intArrayOf(23,2,4,6,7), 6)
}