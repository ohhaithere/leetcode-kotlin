package com.mrazi.leetcode

fun main(args: Array<String>) {
    removeDuplicates(intArrayOf(0,1,2,2,2,2,2,3,4,4,4))
}

fun removeDuplicates(nums: IntArray): Int {
    var counter = 0;
    var k = 0;
    var result = 0;
    var j = 0;
    for (i in 0..nums.size - 2) {
        if (nums[i] == nums[i+1]) {
            k = i
            while (nums[k] == nums[i] ) {
                k++
                counter++
                if (k >= nums.size -  result) {
                    break
                }
            }
        }
        if (counter >= 3) {
            for (j in i..nums.size-(counter - 3 + 2)) {
                nums[j] = nums[j+(counter - 3 + 1)]
            }
            if (k <= nums.size -  result )
                result = result + counter - 3 + 1
        }
        counter = 0
    }
    return nums.size - result
}