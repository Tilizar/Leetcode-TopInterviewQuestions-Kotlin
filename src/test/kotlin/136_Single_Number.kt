import kotlin.test.Test
import kotlin.test.assertEquals

private fun singleNumber(nums: IntArray): Int {
    nums.sort()

    var pointer = 0

    while (pointer < nums.size) {
        if (pointer == nums.lastIndex || nums[pointer] != nums[pointer + 1]) {
            return nums[pointer]
        }
        pointer += 2
    }

    throw IllegalStateException()
}

class `136_Single_Number` {

    @Test
    fun case_1() {
        val output = singleNumber(intArrayOf(2, 2, 1))

        assertEquals(1, output)
    }

    @Test
    fun case_2() {
        val output = singleNumber(intArrayOf(4, 1, 2, 1, 2))

        assertEquals(4, output)
    }

    @Test
    fun case_3() {
        val output = singleNumber(intArrayOf(1))

        assertEquals(1, output)
    }
}
