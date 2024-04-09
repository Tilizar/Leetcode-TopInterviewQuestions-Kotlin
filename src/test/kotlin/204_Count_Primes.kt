import kotlin.math.sqrt
import kotlin.test.Test
import kotlin.test.assertEquals

private fun countPrimes(n: Int): Int {
    if (n <= 2) return 0
    val array = Array(n) { true }
    array[0] = false
    array[1] = false
    val limit = sqrt(n.toDouble()).toInt()

    for (i in 2..limit) {
        if (!array[i]) continue
        var j = i * i
        while (j < n) {
            array[j] = false
            j += i
        }
    }

    return array.count { it }
}

class `204_Count_Primes` {

    @Test
    fun case_1() {
        val output = countPrimes(10)

        assertEquals(4, output)
    }

    @Test
    fun case_2() {
        val output = countPrimes(0)

        assertEquals(0, output)
    }

    @Test
    fun case_3() {
        val output = countPrimes(1)

        assertEquals(0, output)
    }
}
