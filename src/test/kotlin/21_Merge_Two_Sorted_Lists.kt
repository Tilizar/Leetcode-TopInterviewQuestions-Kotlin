import utils.ListNode
import utils.ListNode.Companion.asListNode
import kotlin.test.Test
import kotlin.test.assertEquals

private fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    val dummy = ListNode(0)
    var outputPointer: ListNode? = dummy
    var list1Pointer: ListNode? = list1
    var list2Pointer: ListNode? = list2

    while (list1Pointer != null && list2Pointer != null) {
        if (list1Pointer.`val` > list2Pointer.`val`) {
            outputPointer?.next = list2Pointer
            list2Pointer = list2Pointer.next
        } else {
            outputPointer?.next = list1Pointer
            list1Pointer = list1Pointer.next
        }
        outputPointer = outputPointer?.next
    }

    outputPointer?.next = list1Pointer ?: list2Pointer

    return dummy.next
}

class `21_Merge_Two_Sorted_Lists` {

    @Test
    fun case_1() {
        val first = listOf(1,2,4).asListNode()
        val second = listOf(1,3,4).asListNode()

        val output = mergeTwoLists(first, second)

        val expected = listOf(1,1,2,3,4,4).asListNode()
        assertEquals(expected, output)
    }
}
