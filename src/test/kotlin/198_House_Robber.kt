import kotlin.math.max
import kotlin.test.Test
import kotlin.test.assertEquals

private fun rob(nums: IntArray): Int {
    var prev = 0
    var beforePrev = 0

    for (num in nums) {
        val newMax = max(num + beforePrev, prev)
        beforePrev = prev
        prev = newMax
    }

    return prev
}

class `198_House_Robber` {

    @Test
    fun case_1() {
        val output = rob(intArrayOf(1, 2, 3, 1))

        assertEquals(4, output)
    }

    @Test
    fun case_2() {
        val output = rob(intArrayOf(2, 7, 9, 3, 1))

        assertEquals(12, output)
    }
}
