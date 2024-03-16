import utils.TreeNode

fun isValidBST(root: TreeNode?): Boolean {

    fun validate(node: TreeNode?, bottom: Int, top: Int): Boolean {
        if (node == null) return true
        if (top < bottom) return false
        return node.`val` in bottom..top &&
                (node.left?.let { node.`val` > Int.MIN_VALUE && validate(it, bottom, node.`val` - 1) } ?: true) &&
                (node.right?.let { node.`val` < Int.MAX_VALUE && validate(it, node.`val` + 1, top) } ?: true)
    }

    return validate(root, Int.MIN_VALUE, Int.MAX_VALUE)
}
