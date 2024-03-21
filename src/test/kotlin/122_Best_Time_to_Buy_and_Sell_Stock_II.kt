import kotlin.test.Test
import kotlin.test.assertEquals

class `122_Best_Time_to_Buy_and_Sell_Stock_II` {

    @Test
    fun case_1() {
        val output = maxProfit2(intArrayOf(7, 1, 5, 3, 6, 4))
        assertEquals(7, output)
    }

    @Test
    fun case_2() {
        val output = maxProfit2(intArrayOf(1, 2, 3, 4, 5))
        assertEquals(4, output)
    }

    @Test
    fun case_3() {
        val output = maxProfit2(intArrayOf(7, 6, 4, 3, 1))
        assertEquals(0, output)
    }
}
