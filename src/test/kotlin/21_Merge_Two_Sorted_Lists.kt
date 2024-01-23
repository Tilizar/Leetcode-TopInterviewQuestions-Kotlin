import utils.ListNode.Companion.asListNode
import kotlin.test.Test
import kotlin.test.assertEquals

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
