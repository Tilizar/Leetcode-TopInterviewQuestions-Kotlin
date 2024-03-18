import utils.TreeNode
import kotlin.test.Test
import kotlin.test.assertEquals

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
