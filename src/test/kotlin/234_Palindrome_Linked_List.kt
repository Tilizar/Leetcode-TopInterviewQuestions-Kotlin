import utils.ListNode
import utils.ListNode.Companion.asListNode
import kotlin.test.Test
import kotlin.test.assertEquals

private fun isPalindrome(head: ListNode?): Boolean {
    val cache = mutableListOf<Int>()

    var pointer = head
    while (pointer != null) {
        cache.add(pointer.`val`)
        pointer = pointer.next
    }

    var left = 0
    var right = cache.lastIndex

    while (left <= right) {
        if (cache[left] != cache[right]) {
            return false
        }
        left++
        right--
    }

    return true
}

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
