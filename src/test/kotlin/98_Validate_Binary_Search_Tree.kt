import utils.TreeNode
import kotlin.test.Test
import kotlin.test.assertEquals

class `98_Validate_Binary_Search_Tree` {

    @Test
    fun case_1() {
        val input = TreeNode(2).apply {
            left = TreeNode(1)
            right = TreeNode(3)
        }

        val output = isValidBST(input)

        assertEquals(true, output)
    }

    @Test
    fun case_2() {
        val input = TreeNode(5).apply {
            left = TreeNode(1)
            right = TreeNode(4).apply {
                left = TreeNode(3)
                right = TreeNode(6)
            }
        }

        val output = isValidBST(input)

        assertEquals(false, output)
    }

    @Test
    fun case_3() {
        val input = TreeNode(Int.MIN_VALUE).apply {
            left = TreeNode(Int.MIN_VALUE)
        }

        val output = isValidBST(input)

        assertEquals(false, output)
    }
}
