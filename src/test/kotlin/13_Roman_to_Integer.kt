import kotlin.test.Test
import kotlin.test.assertEquals

private fun romanToInt(s: String): Int {
    val romanToInt = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

    var sum = 0

    s.forEachIndexed { index, c ->
        val current = romanToInt[c]!!
        val next = if (index + 1 < s.length) romanToInt[s[index + 1]] else null

        if (next != null && current < next) {
            sum -= current
        } else {
            sum += current
        }
    }

    return sum
}

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
