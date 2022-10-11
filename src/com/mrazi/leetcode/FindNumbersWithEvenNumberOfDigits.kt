package com.mrazi.leetcode

class FindNumbersWithEvenNumberOfDigits {

    fun findNumbers(nums: IntArray): Int {
        var result = 0;
        for (i in nums.indices) {
            var digits = 0;
            while (nums[i] > 0) {
                digits++;
                nums[i] /= 10;
            }
            if (digits % 2 == 0)
                result++
        }
        return result
    }



}