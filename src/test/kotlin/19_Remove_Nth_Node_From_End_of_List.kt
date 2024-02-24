import utils.ListNode.Companion.asListNode
import kotlin.test.Test
import kotlin.test.assertEquals

class `19_Remove_Nth_Node_From_End_of_List` {

    @Test
    fun case_1() {
        val output = removeNthFromEnd(listOf(1, 2, 3, 4, 5).asListNode(), 2)

        val expected = listOf(1, 2, 3, 5).asListNode()

        assertEquals(expected, output)
    }

    @Test
    fun case_2() {
        val output = removeNthFromEnd(listOf(1).asListNode(), 1)

        assertEquals(null, output)
    }

    @Test
    fun case_3() {
        val output = removeNthFromEnd(listOf(1, 2).asListNode(), 1)

        val expected = listOf(1).asListNode()

        assertEquals(expected, output)
    }
}
