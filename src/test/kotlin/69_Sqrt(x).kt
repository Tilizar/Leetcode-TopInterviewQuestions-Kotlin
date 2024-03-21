import kotlin.test.Test
import kotlin.test.assertEquals

private fun mySqrt(x: Int): Int {
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

class `69_Sqrt(x)` {

    @Test
    fun case_1() {
        val output = mySqrt(4)

        assertEquals(2, output)
    }

    @Test
    fun case_2() {
        val output = mySqrt(8)

        assertEquals(2, output)
    }
}
