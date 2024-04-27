import kotlin.test.Test
import kotlin.test.assertEquals

private fun increasingTriplet(nums: IntArray): Boolean {
    if (nums.size < 3) return false

    var firstMinimum = Int.MAX_VALUE
    var secondMinimum = Int.MAX_VALUE

    for (num in nums) {
        when {
            num <= firstMinimum -> firstMinimum = num
            num <= secondMinimum -> secondMinimum = num
            else -> return true
        }
    }

    return false
}

class `334_Increasing_Triplet_Subsequence` {

    @Test
    fun case_1() {
        val output = increasingTriplet(intArrayOf(1, 2, 3, 4, 5))

        assertEquals(true, output)
    }

    @Test
    fun case_2() {
        val output = increasingTriplet(intArrayOf(5, 4, 3, 2, 1))

        assertEquals(false, output)
    }

    @Test
    fun case_3() {
        val output = increasingTriplet(intArrayOf(2, 1, 5, 0, 4, 6))

        assertEquals(true, output)
    }
}
