package utils.specific.random

class Node(var `val`: Int) {
    var next: Node? = null
    var random: Node? = null

    override fun hashCode(): Int {
        return 31 * `val` + 31 * next.hashCode()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Node) return false
        return `val` == other.`val` && next == other.next
    }
}
