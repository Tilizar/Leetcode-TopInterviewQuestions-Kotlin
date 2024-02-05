import utils.ListNode.Companion.asListNode
import kotlin.test.Test
import kotlin.test.assertEquals

class `206_Reverse_Linked_List` {

    @Test
    fun case_1() {
        val input = listOf(1, 2, 3, 4, 5).asListNode()
        val output = reverseList(input)
        val expected = listOf(5, 4, 3, 2, 1).asListNode()

        assertEquals(expected, output)
    }

    @Test
    fun case_2() {
        val input = listOf(1, 2).asListNode()
        val output = reverseList(input)
        val expected = listOf(2, 1).asListNode()

        assertEquals(expected, output)
    }

    @Test
    fun case_3() {
        val output = reverseList(null)

        assertEquals(null, output)
    }
}
