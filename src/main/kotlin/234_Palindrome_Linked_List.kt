import utils.ListNode

fun isPalindrome(head: ListNode?): Boolean {
    val cache = mutableListOf<Int>()

    var pointer = head
    while (pointer != null) {
        cache.add(pointer.`val`)
        pointer = pointer.next
    }

    var left = 0
    var right = cache.lastIndex

    while (left <= right) {
        if (cache[left] != cache[right]) {
            return false
        }
        left++
        right--
    }

    return true
}
