import kotlin.test.Test
import kotlin.test.assertEquals

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
