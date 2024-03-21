import kotlin.math.abs
import kotlin.math.round
import kotlin.test.Test
import kotlin.test.assertEquals

private fun myPow(x: Double, n: Int): Double {
    var power = n
    var base = x
    var output = 1.0

    if (power < 0) {
        power = if (power == Int.MIN_VALUE) Int.MAX_VALUE else abs(power)
        val baseIsNegative = base < 0
        base = 1 / base
        if (baseIsNegative) {
            base *= -1
        }
    }

    while (power > 0) {
        if (power % 2 != 0) {
            output *= base
        }
        base *= base
        power /= 2
    }

    return output
}

class `50_Pow(x, n)` {

    @Test
    fun case_1() {
        val output = myPow(2.0, 10)

        assertEquals(1024.0, output)
    }

    @Test
    fun case_2() {
        val output = round(myPow(2.1, 3) * 1000) / 1000

        assertEquals(9.261, output)
    }

    @Test
    fun case_3() {
        val output = myPow(2.0, -2)

        assertEquals(0.25, output)
    }

    @Test
    fun case_4() {
        val output = myPow(-1.0, -2147483648)

        assertEquals(1.0, output)
    }
}
