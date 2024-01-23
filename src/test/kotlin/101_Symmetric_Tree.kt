import utils.TreeNode
import kotlin.test.Test
import kotlin.test.assertEquals

class `101_Symmetric_Tree` {

    @Test
    fun case_1() {
        val input = TreeNode(1).apply {
            left = TreeNode(2).apply {
                left = TreeNode(3)
                right = TreeNode(4)
            }
            right = TreeNode(2).apply {
                left = TreeNode(4)
                right = TreeNode(3)
            }
        }

        val output = isSymmetric(input)

        assertEquals(true, output)
    }

    @Test
    fun case_2() {
        val input = TreeNode(1).apply {
            left = TreeNode(2).apply {
                right = TreeNode(3)
            }
            right = TreeNode(2).apply {
                right = TreeNode(3)
            }
        }

        val output = isSymmetric(input)

        assertEquals(false, output)
    }
}
