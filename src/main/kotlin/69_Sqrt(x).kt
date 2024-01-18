fun mySqrt(x: Int): Int {
    if (x == 0) return 0
    if (x == 1) return 1
    var value = 0
    var left = 0
    var right = x

    while (left <= right) {
        val mid = left + ((right - left) / 2)
        when {
            mid > x / mid -> right = mid - 1
            mid < x / mid -> {
                left = mid + 1
                value = mid
            }
            else -> return mid
        }
    }

    return value
}

fun main() {
    assert(2 == mySqrt(4))
    assert(2 == mySqrt(8))
}
