import kotlin.math.abs
import kotlin.test.Test
import kotlin.test.assertEquals

private fun divide(dividend: Int, divisor: Int): Int {
    if (dividend == Int.MIN_VALUE && divisor == -1) return Int.MAX_VALUE

    val isNegative = (dividend < 0) xor (divisor < 0)
    var result = 0
    var absDividend = abs(dividend)
    val absDivisor = abs(divisor)

    while (absDividend - absDivisor >= 0) {
        var counter = 0
        while (absDividend - (absDivisor shl 1 shl counter) >= 0) {
            counter++
        }
        result += 1 shl counter
        absDividend -= absDivisor shl counter
    }

    return if (isNegative) -result else result
}

class `29_Divide_Two_Integers` {

    @Test
    fun case_1() {
        val output = divide(10, 3)

        assertEquals(3, output)
    }

    @Test
    fun case_2() {
        val output = divide(7, -3)

        assertEquals(-2, output)
    }
}
