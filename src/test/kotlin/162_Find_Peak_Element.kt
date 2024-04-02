import kotlin.test.Test
import kotlin.test.assertEquals

private fun findPeakElement(nums: IntArray): Int {
    var left = 0
    var right = nums.lastIndex

    while (left <= right) {
        val mid = left + (right - left) / 2
        val leftSmaller = mid == 0 || nums[mid] > nums[mid - 1]
        val rightSmaller = mid == nums.lastIndex || nums[mid] > nums[mid + 1]

        if (leftSmaller && rightSmaller) {
            return mid
        } else if (leftSmaller) {
            left = mid + 1
        } else {
            right = mid - 1
        }
    }

    return -1
}

class `162_Find_Peak_Element` {

    @Test
    fun case_1() {
        val output = findPeakElement(intArrayOf(1, 2, 3, 1))

        assertEquals(2, output)
    }

    @Test
    fun case_2() {
        val output = findPeakElement(intArrayOf(1, 2, 1, 3, 5, 6, 4))

        assertEquals(5, output)
    }
}
