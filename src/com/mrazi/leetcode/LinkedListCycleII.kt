package com.mrazi.leetcode

fun detectCycle(head: ListNode?): ListNode? {
    var head = head
    var slow = head
    var fast = head
    while (fast?.next != null) {
        slow = slow!!.next
        fast = fast.next!!.next
        if (slow == fast) break
    }
    if (fast?.next == null) return null
    while (head != slow) {
        head = head!!.next
        slow = slow!!.next
    }
    return head
}