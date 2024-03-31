import kotlin.test.Test
import kotlin.test.assertEquals

private fun maxProduct(nums: IntArray): Int {
    var output = nums.first()
    var max = output
    var min = output

    for (i in 1..nums.lastIndex) {
        val num = nums[i]
        val newMax = max * num
        val newMin = min * num
        max = maxOf(newMax, newMin, num)
        min = minOf(newMax, newMin, num)
        output = maxOf(output, max)
    }

    return output
}

class `152_Maximum_Product_Subarray` {

    @Test
    fun case_1() {
        val output = maxProduct(intArrayOf(2, 3, -2, 4))

        assertEquals(6, output)
    }

    @Test
    fun case_2() {
        val output = maxProduct(intArrayOf(-2, 0, -1))

        assertEquals(0, output)
    }
}
