import utils.TreeNode
import kotlin.test.Test
import kotlin.test.assertContentEquals

private fun inorderTraversal(root: TreeNode?): List<Int> {
    val acc = mutableListOf<Int>()

    fun traverse(node: TreeNode) {
        node.left?.let { traverse(it) }
        acc.add(node.`val`)
        node.right?.let { traverse(it) }
    }

    root?.let { traverse(it) }

    return acc
}

class `94_Binary_Tree_Inorder_Traversal` {

    @Test
    fun case_1() {
        val input = TreeNode(1).apply {
            right = TreeNode(2).apply {
                left = TreeNode(3)
            }
        }

        val output = inorderTraversal(input)

        assertContentEquals(listOf(1, 3, 2), output)
    }
}