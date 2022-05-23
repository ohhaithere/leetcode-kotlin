package com.mrazi.leetcode

fun main(args: Array<String>) {
    minimumCost(intArrayOf(1,2,3))
}

fun minimumCost(cost: IntArray): Int {
    cost.sortDescending()
    var counter = 0
    var sum = 0
    for (candy in cost) {
        counter++
        if (counter == 3) {
            counter = 0
            continue
        }
        sum += candy
    }

    return sum
}