import utils.TreeNode
import java.util.*
import kotlin.test.Test
import kotlin.test.assertEquals

private fun kthSmallest(root: TreeNode?, k: Int): Int {
    val queue = PriorityQueue<Int>(k + 1) { o1, o2 -> -o1.compareTo(o2) }

    fun traverse(node: TreeNode) {
        node.left?.let { traverse(it) }
        queue.add(node.`val`)
        if (queue.size > k) queue.poll()
        node.right?.let { traverse(it) }
    }

    root?.let { traverse(it) }

    return queue.poll()
}

class `230_Kth_Smallest_Element_in_a_BST` {

    @Test
    fun case_1() {
        val input = TreeNode(3).apply {
            left = TreeNode(1).apply {
                right = TreeNode(2)
            }
            right = TreeNode(4)
        }

        val output = kthSmallest(input, 1)

        assertEquals(1, output)
    }

    @Test
    fun case_2() {
        val input = TreeNode(5).apply {
            left = TreeNode(3).apply {
                left = TreeNode(2).apply {
                    left = TreeNode(1)
                }
                right = TreeNode(4)
            }
            right = TreeNode(6)
        }

        val output = kthSmallest(input, 3)

        assertEquals(3, output)
    }
}
