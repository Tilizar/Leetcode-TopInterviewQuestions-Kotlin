import kotlin.test.Test
import kotlin.test.assertEquals

private fun trailingZeroes(n: Int): Int {
    var output = 0
    var factor = 1
    while (factor <= n) {
        factor *= 5
        output += n / factor
    }
    return output
}

class `172_Factorial_Trailing_Zeroes` {

    @Test
    fun case_1() {
        val output = trailingZeroes(3)

        assertEquals(0, output)
    }

    @Test
    fun case_2() {
        val output = trailingZeroes(5)

        assertEquals(1, output)
    }

    @Test
    fun case_3() {
        val output = trailingZeroes(0)

        assertEquals(0, output)
    }
}
