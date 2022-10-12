package com.mrazi.leetcode

import jdk.internal.org.jline.utils.DiffHelper.diff





fun main(args: Array<String>) {
    sumGame("8?6?90?5")
}

fun sumGame(num: String): Boolean {

    var diff = 0
    var left = 0
    var right = 0
    for (i in 0 until num.length / 2) {
        if (num[i] === '?') {
            left++
        } else {
            diff += num[i] - '0'
        }
    }

    for (i in num.length / 2 until num.length) {
        if (num[i] === '?') {
            right++
        } else {
            diff -= num[i] - '0'
        }
    }

    if ((right + left) % 2 == 1) return true

    if (left == right) {
        return diff != 0
    }
    val round = (left - right) / 2

    return if (diff * round >= 0) true else Math.abs(diff) != Math.abs(round * 9)

}