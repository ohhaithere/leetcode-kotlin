package com.mrazi.leetcode

import java.util.regex.Pattern


fun validIPAddress(queryIP: String): String {
    val chunkIPv4 = "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])"
    val pattenIPv4 = Pattern.compile("^($chunkIPv4\\.){3}$chunkIPv4$")

    val chunkIPv6 = "([0-9a-fA-F]{1,4})"
    val pattenIPv6 = Pattern.compile("^($chunkIPv6\\:){7}$chunkIPv6$")

    if (pattenIPv4.matcher(queryIP).matches()) return "IPv4"
    return  if (pattenIPv6.matcher(queryIP).matches()) "IPv6" else "Neither"
}