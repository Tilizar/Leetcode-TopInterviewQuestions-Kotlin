import kotlin.test.Test
import kotlin.test.assertEquals

private fun search(nums: IntArray, target: Int): Int {
    if (nums[0] == target) return 0

    val searchInShiftedHalf = target < nums[0]

    var start = 0
    var end = nums.lastIndex

    while (start <= end) {
        val index = start + (end - start) / 2
        val value = nums[index]

        if (value == target) return index

        if (searchInShiftedHalf && value >= nums[0]) {
            start = index + 1
            continue
        }

        if (!searchInShiftedHalf && value < nums[0]) {
            end = index - 1
            continue
        }

        if (target > value) {
            start = index + 1
        } else {
            end = index - 1
        }
    }

    return -1
}

class `33_Search_in_Rotated_Sorted_Array` {

    @Test
    fun case_1() {
        val output = search(intArrayOf(4, 5, 6, 7, 0, 1, 2), 0)

        assertEquals(4, output)
    }

    @Test
    fun case_2() {
        val output = search(intArrayOf(4, 5, 6, 7, 0, 1, 2), 3)

        assertEquals(-1, output)
    }

    @Test
    fun case_3() {
        val output = search(intArrayOf(1), 0)

        assertEquals(-1, output)
    }
}
