import utils.TreeNode

fun zigzagLevelOrder(root: TreeNode?): List<List<Int>> {
    if (root == null) return emptyList()

    val output = mutableListOf<List<Int>>()
    val stack = ArrayDeque<TreeNode>()
    stack.addFirst(root)
    var leftToRight = true

    while (stack.isNotEmpty()) {
        val level = mutableListOf<Int>()
        val stackSize = stack.lastIndex
        for (i in stack.indices) {
            val current = stack.removeAt(stackSize - i)
            level.add(current.`val`)
            if (leftToRight) {
                current.left?.let { stack.addLast(it) }
                current.right?.let { stack.addLast(it) }
            } else {
                current.right?.let { stack.addLast(it) }
                current.left?.let { stack.addLast(it) }
            }
        }
        leftToRight = !leftToRight
        if (level.isNotEmpty()) output.add(level)
    }

    return output
}
