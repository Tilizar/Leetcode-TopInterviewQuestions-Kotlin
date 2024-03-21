import kotlin.test.Test
import kotlin.test.assertEquals

private fun missingNumber(nums: IntArray): Int {
    var result = nums.size

    (0..nums.lastIndex).forEach {
        result += (it - nums[it])
    }

    return result
}

class `268_Missing_Number` {

    @Test
    fun case_1() {
        val output = missingNumber(intArrayOf(3, 0, 1))

        assertEquals(2, output)
    }

    @Test
    fun case_2() {
        val output = missingNumber(intArrayOf(0, 1))

        assertEquals(2, output)
    }

    @Test
    fun case_3() {
        val output = missingNumber(intArrayOf(9, 6, 4, 2, 3, 5, 7, 0, 1))

        assertEquals(8, output)
    }
}
