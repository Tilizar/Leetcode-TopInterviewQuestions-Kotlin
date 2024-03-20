import utils.Node
import kotlin.test.Test
import kotlin.test.assertEquals

class `116_Populating_Next_Right_Pointers_in_Each_Node` {

    @Test
    fun case_1() {
        val input = Node(1).apply {
            left = Node(2).apply {
                left = Node(4)
                right = Node(5)
            }
            right = Node(3).apply {
                left = Node(6)
                right = Node(7)
            }
        }
        val output = connect(input)

        val node7 = Node(7)
        val node6 = Node(6).apply {
            next = node7
        }
        val node5 = Node(5).apply {
            next = node6
        }
        val node4 = Node(4).apply {
            next = node5
        }
        val node3 = Node(3).apply {
            left = node6
            right = node7
        }
        val node2 = Node(2).apply {
            next = node3
            left = node4
            right = node5
        }
        val expected = Node(1).apply {
            left = node2
            right = node3
        }

        assertEquals(expected, output)
    }

    @Test
    fun case_2() {
        val output = connect(null)

        assertEquals(null, output)
    }
}
