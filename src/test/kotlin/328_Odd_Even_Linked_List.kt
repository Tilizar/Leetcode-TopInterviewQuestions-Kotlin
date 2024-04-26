import utils.ListNode
import utils.ListNode.Companion.asListNode
import kotlin.test.Test
import kotlin.test.assertEquals

private fun oddEvenList(head: ListNode?): ListNode? {
    if (head?.next == null) return head

    var oddPointer = head
    var evenPointer = head.next
    val evenHead = evenPointer

    while (evenPointer?.next != null) {
        oddPointer?.next = evenPointer.next
        oddPointer = oddPointer?.next
        evenPointer.next = oddPointer?.next
        evenPointer = evenPointer.next
    }

    oddPointer?.next = evenHead

    return head
}

class `328_Odd_Even_Linked_List` {

    @Test
    fun case_1() {
        val output = oddEvenList(listOf(1, 2, 3, 4, 5).asListNode())

        assertEquals(listOf(1, 3, 5, 2, 4).asListNode(), output)
    }

    @Test
    fun case_2() {
        val output = oddEvenList(listOf(2, 1, 3, 5, 6, 4, 7).asListNode())

        assertEquals(listOf(2, 3, 6, 7, 1, 5, 4).asListNode(), output)
    }
}
