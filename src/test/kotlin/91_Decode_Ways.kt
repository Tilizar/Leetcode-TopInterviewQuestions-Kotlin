import kotlin.test.Test
import kotlin.test.assertEquals

class `91_Decode_Ways` {

    @Test
    fun case_1() {
        val output = numDecodings("12")

        assertEquals(2, output)
    }

    @Test
    fun case_2() {
        val output = numDecodings("226")

        assertEquals(3, output)
    }

    @Test
    fun case_3() {
        val output = numDecodings("06")

        assertEquals(0, output)
    }
}
