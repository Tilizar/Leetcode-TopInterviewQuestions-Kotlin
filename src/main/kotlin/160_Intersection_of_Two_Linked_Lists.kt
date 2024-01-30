import utils.ListNode

fun getIntersectionNode(headA: ListNode?, headB: ListNode?): ListNode? {
    var firstPointer = headA
    var secondPointer = headB

    while (firstPointer != null && secondPointer != null) {
        if (firstPointer === secondPointer) {
            return firstPointer
        }

        if (firstPointer.next == null && secondPointer.next == null) break

        firstPointer = firstPointer.next ?: headB
        secondPointer = secondPointer.next ?: headA
    }

    return null
}
