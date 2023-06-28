package com.mrazi.leetcode

fun largestTimeFromDigits(arr: IntArray): String {
    arr.sort();
    for (firstIndex in 3 downTo 0) {
        if (arr[firstIndex] <= 2) {
            val maxSecond = if (arr[firstIndex] === 2) 3 else 9
            for (secondIndex in 3 downTo 0) {
                if (arr[secondIndex] <= maxSecond && secondIndex != firstIndex) {
                    for (thirdIndex in 3 downTo 0) {
                        if (arr[thirdIndex] <= 5 && thirdIndex != firstIndex && thirdIndex != secondIndex) {
                            val fourthIndex = 6 - firstIndex - secondIndex - thirdIndex
                            return StringBuilder()
                                .append(arr[firstIndex])
                                .append(arr[secondIndex])
                                .append(":")
                                .append(arr[thirdIndex])
                                .append(arr[fourthIndex])
                                .toString()
                            
                        }
                    }
                }
            }
        }
    }
    return ""
}