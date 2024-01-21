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

fun main() {
    val tree = TreeNode(1).apply {
        right = TreeNode(2).apply {
            left = TreeNode(3)
        }
    }
    assert(listOf(1, 3, 2) == inorderTraversal(tree))
}
