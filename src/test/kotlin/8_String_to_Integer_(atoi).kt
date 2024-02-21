import kotlin.test.Test
import kotlin.test.assertEquals

class `8_String_to_Integer_(atoi)` {

    @Test
    fun case_1() {
        val output = myAtoi("42")

        assertEquals(42, output)
    }

    @Test
    fun case_2() {
        val output = myAtoi("   -42'")

        assertEquals(-42, output)
    }

    @Test
    fun case_3() {
        val output = myAtoi("4193 with words")

        assertEquals(4193, output)
    }
}
