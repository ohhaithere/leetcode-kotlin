package com.mrazi.leetcode

fun arrayPairSum(nums: IntArray): Int {
    var result = 0;

    nums.sortDescending();

    var i = 0;

    while (i <= nums.size-1) {
        val min = Math.min(nums[i], nums[i+1])
        result += min;
        i += 2;
    }

    return result;
}