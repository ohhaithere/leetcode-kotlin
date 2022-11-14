package com.mrazi.leetcode

import java.util.HashMap


private fun transformString(s: String): String {
    val indexMapping: MutableMap<Char, Int> = HashMap()
    val builder = StringBuilder()
    for (i in s.indices) {
        val c1 = s[i]
        if (!indexMapping.containsKey(c1)) {
            indexMapping[c1] = i
        }
        builder.append(Integer.toString(indexMapping[c1]!!))
        builder.append(" ")
    }
    return builder.toString()
}

fun isIsomorphic(s: String, t: String): Boolean {
    return transformString(s) == transformString(t)
}