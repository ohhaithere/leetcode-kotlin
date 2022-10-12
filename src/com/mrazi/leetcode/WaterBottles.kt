package com.mrazi.leetcode

class WaterBottles {

    fun numWaterBottles(numBottles: Int, numExchange: Int): Int {
        var result = numBottles
        var numBottlesHolder = numBottles
        while (numBottlesHolder >= numExchange) {
            var left = numBottlesHolder % numExchange;
            numBottlesHolder /= numExchange
            result += numBottlesHolder
            numBottlesHolder += left;
        }

        return result
    }

}