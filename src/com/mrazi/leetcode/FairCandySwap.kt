package com.mrazi.leetcode

fun fairCandySwap(aliceSizes: IntArray, bobSizes: IntArray): IntArray {
    var aliceSum = 0
    var bobSum = 0
    for (i in 0 until aliceSizes.size) aliceSum += aliceSizes[i]
    for (i in 0 until bobSizes.size) bobSum += bobSizes[i]
    val dif = (aliceSum - bobSum) / 2
    for (i in 0 until aliceSizes.size) {
        for (j in 0 until bobSizes.size) {
            if (aliceSizes[i] - bobSizes[j] === dif) return intArrayOf(aliceSizes[i], bobSizes[j])
        }
    }
    return intArrayOf(0)
}