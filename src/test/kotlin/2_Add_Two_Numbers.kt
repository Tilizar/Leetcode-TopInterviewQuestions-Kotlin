import utils.ListNode.Companion.asListNode
import kotlin.test.Test
import kotlin.test.assertEquals

class `2_Add_Two_Numbers` {

    @Test
    fun case_1() {
        val first = listOf(2, 4, 3).asListNode()
        val second = listOf(5, 6, 4).asListNode()
        val expected = listOf(7, 0, 8).asListNode()

        val output = addTwoNumbers(first, second)

        assertEquals(expected, output)
    }

    @Test
    fun case_2() {
        val first = listOf(0).asListNode()
        val second = listOf(0).asListNode()
        val expected = listOf(0).asListNode()

        val output = addTwoNumbers(first, second)

        assertEquals(expected, output)
    }

    @Test
    fun case_3() {
        val first = listOf(9, 9, 9, 9, 9, 9, 9).asListNode()
        val second = listOf(9, 9, 9, 9).asListNode()
        val expected = listOf(8, 9, 9, 9, 0, 0, 0, 1).asListNode()

        val output = addTwoNumbers(first, second)

        assertEquals(expected, output)
    }
}
