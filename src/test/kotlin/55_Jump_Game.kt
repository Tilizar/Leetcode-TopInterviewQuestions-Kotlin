import kotlin.test.Test
import kotlin.test.assertEquals

private fun canJump(nums: IntArray): Boolean {
    var targetPosition = nums.lastIndex

    for (i in nums.lastIndex - 1 downTo 0) {
        val current = nums[i]
        if (i + current >= targetPosition) {
            targetPosition = i
        }
    }

    return targetPosition == 0
}

class `55_Jump_Game` {

    @Test
    fun case_1() {
        val output = canJump(intArrayOf(2, 3, 1, 1, 4))

        assertEquals(true, output)
    }

    @Test
    fun case_2() {
        val output = canJump(intArrayOf(3, 2, 1, 0, 4))

        assertEquals(false, output)
    }
}
