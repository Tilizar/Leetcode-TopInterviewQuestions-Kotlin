import utils.TreeNode

fun isSymmetric(root: TreeNode?): Boolean {

    fun compare(left: TreeNode?, right: TreeNode?): Boolean {
        if (left == null && right == null) return true
        if (left == null || right == null) return false
        return left.`val` == right.`val` && compare(left.left, right.right) && compare(left.right, right.left)
    }

    return compare(root?.left, root?.right)
}
