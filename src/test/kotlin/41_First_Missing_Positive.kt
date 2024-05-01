import kotlin.math.abs
import kotlin.test.Test
import kotlin.test.assertEquals

private fun firstMissingPositive(nums: IntArray): Int {
    for (i in nums.indices) {
        if (nums[i] < 0) nums[i] = 0
    }

    for (i in nums.indices) {
        val realIndex = abs(nums[i]) - 1
        if (realIndex !in 0..nums.lastIndex) continue
        if (nums[realIndex] > 0) {
            nums[realIndex] *= -1
        } else if (nums[realIndex] == 0) {
            nums[realIndex] = Int.MIN_VALUE
        }
    }

    for (i in nums.indices) {
        if (nums[i] >= 0) return i + 1
    }

    return nums.size + 1
}

class `41_First_Missing_Positive` {

    @Test
    fun case_1() {
        val output = firstMissingPositive(intArrayOf(1, 2, 0))

        assertEquals(3, output)
    }

    @Test
    fun case_2() {
        val output = firstMissingPositive(intArrayOf(3, 4, -1, 1))

        assertEquals(2, output)
    }

    @Test
    fun case_3() {
        val output = firstMissingPositive(intArrayOf(7, 8, 9, 11, 12))

        assertEquals(1, output)
    }
}
