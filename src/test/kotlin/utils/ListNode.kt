package utils

class ListNode(var `val`: Int) {
    var next: ListNode? = null
    override fun toString(): String {
        return "{ $`val`; next = $next }"
    }

    override fun hashCode(): Int {
        return 31 * `val` + 31 * next.hashCode()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ListNode) return false
        return `val` == other.`val` && next == other.next
    }

    companion object {
        fun List<Int>.asListNode(): ListNode? {
            val dummy = ListNode(-1)
            var pointer: ListNode? = dummy
            forEach {
                pointer?.next = ListNode(it)
                pointer = pointer?.next
            }
            return dummy.next
        }
    }
}
