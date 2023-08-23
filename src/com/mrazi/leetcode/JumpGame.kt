package com.mrazi.leetcode

fun main(args: Array<String>) {
    canJump(intArrayOf(3,2,1,0,4))
}

    fun canJump(nums: IntArray): Boolean {
        var reachable = 0
        for (i in 0 until nums.size) {
            if (i > reachable) return false
            reachable = Math.max(reachable, i + nums[i])
        }
        return true
    }

