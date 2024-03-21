import utils.TreeNode
import kotlin.math.max
import kotlin.test.Test
import kotlin.test.assertEquals

private fun maxDepth(root: TreeNode?): Int {
    if (root == null) return 0
    return max(maxDepth(root.left), maxDepth(root.right)) + 1
}

class `104_Maximum_Depth_of_Binary_Tree` {

    @Test
    fun case_1() {
        val input = TreeNode(3).apply {
            left = TreeNode(9)
            right = TreeNode(20).apply {
                left = TreeNode(15)
                right = TreeNode(7)
            }
        }

        val output = maxDepth(input)

        assertEquals(3, output)
    }

    @Test
    fun case_2() {
        val input = TreeNode(1).apply {
            right = TreeNode(2)
        }

        val output = maxDepth(input)

        assertEquals(2, output)
    }
}
