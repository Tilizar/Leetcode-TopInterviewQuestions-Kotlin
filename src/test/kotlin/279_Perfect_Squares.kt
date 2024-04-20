import kotlin.math.min
import kotlin.test.Test
import kotlin.test.assertEquals

private fun numSquares(n: Int): Int {
    val cache = IntArray(n + 1) { it }

    for (i in cache.indices) {
        for (j in 0..<i) {
            val squared = j * j
            if (i < squared) break
            cache[i] = min(cache[i], cache[i - squared] + 1)
        }
    }

    return cache[n]
}

class `279_Perfect_Squares` {

    @Test
    fun case_1() {
        val output = numSquares(12)

        assertEquals(3, output)
    }

    @Test
    fun case_2() {
        val output = numSquares(13)

        assertEquals(2, output)
    }
}
