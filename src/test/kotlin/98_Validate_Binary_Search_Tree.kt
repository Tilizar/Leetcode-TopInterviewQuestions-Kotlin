import utils.TreeNode
import kotlin.test.Test
import kotlin.test.assertEquals

private fun isValidBST(root: TreeNode?): Boolean {

    fun validate(node: TreeNode?, bottom: Int, top: Int): Boolean {
        if (node == null) return true
        if (top < bottom) return false
        return node.`val` in bottom..top &&
                (node.left?.let { node.`val` > Int.MIN_VALUE && validate(it, bottom, node.`val` - 1) } ?: true) &&
                (node.right?.let { node.`val` < Int.MAX_VALUE && validate(it, node.`val` + 1, top) } ?: true)
    }

    return validate(root, Int.MIN_VALUE, Int.MAX_VALUE)
}

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
