import kotlin.test.Test
import kotlin.test.assertEquals

private fun hammingWeight(n: Int): Int {
    var output = 0

    repeat(32) {
        val bit = (n shr it) and 1
        if (bit == 1) {
            output++
        }
    }

    return output
}

class `191_Number_of_1_Bits` {

    @Test
    fun case_1() {
        val output = hammingWeight(11)

        assertEquals(3, output)
    }

    @Test
    fun case_2() {
        val output = hammingWeight(128)

        assertEquals(1, output)
    }

    @Test
    fun case_3() {
        val output = hammingWeight(-3)

        assertEquals(31, output)
    }
}
