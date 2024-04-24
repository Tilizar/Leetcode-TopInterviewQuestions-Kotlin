import kotlin.math.min
import kotlin.test.Test
import kotlin.test.assertEquals

private fun coinChange(coins: IntArray, amount: Int): Int {
    if (amount == 0) return 0

    val cache = mutableMapOf<Int, Int>()

    fun calculate(sum: Int): Int {
        if (sum == 0) return 0
        if (sum < 0) return -1
        if (cache.containsKey(sum)) return cache[sum]!!

        var min = -1
        for (coin in coins) {
            if (coin > sum) continue
            val newAmount = sum - coin

            val result = calculate(newAmount)
            if (result == -1) continue

            min = if (min == -1) 1 + result else min(min, 1 + result)
        }

        cache[sum] = min

        return min
    }

    calculate(amount)

    return cache[amount]!!
}

class `322_Coin_Change` {

    @Test
    fun case_1() {
        val output = coinChange(intArrayOf(1, 2, 5), 11)

        assertEquals(3, output)
    }

    @Test
    fun case_2() {
        val output = coinChange(intArrayOf(2), 3)

        assertEquals(-1, output)
    }

    @Test
    fun case_3() {
        val output = coinChange(intArrayOf(1), 0)

        assertEquals(0, output)
    }
}
