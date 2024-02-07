import utils.ListNode.Companion.asListNode
import kotlin.test.Test
import kotlin.test.assertEquals

class `234_Palindrome_Linked_List` {

    @Test
    fun case_1() {
        val head = listOf(1, 2, 2, 1).asListNode()
        val output = isPalindrome(head)

        assertEquals(true, output)
    }

    @Test
    fun case_2() {
        val head = listOf(1, 2).asListNode()
        val output = isPalindrome(head)

        assertEquals(false, output)
    }
}
