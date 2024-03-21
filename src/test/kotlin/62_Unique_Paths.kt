import kotlin.test.Test
import kotlin.test.assertEquals

private fun uniquePaths(m: Int, n: Int): Int {
    val cache = mutableMapOf<Pair<Int, Int>, Int>()

    fun calculate(down: Int, right: Int): Int {
        if (down == m && right == n) {
            return 1
        }

        val key = Pair(down, right)

        if (cache.containsKey(key)) {
            return cache[key]!!
        }

        val downValue = if (down < m) calculate(down + 1, right) else 0
        val rightValue = if (right < n) calculate(down, right + 1) else 0

        cache[key] = downValue + rightValue

        return cache[key]!!
    }

    return calculate(1, 1)
}

class `62_Unique_Paths` {

    @Test
    fun case_1() {
        val output = uniquePaths(3, 7)

        assertEquals(28, output)
    }

    @Test
    fun case_2() {
        val output = uniquePaths(3, 2)

        assertEquals(3, output)
    }
}
