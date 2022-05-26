package com.mrazi.leetcode

fun sortArrayByParity(nums: IntArray): IntArray {
    val result = IntArray(nums.size)
    var counter = 0

    for(i in nums) {
        if (i % 2 == 0) {
            result[counter] = i
            counter++
        }
    }

    for(i in nums) {
        if (i % 2 != 0) {
            result[counter] = i
            counter++
        }
    }

    return result
}