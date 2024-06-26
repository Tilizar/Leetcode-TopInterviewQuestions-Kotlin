import utils.TreeNode
import kotlin.test.Test
import kotlin.test.assertEquals

private fun levelOrder(root: TreeNode?): List<List<Int>> {
    if (root == null) return emptyList()

    val output = mutableListOf<List<Int>>()
    val stack = ArrayDeque<TreeNode?>()
    stack.addFirst(root)

    while (stack.isNotEmpty()) {
        val level = mutableListOf<Int>()
        for (i in stack.indices) {
            val current = stack.removeFirst() ?: continue
            level.add(current.`val`)
            stack.addLast(current.left)
            stack.addLast(current.right)
        }
        if (level.isNotEmpty()) output.add(level)
    }

    return output
}

class `102_Binary_Tree_Level_Order_Traversal` {

    @Test
    fun case_1() {
        val input = TreeNode(3).apply {
            left = TreeNode(9)
            right = TreeNode(20).apply {
                left = TreeNode(15)
                right = TreeNode(7)
            }
        }

        val output = levelOrder(input)

        assertEquals(listOf(listOf(3), listOf(9, 20), listOf(15, 7)), output)
    }

    @Test
    fun case_2() {
        val output = levelOrder(TreeNode(1))

        assertEquals(listOf(listOf(1)), output)
    }

    @Test
    fun case_3() {
        val output = levelOrder(null)

        assertEquals(listOf(), output)
    }
}
