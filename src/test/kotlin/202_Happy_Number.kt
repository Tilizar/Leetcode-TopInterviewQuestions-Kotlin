import kotlin.test.Test
import kotlin.test.assertEquals

private fun isHappy(n: Int): Boolean {
    var current = n
    val cache = mutableSetOf<Int>()

    fun Int.extractDigits(): List<Int> {
        var num = this
        val output = mutableListOf<Int>()
        while (num != 0) {
            output.add(num % 10)
            num /= 10
        }
        return output
    }

    while (true) {
        current = current.extractDigits().sumOf { it * it }
        if (cache.contains(current)) {
            return false
        }
        cache.add(current)
        if (current == 1) {
            return true
        }
    }
}

class `202_Happy_Number` {

    @Test
    fun case_1() {
        val output = isHappy(19)

        assertEquals(true, output)
    }

    @Test
    fun case_2() {
        val output = isHappy(2)

        assertEquals(false, output)
    }
}
