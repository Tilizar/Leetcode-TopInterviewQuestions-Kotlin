import utils.specific.random.Node
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotSame

private fun copyRandomList(node: Node?): Node? {
    val cache = mutableMapOf<Node, Node>()

    var current = node
    while (current != null) {
        cache[current] = Node(current.`val`)
        current = current.next
    }

    current = node
    while (current != null) {
        val copy = cache[current]
        copy?.next = cache[current.next]
        copy?.random = cache[current.random]
        current = current.next
    }

    return cache[node]
}

class `138_Copy_List_with_Random_Pointer` {

    @Test
    fun case_1() {
        val fifth = Node(1).apply { next = null }
        val fourth = Node(10).apply { next = fifth }
        val third = Node(11).apply { next = fourth }
        val second = Node(13).apply { next = third }
        val first = Node(7).apply { next = second }

        first.random = null
        second.random = first
        third.random = fifth
        fourth.random = third
        fifth.random = first

        val output = copyRandomList(first)

        assertNotSame(first, output)
        assertEquals(first, output)
    }

    @Test
    fun case_2() {
        val second = Node(2).apply { next = null }
        val first = Node(1).apply { next = second }

        first.random = second
        second.random = second

        val output = copyRandomList(first)

        assertNotSame(first, output)
        assertEquals(first, output)
    }

    @Test
    fun case_3() {
        val third = Node(3).apply { next = null }
        val second = Node(3).apply { next = third }
        val first = Node(3).apply { next = second }

        first.random = null
        second.random = first
        third.random = null

        val output = copyRandomList(first)

        assertNotSame(first, output)
        assertEquals(first, output)
    }
}
