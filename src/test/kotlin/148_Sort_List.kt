import utils.ListNode
import utils.ListNode.Companion.asListNode
import kotlin.test.Test
import kotlin.test.assertEquals

private fun sortList(head: ListNode?): ListNode? {
    if (head?.next == null) {
        return head
    }

    val mid = findMid(head)
    var left = head
    var right = mid?.next
    mid?.next = null

    left = sortList(left)
    right = sortList(right)

    return merge(left, right)
}

private fun findMid(node: ListNode?): ListNode? {
    var slow: ListNode? = node
    var fast: ListNode? = node?.next

    while (fast?.next != null) {
        slow = slow?.next
        fast = fast.next?.next
    }

    return slow
}

private fun merge(left: ListNode?, right: ListNode?): ListNode? {
    val dummy = ListNode(0)
    var outputPointer: ListNode? = dummy
    var leftPointer: ListNode? = left
    var rightPointer: ListNode? = right

    while (leftPointer != null && rightPointer != null) {
        if (leftPointer.`val` > rightPointer.`val`) {
            outputPointer?.next = rightPointer
            rightPointer = rightPointer.next
        } else {
            outputPointer?.next = leftPointer
            leftPointer = leftPointer.next
        }
        outputPointer = outputPointer?.next
    }

    outputPointer?.next = leftPointer ?: rightPointer

    return dummy.next
}

class `148_Sort_List` {

    @Test
    fun case_1() {
        val input = listOf(4, 2, 1, 3).asListNode()
        val output = sortList(input)

        val expected = listOf(1, 2, 3, 4).asListNode()
        assertEquals(expected, output)
    }

    @Test
    fun case_2() {
        val input = listOf(-1, 5, 3, 4, 0).asListNode()
        val output = sortList(input)

        val expected = listOf(-1, 0, 3, 4, 5).asListNode()
        assertEquals(expected, output)
    }

    @Test
    fun case_3() {
        val output = sortList(null)

        assertEquals(null, output)
    }
}
