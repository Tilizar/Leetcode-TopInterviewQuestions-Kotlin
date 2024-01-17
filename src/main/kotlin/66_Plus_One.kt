fun plusOne(digits: IntArray): IntArray {
    for (i in digits.lastIndex downTo 0) {
        val current = digits[i]
        if (current == 9) {
            digits[i] = 0
        } else {
            digits[i] = current + 1
            return digits
        }
    }

    return intArrayOf(1) + digits
}

fun main() {
    assert(intArrayOf(1, 2, 4) contentEquals plusOne(intArrayOf(1, 2, 3)))
    assert(intArrayOf(4, 3, 2, 2) contentEquals plusOne(intArrayOf(4, 3, 2, 1)))
    assert(intArrayOf(1, 0) contentEquals plusOne(intArrayOf(9)))
}
