import kotlin.math.max
import kotlin.test.Test
import kotlin.test.assertEquals

class `128_Longest_Consecutive_Sequence` {

    fun longestConsecutive(nums: IntArray): Int {
        val set = nums.toSet()
        var output = 0

        for (num in nums) {
            if (set.contains(num - 1)) continue
            var count = 1
            while (set.contains(num + count)) {
                count++
            }
            output = max(output, count)
        }

        return output
    }

    @Test
    fun case_1() {
        val output = longestConsecutive(intArrayOf(100, 4, 200, 1, 3, 2))

        assertEquals(4, output)
    }

    @Test
    fun case_2() {
        val output = longestConsecutive(intArrayOf(0, 3, 7, 2, 5, 8, 4, 6, 0, 1))

        assertEquals(9, output)
    }
}
