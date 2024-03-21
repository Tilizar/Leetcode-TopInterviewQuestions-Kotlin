import utils.TreeNode
import kotlin.test.Test
import kotlin.test.assertEquals

private fun zigzagLevelOrder(root: TreeNode?): List<List<Int>> {
    if (root == null) return emptyList()

    val output = mutableListOf<List<Int>>()
    val stack = ArrayDeque<TreeNode>()
    stack.addFirst(root)
    var leftToRight = true

    while (stack.isNotEmpty()) {
        val level = mutableListOf<Int>()
        val stackSize = stack.lastIndex
        for (i in stack.indices) {
            val current = stack.removeAt(stackSize - i)
            level.add(current.`val`)
            if (leftToRight) {
                current.left?.let { stack.addLast(it) }
                current.right?.let { stack.addLast(it) }
            } else {
                current.right?.let { stack.addLast(it) }
                current.left?.let { stack.addLast(it) }
            }
        }
        leftToRight = !leftToRight
        if (level.isNotEmpty()) output.add(level)
    }

    return output
}

class `103_Binary_Tree_Zigzag_Level_Order_Traversal` {

    @Test
    fun case_1() {
        val input = TreeNode(3).apply {
            left = TreeNode(9)
            right = TreeNode(20).apply {
                left = TreeNode(15)
                right = TreeNode(7)
            }
        }

        val output = zigzagLevelOrder(input)

        assertEquals(listOf(listOf(3), listOf(20, 9), listOf(15, 7)), output)
    }

    @Test
    fun case_2() {
        val output = zigzagLevelOrder(TreeNode(1))

        assertEquals(listOf(listOf(1)), output)
    }

    @Test
    fun case_3() {
        val output = zigzagLevelOrder(null)

        assertEquals(listOf(), output)
    }
}
