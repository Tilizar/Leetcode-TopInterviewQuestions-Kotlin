import kotlin.test.Test
import kotlin.test.assertContentEquals

private fun moveZeroes(nums: IntArray) {
    var lastNonZeroIndex = 0

    nums.forEach {
        if (it != 0) {
            nums[lastNonZeroIndex] = it
            lastNonZeroIndex++
        }
    }

    for (i in lastNonZeroIndex..nums.lastIndex) {
        nums[i] = 0
    }
}

class `283_Move_Zeroes` {

    @Test
    fun case_1() {
        val array = intArrayOf(0, 1, 0, 3, 12)
        moveZeroes(array)

        assertContentEquals(intArrayOf(1, 3, 12, 0, 0), array)
    }

    @Test
    fun case_2() {
        val array = intArrayOf(0)
        moveZeroes(array)

        assertContentEquals(intArrayOf(0), array)
    }
}
