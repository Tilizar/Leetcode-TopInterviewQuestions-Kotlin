import kotlin.test.Test
import kotlin.test.assertEquals

class `13_Roman_to_Integer` {

    @Test
    fun case_1() {
        val output = romanToInt("III")
        assertEquals(3, output)
    }

    @Test
    fun case_2() {
        val output = romanToInt("LVIII")
        assertEquals(58, output)
    }

    @Test
    fun case_3() {
        val output = romanToInt("MCMXCIV")
        assertEquals(1994, output)
    }
}
