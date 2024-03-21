import kotlin.test.Test
import kotlin.test.assertContentEquals

private fun searchRange(nums: IntArray, target: Int): IntArray {
    var leftStart = 0
    var leftEnd = nums.lastIndex

    var rightStart = 0
    var rightEnd = nums.lastIndex

    var leftIndex = -1
    var rightIndex = -1

    while (leftStart <= leftEnd) {
        val midIndex = leftStart + (leftEnd - leftStart) / 2
        val mid = nums[midIndex]
        if (target > mid) {
            leftStart = midIndex + 1
        } else {
            if (mid == target) {
                leftIndex = midIndex
            }
            leftEnd = midIndex - 1
        }
    }

    while (rightStart <= rightEnd) {
        val midIndex = rightStart + (rightEnd - rightStart) / 2
        val mid = nums[midIndex]
        if (target >= mid) {
            if (mid == target) {
                rightIndex = midIndex
            }
            rightStart = midIndex + 1
        } else {
            rightEnd = midIndex - 1
        }
    }

    return intArrayOf(leftIndex, rightIndex)
}

class `34_Find_First_and_Last_Position_of_Element_in_Sorted_Array` {

    @Test
    fun case_1() {
        val output = searchRange(intArrayOf(5, 7, 7, 8, 8, 10), 8)

        assertContentEquals(intArrayOf(3, 4), output)
    }

    @Test
    fun case_2() {
        val output = searchRange(intArrayOf(5, 7, 7, 8, 8, 10), 6)

        assertContentEquals(intArrayOf(-1, -1), output)
    }

    @Test
    fun case_3() {
        val output = searchRange(intArrayOf(), 0)

        assertContentEquals(intArrayOf(-1, -1), output)
    }
}
