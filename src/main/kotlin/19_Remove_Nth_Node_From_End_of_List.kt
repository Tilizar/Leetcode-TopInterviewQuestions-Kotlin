import utils.ListNode

fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
    var cursor = head
    var counter = 0
    var beforeFound = head

    while (cursor != null) {
        if (counter <= n) {
            counter++
        } else {
            beforeFound = beforeFound?.next
        }
        cursor = cursor.next
    }

    if (counter == n) {
        return head?.next
    }

    beforeFound?.next = beforeFound?.next?.next

    return head
}
