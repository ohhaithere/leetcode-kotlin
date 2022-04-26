package com.mrazi.leetcode

fun main(args: Array<String>) {
    lemonadeChange(intArrayOf(5,5,5,10,20))
}

fun lemonadeChange(bills: IntArray): Boolean {
    var five = 0
    var ten = 0
    for (bill in bills) {
        if (bill == 5) five++ else if (bill == 10) {
            if (five == 0) return false
            five--
            ten++
        } else {
            if (five > 0 && ten > 0) {
                five--
                ten--
            } else if (five >= 3) {
                five -= 3
            } else {
                return false
            }
        }
    }

    return true
}