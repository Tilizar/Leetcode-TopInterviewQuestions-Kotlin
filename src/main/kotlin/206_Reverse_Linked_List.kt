import utils.ListNode

fun reverseList(head: ListNode?): ListNode? {
    var current: ListNode? = head
    var previous: ListNode? = null

    while (current != null) {
        val next = current.next
        current.next = previous
        previous = current
        current = next
    }

    return previous
}
