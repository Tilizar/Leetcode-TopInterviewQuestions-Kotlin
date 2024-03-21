import kotlin.test.Test
import kotlin.test.assertContentEquals

private fun plusOne(digits: IntArray): IntArray {
    for (i in digits.lastIndex downTo 0) {
        val current = digits[i]
        if (current == 9) {
            digits[i] = 0
        } else {
            digits[i] = current + 1
            return digits
        }
    }

    return intArrayOf(1) + digits
}

class `66_Plus_One` {

    @Test
    fun case_1() {
        val output = plusOne(intArrayOf(1, 2, 3))

        assertContentEquals(intArrayOf(1, 2, 4), output)
    }

    @Test
    fun case_2() {
        val output = plusOne(intArrayOf(4, 3, 2, 1))

        assertContentEquals(intArrayOf(4, 3, 2, 2), output)
    }

    @Test
    fun case_3() {
        val output = plusOne(intArrayOf(9))

        assertContentEquals(intArrayOf(1, 0), output)
    }
}
