import utils.TreeNode
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

private fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
    if (root == null || root.`val` == p?.`val` || root.`val` == q?.`val`) {
        return root
    }

    val left = lowestCommonAncestor(root.left, p, q)
    val right = lowestCommonAncestor(root.right, p, q)

    if (left != null && right != null) {
        return root
    }

    return left ?: right
}

class `236_Lowest_Common_Ancestor_of_a_Binary_Tree` {

    @Test
    fun case_1() {
        val tree = TreeNode(3).apply {
            left = TreeNode(5).apply {
                left = TreeNode(6)
                right = TreeNode(2).apply {
                    left = TreeNode(7)
                    right = TreeNode(4)
                }
            }
            right = TreeNode(1).apply {
                left = TreeNode(0)
                right = TreeNode(8)
            }
        }

        val output = lowestCommonAncestor(tree, TreeNode(5), TreeNode(1))

        assertNotNull(output)
        assertEquals(3, output.`val`)
    }

    @Test
    fun case_2() {
        val tree = TreeNode(3).apply {
            left = TreeNode(5).apply {
                left = TreeNode(6)
                right = TreeNode(2).apply {
                    left = TreeNode(7)
                    right = TreeNode(4)
                }
            }
            right = TreeNode(1).apply {
                left = TreeNode(0)
                right = TreeNode(8)
            }
        }

        val output = lowestCommonAncestor(tree, TreeNode(5), TreeNode(4))

        assertNotNull(output)
        assertEquals(5, output.`val`)
    }

    @Test
    fun case_3() {
        val tree = TreeNode(1).apply {
            left = TreeNode(2)
        }

        val output = lowestCommonAncestor(tree, TreeNode(1), TreeNode(2))

        assertNotNull(output)
        assertEquals(1, output.`val`)
    }
}
