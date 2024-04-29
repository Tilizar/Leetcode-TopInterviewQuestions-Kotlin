import utils.ListNode
import utils.ListNode.Companion.asListNode
import kotlin.test.Test
import kotlin.test.assertEquals

private fun mergeKLists(lists: Array<ListNode?>): ListNode? {
    val dummy = ListNode(-1)
    var pointer: ListNode? = dummy

    while (true) {
        var smallestValue = Int.MAX_VALUE
        var smallestIndex = -1

        lists.forEachIndexed { index, node ->
            if (node != null && smallestValue > node.`val`) {
                smallestValue = node.`val`
                smallestIndex = index
            }
        }

        if (smallestIndex == -1) break

        pointer?.next = lists[smallestIndex]
        lists[smallestIndex] = lists[smallestIndex]?.next
        pointer = pointer?.next
        pointer?.next = null
    }

    return dummy.next
}


class `23_Merge_k_Sorted_Lists` {

    @Test
    fun case_1() {
        val input = arrayOf(
            listOf(1, 4, 5).asListNode(),
            listOf(1, 3, 4).asListNode(),
            listOf(2, 6).asListNode()
        )

        val output = mergeKLists(input)

        val expected = listOf(1, 1, 2, 3, 4, 4, 5, 6).asListNode()

        assertEquals(expected, output)
    }

    @Test
    fun case_2() {
        val output = mergeKLists(arrayOf())

        assertEquals(null, output)
    }

    @Test
    fun case_3() {
        val output = mergeKLists(arrayOf(null))

        assertEquals(null, output)
    }
}
