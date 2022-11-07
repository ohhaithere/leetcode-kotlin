package com.mrazi.leetcode

import java.time.LocalDate
import java.time.temporal.ChronoUnit

fun daysBetweenDates(date1: String, date2: String): Int {
    val localDate1 = LocalDate.parse(date1)
    val localDate2 = LocalDate.parse(date2)

    return Math.abs(localDate1.until(localDate2, ChronoUnit.DAYS).toInt())

}