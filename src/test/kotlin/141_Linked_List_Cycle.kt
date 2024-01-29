import utils.ListNode
import kotlin.test.Test
import kotlin.test.assertEquals

class `141_Linked_List_Cycle` {

    @Test
    fun case_1() {
        val lastCycleNode = ListNode(-4)
        val cycleNode = ListNode(2).apply {
            next = ListNode(0).apply {
                next = lastCycleNode
            }
        }
        lastCycleNode.next = cycleNode
        val input = ListNode(3).apply {
            next = cycleNode
        }

        val output = hasCycle(input)

        assertEquals(true, output)
    }

    @Test
    fun case_2() {
        val lastCycleNode = ListNode(2)
        val cycleNode = ListNode(1).apply {
            next = lastCycleNode
        }
        lastCycleNode.next = cycleNode

        val output = hasCycle(cycleNode)

        assertEquals(true, output)
    }

    @Test
    fun case_3() {
        val input = ListNode(1)

        val output = hasCycle(input)

        assertEquals(false, output)
    }
}
