import utils.ListNode

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    if (l1 == null) {
        return l2
    } else if (l2 == null) {
        return l1
    }

    val dummyHead = ListNode(-1)
    var newHeadPointer: ListNode? = dummyHead

    var l1Pointer: ListNode? = l1
    var l2Pointer: ListNode? = l2

    var hasAdditionalOne = false

    while (l1Pointer != null || l2Pointer != null) {
        val sum = (l1Pointer?.`val` ?: 0) + (l2Pointer?.`val` ?: 0) + if (hasAdditionalOne) 1 else 0
        hasAdditionalOne = false

        val node = if (sum >= 10) {
            hasAdditionalOne = true
            ListNode(sum % 10)
        } else {
            ListNode(sum)
        }

        newHeadPointer?.next = node
        newHeadPointer = newHeadPointer?.next

        l1Pointer = l1Pointer?.next
        l2Pointer = l2Pointer?.next
    }

    if (hasAdditionalOne) {
        newHeadPointer?.next = ListNode(1)
    }

    return dummyHead.next
}
