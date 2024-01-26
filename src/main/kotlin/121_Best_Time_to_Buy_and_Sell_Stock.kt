import kotlin.math.max

fun maxProfit(prices: IntArray): Int {
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
