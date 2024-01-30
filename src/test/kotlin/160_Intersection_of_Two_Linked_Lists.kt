import utils.ListNode
import utils.ListNode.Companion.asListNode
import kotlin.test.Test
import kotlin.test.assertEquals

class `160_Intersection_of_Two_Linked_Lists` {

    @Test
    fun case_1() {
        val common = listOf(8, 4, 5).asListNode()

        val first = ListNode(4).apply {
            next = ListNode(1).apply {
                next = common
            }
        }

        val second = ListNode(5).apply {
            next = ListNode(6).apply {
                next = ListNode(1).apply {
                    next = common
                }
            }
        }

        val output = getIntersectionNode(first, second)

        assertEquals(common, output)
    }

    @Test
    fun case_2() {
        val common = listOf(2, 4).asListNode()

        val first = ListNode(1).apply {
            next = ListNode(9).apply {
                next = ListNode(1).apply {
                    next = common
                }
            }
        }

        val second = ListNode(3).apply {
            next = common
        }

        val output = getIntersectionNode(first, second)

        assertEquals(common, output)
    }

    @Test
    fun case_3() {
        val first = ListNode(2).apply {
            next = ListNode(6).apply {
                next = ListNode(4)
            }
        }

        val second = ListNode(1).apply {
            next = ListNode(5)
        }

        val output = getIntersectionNode(first, second)

        assertEquals(null, output)
    }
}
