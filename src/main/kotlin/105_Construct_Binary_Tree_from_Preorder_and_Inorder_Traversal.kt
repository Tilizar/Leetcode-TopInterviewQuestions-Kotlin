import utils.TreeNode

fun buildTree(preorder: IntArray, inorder: IntArray): TreeNode? {
    if (preorder.isEmpty()) return null

    val root = TreeNode(preorder.first())

    val rootIndexInorder = inorder.indexOf(preorder.first())
    val leftSubtreeSize = rootIndexInorder + 1

    root.left = buildTree(
        preorder.copyOfRange(1, leftSubtreeSize),
        inorder.copyOfRange(0, rootIndexInorder)
    )
    root.right = buildTree(
        preorder.copyOfRange(leftSubtreeSize, preorder.size),
        inorder.copyOfRange(rootIndexInorder + 1, inorder.size)
    )

    return root
}
