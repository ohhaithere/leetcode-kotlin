package com.mrazi.leetcode

fun main(args: Array<String>) {
    stoneGame(intArrayOf(5,3,4,5))
}

fun stoneGame(piles: IntArray): Boolean {
    var alice = 0
    var bob = 0
    var aliceTurn = true
    var i = 0
    var j = piles.size
    var result = 0

    while(i < j) {

        if (piles[i] > piles[j]) {
            result = piles[i]
            i++
        } else {
            result = piles[j]
            j--
        }
        if (aliceTurn) {
            alice += result
            aliceTurn = false
        } else {
            bob += result
            aliceTurn = true
        }
    }

    return alice > bob
}