package com.mrazi.leetcode

import java.util.HashMap




class MinimumNumberOfDaysToEatNOranges {

    var dp: MutableMap<Int, Int> = mutableMapOf<Int, Int>()

    fun minDays(n: Int): Int {
        if (n <= 1)
            return n;
        if (!dp.containsKey(n))
            dp[n]  = 1 + Math.min(n % 2 + minDays(n / 2), n % 3 + minDays(n / 3))
        return dp.get(n)!!;
    }

}