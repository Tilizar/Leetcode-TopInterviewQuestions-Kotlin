import kotlin.test.Test
import kotlin.test.assertEquals

private fun myAtoi(s: String): Int {

    fun Char.isSign() = this == '-' || this == '+'

    val maxExceptLastDigit = Int.MAX_VALUE / 10
    val lastDigitForMax = Int.MAX_VALUE % 10

    var number = 0

    var index = 0

    var isStarted = false
    var isPositive = true

    while (index < s.length) {
        val c = s[index]

        when {
            c.isWhitespace() -> {
                if (isStarted) break
            }

            c.isSign() -> {
                if (isStarted) break
                isStarted = true
                isPositive = c != '-'
            }

            c.isDigit() -> {
                isStarted = true

                val digit = c.digitToInt()

                if (number > maxExceptLastDigit || (number == maxExceptLastDigit && digit > lastDigitForMax)) {
                    return if (isPositive) Int.MAX_VALUE else Int.MIN_VALUE
                }

                number = number * 10 + digit
            }

            else -> break
        }

        index++
    }

    return if (isPositive) number else number * -1
}

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
