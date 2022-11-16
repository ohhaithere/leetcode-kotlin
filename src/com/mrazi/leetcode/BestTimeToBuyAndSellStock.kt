package com.mrazi.leetcode

fun maxProfit(prices: IntArray): Int {
    var minPrice = Int.MAX_VALUE
    var maxProfit = 0
    for (i in prices.indices) {
        if (minPrice > prices[i]) {
            minPrice = prices[i]
        } else if (prices[i] - minPrice > maxProfit) {
            maxProfit = prices[i] - minPrice
        }
    }
    return maxProfit
}