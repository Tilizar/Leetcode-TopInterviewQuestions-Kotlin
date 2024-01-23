import utils.TreeNode

fun inorderTraversal(root: TreeNode?): List<Int> {
    val acc = mutableListOf<Int>()

    fun traverse(node: TreeNode) {
        node.left?.let { traverse(it) }
        acc.add(node.`val`)
        node.right?.let { traverse(it) }
    }

    root?.let { traverse(it) }

    return acc
}
