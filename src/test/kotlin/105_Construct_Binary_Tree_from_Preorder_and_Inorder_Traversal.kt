import utils.TreeNode
import kotlin.test.Test
import kotlin.test.assertEquals

class `105_Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal` {

    @Test
    fun case_1() {
        val output = buildTree(intArrayOf(3, 9, 20, 15, 7), intArrayOf(9, 3, 15, 20, 7))

        val expected = TreeNode(3).apply {
            left = TreeNode(9)
            right = TreeNode(20).apply {
                left = TreeNode(15)
                right = TreeNode(7)
            }
        }

        assertEquals(expected, output)
    }

    @Test
    fun case_2() {
        val output = buildTree(intArrayOf(-1), intArrayOf(-1))

        assertEquals(TreeNode(-1), output)
    }
}
