import kotlin.test.Test
import kotlin.test.assertEquals

private fun isPowerOfThree(n: Int): Boolean {
    var current: Double = n.toDouble()

    while (true) {
        if (current <= 0) return false
        if (current == 1.0 || current == 3.0) return true
        current /= 3
    }
}

class `326_Power_of_Three` {

    @Test
    fun case_1() {
        val output = isPowerOfThree(27)

        assertEquals(true, output)
    }

    @Test
    fun case_2() {
        val output = isPowerOfThree(0)

        assertEquals(false, output)
    }

    @Test
    fun case_3() {
        val output = isPowerOfThree(-1)

        assertEquals(false, output)
    }
}
