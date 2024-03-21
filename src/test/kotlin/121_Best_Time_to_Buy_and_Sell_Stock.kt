import kotlin.math.max
import kotlin.test.Test
import kotlin.test.assertEquals

private fun maxProfit(prices: IntArray): Int {
    var buyIndex = 0
    var sellIndex = 1

    var profit = 0

    while (sellIndex < prices.size) {
        val buyPrice = prices[buyIndex]
        val sellPrice = prices[sellIndex]

        if (buyPrice < sellPrice) {
            profit = max(profit, sellPrice - buyPrice)
        } else {
            buyIndex = sellIndex
        }
        sellIndex++
    }

    return profit
}

class `121_Best_Time_to_Buy_and_Sell_Stock` {

    @Test
    fun case_1() {
        val output = maxProfit(intArrayOf(7, 1, 5, 3, 6, 4))
        assertEquals(5, output)
    }

    @Test
    fun case_2() {
        val output = maxProfit(intArrayOf(7, 6, 4, 3, 1))
        assertEquals(0, output)
    }
}
