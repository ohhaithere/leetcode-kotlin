package com.mrazi.leetcode

import kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.target




class SearchInRotatedSortedArray {

    fun search(nums: IntArray, target: Int): Int {
        val n: Int = nums.size
        var left = 0
        var right = n - 1

        while (left <= right) {
            val mid = (left + right) / 2
            if (nums[mid] > nums[n - 1]) {
                left = mid + 1
            } else {
                right = mid - 1
            }
        }

        val answer = binarySearch(nums, 0, left - 1, target)
        return if (answer != -1) {
            answer
        } else binarySearch(nums, left, n - 1, target)

    }

    private fun binarySearch(nums: IntArray, leftBoundary: Int, rightBoundary: Int, target: Int): Int {
        var left = leftBoundary
        var right = rightBoundary
        while (left <= right) {
            val mid = (left + right) / 2
            if (nums[mid] == target) {
                return mid
            } else if (nums[mid] > target) {
                right = mid - 1
            } else {
                left = mid + 1
            }
        }
        return -1
    }
}