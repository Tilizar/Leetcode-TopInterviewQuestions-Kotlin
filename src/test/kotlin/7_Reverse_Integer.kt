import kotlin.test.Test
import kotlin.test.assertEquals

private fun reverse(x: Int): Int {
    var input = x
    var output = 0

    val min = Int.MIN_VALUE / 10
    val max = Int.MAX_VALUE / 10

    while (input != 0) {
        if (output !in (min..max)) return 0

        val digit = input % 10
        output = output * 10 + digit
        input /= 10
    }

    return output
}

class `7_Reverse_Integer` {

    @Test
    fun case_1() {
        val output = reverse(123)

        assertEquals(321, output)
    }

    @Test
    fun case_2() {
        val output = reverse(-123)

        assertEquals(-321, output)
    }

    @Test
    fun case_3() {
        val output = reverse(120)

        assertEquals(21, output)
    }
}
