package com.mrazi.leetcode

fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
    var i = 0
    var count = 0;

    while (i <= flowerbed.size - 1) {
        if (flowerbed[i] == 0) {
            val emptyLeft = i === 0 || flowerbed[i - 1] === 0
            val emptyRight = i === flowerbed.size - 1 || flowerbed[i + 1] === 0

            if (emptyLeft && emptyRight) {
                flowerbed[i] = 1;
                count++;
            }
        }
        i++;
    }

    return count >= n
}