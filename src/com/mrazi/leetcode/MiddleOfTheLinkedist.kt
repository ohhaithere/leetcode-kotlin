package com.mrazi.leetcode

fun middleNode(head: ListNode?): ListNode? {
    var head = head
    val A = arrayOfNulls<ListNode>(100)
    var t = 0
    while (head != null) {
        A[t++] = head
        head = head.next
    }
    return A[t / 2]
}