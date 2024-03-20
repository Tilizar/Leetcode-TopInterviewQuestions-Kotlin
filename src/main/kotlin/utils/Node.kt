package utils

class Node(var `val`: Int) {
    var left: Node? = null
    var right: Node? = null
    var next: Node? = null

    override fun hashCode(): Int {
        return 31 * `val` + 31 * left.hashCode() + 31 * right.hashCode() + 31 * next.hashCode()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Node) return false
        return `val` == other.`val` && left == other.left && right == other.right && next == other.next
    }
}
