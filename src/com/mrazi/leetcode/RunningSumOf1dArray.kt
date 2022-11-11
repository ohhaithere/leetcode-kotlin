package com.mrazi.leetcode

fun runningSum(nums: IntArray): IntArray {
    var result = IntArray(nums.size)
    result[0] = nums[0]
    for (i in 1 until nums.size) {
        result[i] = result[i-1] + nums[i]
    }

    return result
}