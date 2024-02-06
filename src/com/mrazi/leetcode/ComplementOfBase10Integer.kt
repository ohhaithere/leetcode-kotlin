package com.mrazi.leetcode

import kotlin.math.pow

class ComplementOfBase10Integer {

    fun bitwiseComplement(n: Int): Int {
        val binary = Integer.toBinaryString(n)
        return binaryToDecimal(binary)
    }

    fun binaryToDecimal(binary: String): Int{
        val reversedDigits = binary.reversed().toCharArray().map{it.digitToInt()}
        var decimalNumber = 0
        var i = 0
        var reverse = 0

        for (n in reversedDigits) {
            if (n == 0) {
                reverse = 1
            } else {
                reverse = 0
            }
            decimalNumber += (reverse * 2.0.pow(i)).toInt()
            ++i
        }
        return decimalNumber
    }
}