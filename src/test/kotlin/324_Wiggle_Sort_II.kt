import kotlin.test.Test
import kotlin.test.assertContentEquals

private fun wiggleSort(nums: IntArray) {
    val sorted = nums.sorted()
    var j = nums.lastIndex

    for (i in 1 until nums.size step 2) {
        nums[i] = sorted[j--]
    }

    for (i in 0 until nums.size step 2) {
        nums[i] = sorted[j--]
    }
}

class `324_Wiggle_Sort_II` {

    @Test
    fun case_1() {
        val array = intArrayOf(1, 5, 1, 1, 6, 4)

        wiggleSort(array)

        val expected = intArrayOf(1, 6, 1, 5, 1, 4)

        assertContentEquals(expected, array)
    }

    @Test
    fun case_2() {
        val array = intArrayOf(1, 3, 2, 2, 3, 1)

        wiggleSort(array)

        val expected = intArrayOf(2, 3, 1, 3, 1, 2)

        assertContentEquals(expected, array)
    }
}
