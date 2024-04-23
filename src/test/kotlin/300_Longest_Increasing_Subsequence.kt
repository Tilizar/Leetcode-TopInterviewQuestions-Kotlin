import kotlin.math.max
import kotlin.test.Test
import kotlin.test.assertEquals

private fun lengthOfLIS(nums: IntArray): Int {
    val lengths = IntArray(nums.size) { 1 }
    var output = 1

    for (i in nums.lastIndex downTo 0) {
        for (j in i + 1..nums.lastIndex) {
            if (nums[i] < nums[j]) {
                val currentLength = max(lengths[i], lengths[j] + 1)
                lengths[i] = currentLength
                output = max(output, currentLength)
            }
        }
    }

    return output
}

class `300_Longest_Increasing_Subsequence` {

    @Test
    fun case_1() {
        val output = lengthOfLIS(intArrayOf(10, 9, 2, 5, 3, 7, 101, 18))

        assertEquals(4, output)
    }

    @Test
    fun case_2() {
        val output = lengthOfLIS(intArrayOf(0, 1, 0, 3, 2, 3))

        assertEquals(4, output)
    }

    @Test
    fun case_3() {
        val output = lengthOfLIS(intArrayOf(7, 7, 7, 7, 7, 7, 7))

        assertEquals(1, output)
    }
}
