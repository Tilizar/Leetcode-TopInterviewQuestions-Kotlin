import utils.Node

fun connect(root: Node?): Node? {
    if (root == null) return null

    val stack = ArrayDeque<Node?>()
    stack.addFirst(root)

    while (stack.isNotEmpty()) {
        var prev: Node? = null
        for (i in stack.indices) {
            val current = stack.removeFirst() ?: continue
            prev?.next = current
            prev = current
            stack.addLast(current.left)
            stack.addLast(current.right)
        }
    }

    return root
}
