import utils.TreeNode
import kotlin.test.Test
import kotlin.test.assertEquals

class `108_Convert_Sorted_Array_to_Binary_Search_Tree` {

    @Test
    fun case_1() {
        val expected = TreeNode(0).apply {
            left = TreeNode(-10).apply {
                right = TreeNode(-3)
            }
            right = TreeNode(5).apply {
                right = TreeNode(9)
            }
        }

        val output = sortedArrayToBST(intArrayOf(-10, -3, 0, 5, 9))

        assertEquals(expected, output)
    }

    @Test
    fun case_2() {
        val expected = TreeNode(1).apply {
            right = TreeNode(3)
        }

        val output = sortedArrayToBST(intArrayOf(1, 3))

        assertEquals(expected, output)
    }
}
