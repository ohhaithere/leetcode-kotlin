package com.mrazi.leetcode

class Maximum69Number {

    fun maximum69Number (num: Int): Int {
        return num.toString().replaceFirst("6", "9").toInt()
    }

}