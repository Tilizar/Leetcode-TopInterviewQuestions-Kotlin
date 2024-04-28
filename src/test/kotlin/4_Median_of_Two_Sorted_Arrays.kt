import kotlin.test.Test
import kotlin.test.assertEquals

private fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    val nums = IntArray(nums1.size + nums2.size)

    var pointer = 0
    nums1.forEach { nums[pointer++] = it }
    nums2.forEach { nums[pointer++] = it }

    nums.sort()

    return if (nums.size % 2 == 0) {
        (nums[nums.size / 2 - 1] + nums[nums.size / 2]) / 2.0
    } else {
        nums[nums.size / 2].toDouble()
    }
}

class `4_Median_of_Two_Sorted_Arrays` {

    @Test
    fun case_1() {
        val output = findMedianSortedArrays(intArrayOf(1, 3), intArrayOf(2))

        assertEquals(2.0, output)
    }

    @Test
    fun case_2() {
        val output = findMedianSortedArrays(intArrayOf(1, 2), intArrayOf(3, 4))

        assertEquals(2.5, output)
    }
}
