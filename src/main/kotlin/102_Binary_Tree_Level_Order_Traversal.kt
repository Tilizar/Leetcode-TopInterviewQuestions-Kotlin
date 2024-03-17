import utils.TreeNode

fun levelOrder(root: TreeNode?): List<List<Int>> {
    if (root == null) return emptyList()

    val output = mutableListOf<List<Int>>()
    val stack = ArrayDeque<TreeNode?>()
    stack.addFirst(root)

    while (stack.isNotEmpty()) {
        val level = mutableListOf<Int>()
        for (i in stack.indices) {
            val current = stack.removeFirst() ?: continue
            level.add(current.`val`)
            stack.addLast(current.left)
            stack.addLast(current.right)
        }
        if (level.isNotEmpty()) output.add(level)
    }

    return output
}
