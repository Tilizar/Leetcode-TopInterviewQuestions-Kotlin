import kotlin.math.abs
import kotlin.test.Test
import kotlin.test.assertEquals

private fun fractionToDecimal(numerator: Int, denominator: Int): String {
    if (numerator == 0) return "0"
    val output = StringBuilder()
    if ((numerator < 0) xor (denominator < 0)) output.append('-')
    var absNumerator = abs(numerator.toLong())
    val absDenominator = abs(denominator.toLong())

    output.append(absNumerator / absDenominator)
    absNumerator %= absDenominator
    if (absNumerator == 0L) return output.toString()

    output.append('.')
    val cache = mutableMapOf<Long, Int>()
    cache[absNumerator] = output.length
    while (absNumerator != 0L) {
        absNumerator *= 10
        output.append(absNumerator / absDenominator)
        absNumerator %= absDenominator
        if (!cache.containsKey(absNumerator)) {
            cache[absNumerator] = output.length
        } else {
            output.insert(cache[absNumerator]!!, '(')
            output.append(')')
            break
        }
    }

    return output.toString()
}

class `166_Fraction_to_Recurring_Decimal` {

    @Test
    fun case_1() {
        val output = fractionToDecimal(1, 2)

        assertEquals("0.5", output)
    }

    @Test
    fun case_2() {
        val output = fractionToDecimal(2, 1)

        assertEquals("2", output)
    }

    @Test
    fun case_3() {
        val output = fractionToDecimal(4, 333)

        assertEquals("0.(012)", output)
    }
}
