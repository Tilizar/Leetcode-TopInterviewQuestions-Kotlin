import kotlin.test.Test
import kotlin.test.assertContentEquals

private fun productExceptSelf(nums: IntArray): IntArray {
    val output = IntArray(nums.size) { 1 }

    var acc = 1
    for (i in nums.indices) {
        output[i] *= acc
        acc *= nums[i]
    }

    acc = 1
    for (i in nums.lastIndex downTo 0) {
        output[i] *= acc
        acc *= nums[i]
    }

    return output
}

class `238_Product_of_Array_Except_Self` {

    @Test
    fun case_1() {
        val output = productExceptSelf(intArrayOf(1, 2, 3, 4))

        assertContentEquals(intArrayOf(24, 12, 8, 6), output)
    }

    @Test
    fun case_2() {
        val output = productExceptSelf(intArrayOf(-1, 1, 0, -3, 3))

        assertContentEquals(intArrayOf(0, 0, 9, 0, 0), output)
    }
}
