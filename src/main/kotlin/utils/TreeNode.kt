package utils

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null

    override fun hashCode(): Int {
        return 31 * `val` + 31 * left.hashCode() + 31 * right.hashCode()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TreeNode) return false
        return `val` == other.`val` && left == other.left && right == other.right
    }
}
