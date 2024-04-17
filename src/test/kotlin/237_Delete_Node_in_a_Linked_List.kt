import utils.ListNode
import utils.ListNode.Companion.asListNode
import kotlin.test.Test
import kotlin.test.assertEquals

private fun deleteNode(node: ListNode?) {
    val next = node?.next
    node?.`val` = next?.`val` ?: return
    node.next = next.next
}

class `237_Delete_Node_in_a_Linked_List` {

    @Test
    fun case_1() {
        val linkedList = listOf(4, 5, 1, 9).asListNode()
        val nodeToDelete = linkedList?.next //5

        deleteNode(nodeToDelete)

        assertEquals(listOf(4, 1, 9).asListNode(), linkedList)
    }

    @Test
    fun case_2() {
        val linkedList = listOf(4, 5, 1, 9).asListNode()
        val nodeToDelete = linkedList?.next?.next //1

        deleteNode(nodeToDelete)

        assertEquals(listOf(4, 5, 9).asListNode(), linkedList)
    }
}