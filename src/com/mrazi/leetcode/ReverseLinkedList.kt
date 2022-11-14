package com.mrazi.leetcode

fun reverseList(head: ListNode?): ListNode? {
    if (head?.next == null) {
        return head
    }
    var prev: ListNode? = null
    var curr = head
    while (curr != null) {
        val next = curr.next
        curr.next = prev
        prev = curr
        curr = next
    }
    return prev
}