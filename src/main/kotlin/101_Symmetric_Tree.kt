import utils.TreeNode

fun isSymmetric(root: TreeNode?): Boolean {

    fun compare(left: TreeNode?, right: TreeNode?): Boolean {
        if (left == null && right == null) return true
        if (left == null || right == null) return false
        return left.`val` == right.`val` && compare(left.left, right.right) && compare(left.right, right.left)
    }

    return compare(root?.left, root?.right)
}

fun main() {
    val first = TreeNode(1).apply {
        left = TreeNode(2).apply {
            left = TreeNode(3)
            right = TreeNode(4)
        }
        right = TreeNode(2).apply {
            left = TreeNode(4)
            right = TreeNode(3)
        }
    }
    assert(isSymmetric(first))

    val second = TreeNode(1).apply {
        left = TreeNode(2).apply {
            right = TreeNode(3)
        }
        right = TreeNode(2).apply {
            right = TreeNode(3)
        }
    }

    assert(!isSymmetric(second))
}
