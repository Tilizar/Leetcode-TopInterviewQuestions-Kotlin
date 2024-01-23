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
