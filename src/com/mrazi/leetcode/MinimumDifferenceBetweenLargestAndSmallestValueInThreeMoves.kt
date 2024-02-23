package com.mrazi.leetcode

import kotlin.math.min

class MinimumDifferenceBetweenLargestAndSmallestValueInThreeMoves {

    fun minDifference(nums: IntArray): Int {
        if (nums.size<=4) return 0
        nums.sort()
        var ans = Int.MAX_VALUE
        val len = nums.size - 1
        for (i in 0..3) {
            ans = min(ans, nums[len-3+i] - nums[i])
            ans = min(ans, nums[len-i] - nums[3-i])
        }
        return ans
    }

}