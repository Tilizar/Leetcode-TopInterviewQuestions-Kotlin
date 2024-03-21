import utils.TreeNode
import kotlin.test.Test
import kotlin.test.assertEquals

private fun sortedArrayToBST(nums: IntArray): TreeNode? {

    fun populate(leftIndex: Int, rightIndex: Int): TreeNode? {
        if (leftIndex > rightIndex) return null
        val midIndex = leftIndex + ((rightIndex - leftIndex) / 2)
        return TreeNode(nums[midIndex]).apply {
            left = populate(leftIndex, midIndex - 1)
            right = populate(midIndex + 1, rightIndex)
        }
    }

    return populate(0, nums.lastIndex)
}

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
