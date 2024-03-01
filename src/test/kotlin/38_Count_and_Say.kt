import kotlin.test.Test
import kotlin.test.assertEquals

class `38_Count_and_Say` {

    @Test
    fun case_1() {
        val output = countAndSay(1)

        assertEquals("1", output)
    }

    @Test
    fun case_2() {
        val output = countAndSay(4)

        assertEquals("1211", output)
    }
}
