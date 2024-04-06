import kotlin.test.Test
import kotlin.test.assertContentEquals

private fun IntArray.reverse(from: Int, till: Int) {
    var left = from
    var right = till

    while (left < right) {
        val tmp = this[left]
        this[left] = this[right]
        this[right] = tmp
        left++
        right--
    }
}

private fun rotate(nums: IntArray, k: Int) {
    val pivot = k % nums.size

    nums.reverse(0, nums.lastIndex)
    nums.reverse(0, pivot - 1)
    nums.reverse(pivot, nums.lastIndex)
}

class `189_Rotate_Array` {

    @Test
    fun case_1() {
        val array = intArrayOf(1, 2, 3, 4, 5, 6, 7)

        rotate(array, 3)

        assertContentEquals(intArrayOf(5, 6, 7, 1, 2, 3, 4), array)
    }

    @Test
    fun case_2() {
        val array = intArrayOf(-1, -100, 3, 99)

        rotate(array, 2)

        assertContentEquals(intArrayOf(3, 99, -1, -100), array)
    }
}
