package com.mrazi.leetcode

class ListNode(var `val`: Int) {
         var next: ListNode? = null
}

fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
    var l1 = l1
    var l2 = l2
    val dummy = ListNode(0)
    var head: ListNode? = dummy
    while (head != null) {
        if (l1 == null || l2 == null) {
            break
        }
        if (l1.`val` <= l2.`val`) {
            head.next = l1
            l1 = l1.next
            head = head.next
        } else {
            head.next = l2
            l2 = l2.next
            head = head.next
        }
    }
    if (l1 != null) {
        head!!.next = l1
    }
    if (l2 != null) {
        head!!.next = l2
    }
    return dummy.next
}